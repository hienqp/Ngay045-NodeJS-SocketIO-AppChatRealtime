__XÂY DỰNG ỨNG DỤNG CHAT REALTIME SỬ DỤNG NODE JS SOCKET IO__

- trong phần này ta sẽ xây dựng ứng dụng chat realtime (thời gian thực) thông qua server được điểu khiển bởi Node JS
- ứng dụng chat realtime phổ biến hiện nay như Zalo, Messenger, ... đều là những ứng dụng chat realtime, khi 1 user gửi 1 text cho 1 user khác, thì ngay lập tức cả trên 2 thiết bị đều sẽ hiển thị text lên màn hình của user (client)
- để làm được điều này, server sẽ thực hiện việc __On__ (lắng nghe) các __Emit__ (phát tín hiệu) của các client, sau đó trả kết quả về các client hoặc chính client vừa emit

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/motahoatdongcuaserver.png">

___
___

__NODE JS LÀ GÌ__

- NodeJS là một môi trường runtime chạy JavaScript đa nền tảng và có mã nguồn mở, được sử dụng để chạy các ứng dụng web bên ngoài trình duyệt của client.

ƯU ĐIỂM CỦA NODE JS

- IO hướng sự kiện không đồng bộ, cho phép xử lý nhiều yêu cầu đồng thời.
- Sử dụng JavaScript – một ngôn ngữ lập trình dễ học.
- Chia sẻ cùng code ở cả phía client và server.
- NPM(Node Package Manager) và module Node đang ngày càng phát triển mạnh mẽ.
- Cộng đồng hỗ trợ tích cực.
- Cho phép stream các file có kích thước lớn.

NHƯỢC ĐIỂM CỦA NODE JS

- Không có khả năng mở rộng, vì vậy không thể tận dụng lợi thế mô hình đa lõi trong các phần cứng cấp server hiện nay.
- Khó thao tác với cơ sử dữ liệu quan hệ.
- Mỗi callback sẽ đi kèm với rất nhiều callback lồng nhau khác.
- Cần có kiến thức tốt về JavaScript.
- Không phù hợp với các tác vụ đòi hỏi nhiều CPU.

NHỮNG ỨNG DỤNG NÊN SỬ DỤNG NODE JS

- Ứng dụng trò chuyện trong thời gian thực: Nhờ vào cấu trúc không đồng bộ đơn luồng, Node.JS rất thích hợp cho mục đích xử lý giao tiếp trong thời gian thực. Nền tảng này có thể dễ dàng mở rộng quy mô và thường dùng để tạo ra các chatbot. Bên cạnh đó, các tính năng liên quan đến ứng dụng trò chuyện như: chat nhiều người, thông báo đẩy,… cũng có thể dễ dàng được bổ sung nhờ NodeJS.
- Internet of Things (IoT): Các ứng dụng IoT thường bao gồm nhiều bộ cảm biến phức tạp để gửi những phần dữ liệu nhỏ. Node.JS là một lựa chọn lý tưởng để xử lý các yêu cầu đồng thời này với tốc độ cực nhanh.
- Truyền dữ liệu: Netflix là một trong số những công ty lớn trên thế giới chuyên sử dụng Node.JS cho mục đích truyền dữ liệu. Sở dĩ vì đây là một nền tảng nhẹ và cực nhanh, đồng thời còn cung cấp một API chuyên dùng để stream.
- Các SPA (Single-page application) phức tạp: Trong SPA, toàn bộ ứng dụng được load vào trong một trang duy nhất, do đó sẽ có một số request được thực hiện trong nền. Vòng lặp sự kiện (event loop) của Node.JS cho phép xử lý các request theo hướng non-blocking.
- Các ứng dụng REST dựa trên API: JavaScript được sử dụng trong cả frontend lẫn backend của trang. Do đó một server có thể dễ dàng giao tiếp với frontend qua REST API bằng Node.js. Bên cạnh đó, Node.JS còn cung cấp nhiều package như Express.js hay Koa để việc xây dựng ứng dụng web trở nên dễ dàng hơn bao giờ hết.

NHỮNG KẾT LUẬN SAI LẦM VỀ NODE JS

