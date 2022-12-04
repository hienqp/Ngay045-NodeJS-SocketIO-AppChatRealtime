package com.hienqp.appchatrealtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URISyntaxException;
import java.util.ArrayList;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class MainActivity extends AppCompatActivity {

    ListView lvUser, lvChat;
    EditText edtContent;
    ImageButton btnAdd, btnSend;

    private Socket mSocket;

    ArrayList<String> userArray;
    ArrayAdapter userAdapter;

    ArrayList<String> chatArray;
    ArrayAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        try {
            mSocket = IO.socket("http://192.168.1.8:3000/"); // Android không hiểu localhost (không giống Web) nên phải thay thế bằng IP của Server đang hoạt động
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        mSocket.connect();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String regUserName = edtContent.getText().toString().trim();
                if (regUserName.length() > 0) {
                    mSocket.emit("client_register_user", regUserName);
                }
            }
        });

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chatContent = edtContent.getText().toString().trim();
                if (chatContent.length() > 0) {
                    mSocket.emit("client_send_chat", chatContent);
                }
            }
        });

        mSocket.on("server_send_result", onRetrieveResult);

        mSocket.on("server_send_userList", onRetrieveUsrList);

        mSocket.on("server_send_chat", onListChat);

        // khởi tạo Array và Adapter user List
        userArray = new ArrayList<>();
        userAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, userArray);
        // kết nối Adapter đến ListView
        lvUser.setAdapter(userAdapter);

        // khởi tạo Array và Adapter chat List
        chatArray = new ArrayList<>();
        chatAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, chatArray);
        // kết nối Adapter đến ListView
        lvChat.setAdapter(chatAdapter);
    }

    private Emitter.Listener onListChat = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject jsonObject = (JSONObject) args[0];
                    try {
                        String chatContent = jsonObject.getString("chatContent");
                        chatArray.add(chatContent);
                        chatAdapter.notifyDataSetChanged();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    };

    private Emitter.Listener onRetrieveUsrList = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject object = (JSONObject) args[0];
                    try {
                        JSONArray array = object.getJSONArray("usrList");

                        // trước khi duyệt lần lượt phần tử trong mảng và đổ lên listview, ta cần clear() array
                        // nếu không mỗi lần có client đăng ký user server lại emit dữ liệu về, listview sẽ bị trùng lặp dữ liệu
                        userArray.clear();
                        for (int i = 0; i < array.length(); i++) {
                            String usrName = array.getString(i);
                            userArray.add(usrName);
                        }
                        // cập nhật lại Adapter
                        userAdapter.notifyDataSetChanged();

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    };

    private Emitter.Listener onRetrieveResult = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    // server NodeJS  luôn emit về client 1 JSONObject
                    JSONObject jsonObject = (JSONObject) args[0];
                    try {
                        // khai báo biến boolean để hứng giá trị boolean theo tên của JSONObject
                        boolean isUsrExist = jsonObject.getBoolean("regResult"); // regResult : name của JSONObject mà server emit về client
                        if (isUsrExist) {
                            Toast.makeText(MainActivity.this, "Tài khoản này đã tồn tại", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    };


    private void AnhXa() {
        btnAdd = findViewById(R.id.imageButtonAdd);
        btnSend = findViewById(R.id.imageButtonSend);
        edtContent = findViewById(R.id.editTextContent);
        lvUser = findViewById(R.id.listviewUser);
        lvChat = findViewById(R.id.listviewChat);
    }
}