- Đầu tiên, NodeJS là một nền tảng (platform) chứ không phải một web framework như một số người thường nhầm lẫn.
- Thứ hai, Node.JS cũng không phải là một ngôn ngữ lập trình mà là một môi trường runtime dùng để chạy JavaScript bên ngoài trình duyệt. Vì vậy để học và sử dụng NodeJS thì người dùng cần có những kiến thức nhất định về một số giao thức, JavaScript hay kỹ thuật lập trình,…
- Và cuối cùng, một câu hỏi phổ biến của người dùng là: Node.JS là backend hay frontend? Thật ra Node.JS có thể được sử dụng như một frontend lẫn backend nhờ vào các framework như Express.js hay Meteor.js. Một số stack phổ biến như MERN sử dụng Express.js làm backend. Bên cạnh đó, nhiều thành phần cũng có thể được tái sử dụng giữa backend và frontend vô cùng tiện lợi.

___


__CÀI ĐẶT NODE JS VÀ GIT__

- NodeJS là platform, 1 môi trường runtime để chạy JavaScript ở phía Server, vì vậy để sử dụng ta phải cài đặt nó
- đây chỉ là bài thực hành, nên ta sẽ sử dụng localhost làm server, nên ta sẽ cài đặt NodeJS vào máy tính cá nhân
- link download NodeJS -> [nodejs.org](https://nodejs.org/en/)

- Git là 1 ứng dụng dùng dòng lệnh điều khiển những ứng dụng không có giao diện (ví dụ: server)
- link download Git -> [git-scm.com](https://git-scm.com/)

- kiểm tra phiên bản NodeJS đã cài đặt trên máy hay chưa, ta chuột phải vào bất kỳ vị trí folder hay màn hình chọn Git Bash Here, 1 cửa sổ dòng lệnh sẽ hiển thị, nhập lệnh sau để kiểm tra NodeJS đã cài đặt hay chưa, nếu đã cài đặt thành công thì số phiên bản sẽ được in ra console

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/kiemtraversioncuanodejs.png">

- vì NodeJS là môi trường runtime để thực thi JavaScript, nên việc có kiến thức về cách sử dụng NodeJS là cần thiết
- link tham khảo tài liệu NodeJS -> [NodeJS Cơ Bản](http://online.khoapham.vn/nodejs/93-lap-trinh-nodejs-cho-nguoi-moi-bat-dau.html)

- vì NodeJS sử dụng ngôn ngữ JavaScript nên cần có kiến thức về JavaScript

___

__XÂY DỰNG SERVER LOCALHOST:3000 VỚI NODE JS__

SỬ DỤNG NODE PACKAGE MANAGER (npm) CÀI ĐẶT (install) CÁC MODULE CHO SERVER NODE JS

- vì đây là bài thực hành nên ta sẽ sử dựng máy tính cá nhân làm server localhost
- tạo 1 folder ở desktop với tên là __ServerSockerIO__, dùng để quản lý các file cấu hình của server cho app chat realtime

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/folderserverchoappchatrealtime.png">

- trong folder __ServerSockerIO__ ta tạo 1 file với tên chỉ định là __package.json__, file này dùng để quản lý các module ta sẽ cài đặt cho server __ServerSockerIO__
- __package.json__
```json
{
  "name": "ServerSockerIO",
  "version": "0.0.1",
  "private": "true",
  "dependencies": {
    "express": "*",
    "socket.io": "*",
    "socketio-file-upload": "^0.4.4"
  }
}
```
- __package.json__ là 1 dạng file JsonObject, nội dung của file
	- name : tên server
	- version : phiên bản server
	- private : mặc định là true
	- dependencies : là thành phần khai báo library chỉ định cài đặt cho server
		- express : thư viện express với dấu * là tùy chọn cài đặt bản mới nhất
		- socket.io : thư viện socket.io với dấu * là tùy chọn cài đặt bản mới nhất
		- socketio-file-upload : thư viện dùng để upload file, nếu không cần có thể delete, nếu delete phải delete luôn dấu , phía trước nó
- sau khi có file __package.json__, ta tiến hành thực thi file này để cài đặt các module cần thiết cho server phục vụ cho app chat realtime
- để thực thi file __package.json__, ta cần sử dụng Git trỏ đến folder chứa file __package.json__
	- chuột phải vào folder __ServerSockerIO__ chọn Git Bash Here hoặc hoặc mở Git Bash dùng lệnh cd để trỏ đến folder __ServerSockerIO__
	- trong cửa sổ dòng lệnh của Git Bash Here nhập lệnh: ``npm install`` sau đó click Enter (npm - Node Package Manager sẽ install các modules được yêu cầu trong __package.json__ vào __ServerSockerIO__)
- sau khi thực thi xong file __package.json__, folder server __ServerSocketIO__ sẽ generate folder __node_modules__ chứa các module ta yêu cầu trong __package.json__

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/completeInstallModulesForNodeJsServer.png">

THIẾT LẬP CẤU HÌNH EXPRESS

- Express là 1 Framework dành cho NodeJS, nó cung cấp nhiều tính năng mạnh mẽ trên nền tảng web cũng như các ứng dụng mobile
- Express hỗ rợ các phương thức HTTP và midleware tạo ra môt API vô cùng mạnh mẽ và dễ sử dụng.
- Có thể tổng hợp một số chức năng chính của express như sau:
	- Thiết lập các lớp trung gian để trả về các HTTP request
	- Định nghĩa router cho phép sử dụng với các hành động khác nhau dựa trên phương thức HTTP và URL
	- Cho phép trả về các trang HTML dựa vào các tham số.
- ta đã cài đặt module Express cho NodeJS, ta tiến hành tạo 1 file dùng để cấu hình Express điều khiển ServerSocketIO, file cấu hình Express này được viết bởi ngôn ngữ JavaScript, đuôi mở rộng là ``.js``
- __index.js__
```js
const express = require('express');
const app = express();
const ServerSockerIO = require('http').createServer(app);
const io = require('socket.io')(ServerSockerIO);
const fs = require('fs');
ServerSockerIO.listen(process.env.PORT || 3000);

app.get("/", function(req, res){
    res.sendFile(__dirname + '/index.html');    
});
```
- 5 dòng đầu khai báo các biến yêu cầu các thư viện, lưu ý biến tên server phải trùng với tên server ta đặt tên ban đầu, và những vị trí sử dụng đến nó
- dòng 6 chỉ định server của ta thiết lập sẽ lắng nghe ở PORT 3000, số PORT này có thể thay đổi tùy theo mục đích
- dòng 8, 9, 10 dùng để gọi đến file ``index.html`` khi có yêu cầu gọi đến url localhost PORT 3000 từ trình duyệt web ở url mặc định, ``\"/"`` chỉ mặc định đến địa chỉ ngang hàng với folder server, 3 dòng này cũng được dùng để khi user nhập 1 địa chỉ web nó sẽ hiển thị file html mặc định thường thấy khi ta nhập 1 địa chỉ web bất kỳ, dòng này cũng được dùng để kiểm tra server có hoạt động hay không
- để khởi chạy server sau khi cấu hình Express, ta sử dụng Git Bash nhập lệnh sau ở folder của server ``node index.js``, nếu thành công con trỏ sẽ nhảy sang dòng kế tiếp trong cửa sổ dòng lệnh

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/lenhKhoiChayServer.png">

- tạo 1 file ``index.html`` với nội dung đơn giản để test server có hoạt động hay không
- __index.html__
```html
<h1>Android Node JS</h1>
```
- từ trình duyệt web ta nhập url ``localhost:3000``, nếu server hoạt động trình duyệt sẽ hiển thị __Android Node JS__

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/testServer.png">

___

__XÂY DỰNG APP ANDROID CHAT REALTIME KẾT NỐI ĐẾN SERVER NODE JS__

CÁC BƯỚC CHUẨN BỊ

- để App Android có thể kết nối đến server (ServerSocketIO) ta cần chuẩn bị
	- thư viện ``Socket IO`` hỗ trợ kết nối đên server NodeJs
	- xin quyền INTERNET ở AndroidManifest.xml
- để có thư viện SocketIO, ta truy cập link [https://socketio.github.io/socket.io-client-java/installation.html](https://socketio.github.io/socket.io-client-java/installation.html), trong mục Gradle copy đoạn code sau vào dependencies trong GradleScript:ModuleApp

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/librarySocketIoGradle.png">

```js
dependencies {

    implementation 'androidx.appcompat:appcompat:1.5.1'
    implementation 'com.google.android.material:material:1.7.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

    // triển khai thư viện socket io
    // https://socketio.github.io/socket.io-client-java/installation.html
    implementation ('io.socket:socket.io-client:2.1.0') {
        // excluding org.json which is provided by Android
        exclude group: 'org.json', module: 'json'
    }
}
```

THỰC HIỆN CONNECT APP ĐẾN SERVER

- trong MainActivity, khai báo biến kiểu ``Socket`` của package ``io.socket.client`` (thư viện của client)
- trong onCreate gán biến Socket cho method ``IO.socket(String)``, String là url đến server NodeJs, lưu ý là Android sẽ không hiểu localhost là gì (khác với lập trình web), do đó ``localhost`` ta sẽ thay thế bằng địa chỉ IP của server đang hoạt động
- sau đó gọi method connect() cho biến Socket

- __MainActivity.java__
```java
package com.hienqp.appchatrealtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;

public class MainActivity extends AppCompatActivity {

    private Socket mSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            mSocket = IO.socket("http://192.168.1.8:3000/");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        mSocket.connect();

    }
}
```

- Android không hiểu localhost (không giống Web) nên phải thay thế bằng IP của Server đang hoạt động thay cho ``localhost:3000``

LỆNH KIỂM TRA SERVER CÓ HOẠT ĐỘNG HAY KHÔNG

- thay vì khi thực hiện khởi chạy server với ``node index.js``, ta phải vào trình duyệt kiểm tra file ``index.html``, ta có thể viết dòng lệnh trong file cấu hình Express in ra console của Git Bash thông báo server đang hoạt động khi gọi lệnh ``node index.js``

- __index.js__
```js
const express = require('express');
const app = express();
const ServerSockerIO = require('http').createServer(app);
const io = require('socket.io')(ServerSockerIO);
const fs = require('fs');
ServerSockerIO.listen(process.env.PORT || 3000);

app.get("/", function(req, res){
    res.sendFile(__dirname + '/index.html');    
});

console.log("server running...")
```

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/testSeverByConsole.png">


LỆNH THÔNG BÁO CLIENT CONNECT SERVER

- khi có 1 thiết bị connect đến server (gọi là ``emit``) thì server làm nhiệm vụ lắng nghe (gọi là ``on``)
- ở app Android ta đã thực hiện connect mặc định đến server, nhưng ở server để biết có thiết bị kết nối đến hay không, ta phải gọi ``on`` để lắng nghe thiết bị yêu cầu connect, và ghi log lên console để có thể biết chính xác có thiết bị nào kết nối đến server hay chưa
- trong file ``index.js`` ở folder server ta thêm vào đoạn code ``on``
- __index.js__
```js
const express = require('express');
const app = express();
const ServerSockerIO = require('http').createServer(app);
const io = require('socket.io')(ServerSockerIO);
const fs = require('fs');
ServerSockerIO.listen(process.env.PORT || 3000);

app.get("/", function(req, res){
    res.sendFile(__dirname + '/index.html');    
});

console.log('server running...');

io.sockets.on('connection', function(socket){
    console.log("co thiet bi vua ket noi...");
});
```
- thực hiện đóng server bằng lệnh ``Ctrl+C`` trên Git Bash ở folder server, sau đó mở lại server với lệnh ``node index.js``, lúc này console chỉ thông báo ``server running...``
- trong file ``AndroidManifest.xml`` ở Android, ta thêm thuộc tính ``android:usesCleartextTraffic="true"`` cho thẻ ``/<application>``
- sau đó ta chạy thử app, ở giao diện console của Git Bash sẽ xuất hiện log thông báo __~co thiet bi vua ket noi...~__

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/testDeviceConnectServer.png">


GỬI DATA TỪ CLIENT SOCKET ĐẾN SERVER IO - EMIT ON

- để gửi data từ client (Android) đến server (NodeJS), client sẽ thực hiện lệnh ``emit(String, Object)``, trong đó String là tên sự kiện ``emit``, Object là data sẽ gửi đi (bất kỳ kiểu data cần gửi)
- trong MainActivity ta thêm lệnh gửi ``emit`` data ngay sau khi kết nối thành công đến server
- __MainActivity.java__
```java
public class MainActivity extends AppCompatActivity {

    private Socket mSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            mSocket = IO.socket("http://192.168.1.8:3000/"); // Android không hiểu localhost (không giống Web) nên phải thay thế bằng IP của Server đang hoạt động
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        mSocket.connect();

        mSocket.emit("client_send_data", "Lap trinh Android");
    }
}
```
- ở file điều khiển server ``index.js`` ta thêm lệnh ``on`` để lắng nghe ngay trong sự kiện mà client vừa kết nối, lưu ý khi ``on`` (lắng nghe) phải truyền đúng tên sự kiện kết nối tương ứng với data được emit từ client
- __index.js__
```js
const express = require("express");
const app = express();
const ServerSockerIO = require("http").createServer(app);
const io = require("socket.io")(ServerSockerIO);
const fs = require("fs");
ServerSockerIO.listen(process.env.PORT || 3000);

app.get("/", function(req, res){
    res.sendFile(__dirname + '/index.html');    
});

console.log("server running...");

io.sockets.on("connection", function(socket){
    console.log("co thiet bi vua ket noi...");

    socket.on("client_send_data", function(data){
        console.log("server nhan: " + data);
    });
});
```
- thực hiện ``Ctrl+C`` trên Git Bash để ngắt server hiện tại nếu đang bật, sau đó nhập lệnh ``node index.js`` để bật server, ở client ta chạy chương trình để thực thi lệnh ``connect()`` và ``emit()`` data đến server NodeJs, ta được kết quả sau

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/emitDataToNodeJs.png">

GỬI DATA TỪ SERVER IO ĐẾN CLIENT SOCKET VÀ CÁC CLIENTS SOCKETS - EMIT ON

- giả sử ngay khi ``io`` vừa ``on`` từ ``socket`` nào đó
    - ngay lập tức ``io`` sẽ ``emit`` đến tất cả các ``sockets`` 
    - hoặc chính ``socket`` vừa được ``on`` từ ``io``
- trường hợp ``io`` sẽ ``emit`` tới tất cả các ``sockets`` ngay sau khi ``on`` 1 ``socket`` nào đó, ta thêm lệnh ``emit`` ngay trong sự kiện ``on`` của ``socket`` đó
- và ``io`` sẽ ``emit`` về ``socket`` là data dạng JSONObject ``{name : value}``
```js
io.sockets.on('connection', function(socket){
    console.log("co thiet bi vua ket noi...");

    socket.on('client_send_data', function(data){
        console.log("server nhan: " + data);

        // trong sự kiện "on" từ "socket" cụ thể, "io" sẽ "emit" tới tất cả các "sockets"
        io.sockets.emit('server_send_data', {noi_dung : data});

        // trong sự kiện "on" từ "socket" cụ thể, "io" sẽ "emit" tới chính "socket" cụ thể đã "emit" tới "io"
        // socket.emit('socket_send_data', {noi_dung : data});
    });
});
```

- sau khi ``Server emit`` (phát), thì ``Socket on`` (nghe), mà Socket ở đây chính là App Android
- ngay sau khi App ``connect()`` đến Server, ta đặt 1 lệnh ``on`` để App lắng nghe khi đúng sự kiện khớp với tên chỉ định, thì App sẽ ``on`` và thực thi lệnh, có 2 tham số cần truyền vào là tên ``event``, và 1 function ``Listener``, function ta chưa có ta có thể đặt tên trước rồi thiết lập logic cho function đó sau, ví dụ đặt tên function Listener là ``onRetrieveData``

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/socketOn.png">

- ta tiến hành tạo function ``private`` có tên ``onRetrieveData`` với kiểu trả về là ``Emitter.Listener`` của ``io.socket.emitter``
- function này sẽ khởi tạo 1 đối tượng của ``Emitter.Listener``, Android Studio sẽ yêu cầu ta implements call() method

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/createFunctionEmitterListener.png">

- trong ``call(Object... args)`` nó nhận vào 1 Object (vì server có thể gửi về bất kỳ kiểu data, nên nó sẽ nhận vào cả 1 Object chung chung)
- và trên App không phải lúc nào ``call()`` method cũng chạy liên tục, chỉ khi nào Server emit về app đúng tên event mà App on thì Listener mới được kích hoạt, vì vậy ta sẽ phải xây dựng 1 tiến trình con trên giao diện user bằng cách gọi ``runOnUiThread(Runnable)`` và truyền vào 1 object anonymous Runnable cho nó, và implements run() method cho object Runnable

```java
    private Emitter.Listener onRetrieveData = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {

                }
            });
        }
    };
```    
- trong run() method này lúc này ta App mới có thể chính thức đọc được JSONObject mà Server emit về App
- MainActivty hoàn chỉnh như sau:
```java
public class MainActivity extends AppCompatActivity {

    private Socket mSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            mSocket = IO.socket("http://192.168.1.8:3000/"); // Android không hiểu localhost (không giống Web) nên phải thay thế bằng IP của Server đang hoạt động
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        mSocket.connect();

        mSocket.on("server_send_data", onRetrieveData);

        mSocket.emit("client_send_data", "Lap trinh Android");
    }

    private Emitter.Listener onRetrieveData = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject jsonObject = (JSONObject) args[0];
                    try {
                        String messageFromServer = jsonObject.getString("noi_dung");
                        Toast.makeText(MainActivity.this, messageFromServer, Toast.LENGTH_SHORT).show();
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    };
}
```