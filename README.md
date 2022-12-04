__XÂY DỰNG ỨNG DỤNG CHAT REALTIME SỬ DỤNG NODE JS SOCKET IO__

- trong phần này ta sẽ xây dựng ứng dụng chat realtime (thời gian thực) thông qua server được điểu khiển bởi Node JS
- ứng dụng chat realtime phổ biến hiện nay như Zalo, Messenger, ... đều là những ứng dụng chat realtime, khi 1 user gửi 1 text cho 1 user khác, thì ngay lập tức cả trên 2 thiết bị đều sẽ hiển thị text lên màn hình của user (client)
- để làm được điều này, server sẽ thực hiện việc __On__ (lắng nghe) các __Emit__ (phát tín hiệu) của các client, sau đó trả kết quả về các client hoặc chính client vừa emit

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/motahoatdongcuaserver.png">

___
___

__NODE JS LÀ GÌ__

- NodeJS là một môi trường runtime chạy JavaScript đa nền tảng và có mã nguồn mở, được sử dụng để chạy các ứng dụng web bên ngoài trình duyệt của client.

___
ƯU ĐIỂM CỦA NODE JS

- IO hướng sự kiện không đồng bộ, cho phép xử lý nhiều yêu cầu đồng thời.
- Sử dụng JavaScript – một ngôn ngữ lập trình dễ học.
- Chia sẻ cùng code ở cả phía client và server.
- NPM(Node Package Manager) và module Node đang ngày càng phát triển mạnh mẽ.
- Cộng đồng hỗ trợ tích cực.
- Cho phép stream các file có kích thước lớn.

___
NHƯỢC ĐIỂM CỦA NODE JS

- Không có khả năng mở rộng, vì vậy không thể tận dụng lợi thế mô hình đa lõi trong các phần cứng cấp server hiện nay.
- Khó thao tác với cơ sử dữ liệu quan hệ.
- Mỗi callback sẽ đi kèm với rất nhiều callback lồng nhau khác.
- Cần có kiến thức tốt về JavaScript.
- Không phù hợp với các tác vụ đòi hỏi nhiều CPU.

___
NHỮNG ỨNG DỤNG NÊN SỬ DỤNG NODE JS

- Ứng dụng trò chuyện trong thời gian thực: Nhờ vào cấu trúc không đồng bộ đơn luồng, Node.JS rất thích hợp cho mục đích xử lý giao tiếp trong thời gian thực. Nền tảng này có thể dễ dàng mở rộng quy mô và thường dùng để tạo ra các chatbot. Bên cạnh đó, các tính năng liên quan đến ứng dụng trò chuyện như: chat nhiều người, thông báo đẩy,… cũng có thể dễ dàng được bổ sung nhờ NodeJS.
- Internet of Things (IoT): Các ứng dụng IoT thường bao gồm nhiều bộ cảm biến phức tạp để gửi những phần dữ liệu nhỏ. Node.JS là một lựa chọn lý tưởng để xử lý các yêu cầu đồng thời này với tốc độ cực nhanh.
- Truyền dữ liệu: Netflix là một trong số những công ty lớn trên thế giới chuyên sử dụng Node.JS cho mục đích truyền dữ liệu. Sở dĩ vì đây là một nền tảng nhẹ và cực nhanh, đồng thời còn cung cấp một API chuyên dùng để stream.
- Các SPA (Single-page application) phức tạp: Trong SPA, toàn bộ ứng dụng được load vào trong một trang duy nhất, do đó sẽ có một số request được thực hiện trong nền. Vòng lặp sự kiện (event loop) của Node.JS cho phép xử lý các request theo hướng non-blocking.
- Các ứng dụng REST dựa trên API: JavaScript được sử dụng trong cả frontend lẫn backend của trang. Do đó một server có thể dễ dàng giao tiếp với frontend qua REST API bằng Node.js. Bên cạnh đó, Node.JS còn cung cấp nhiều package như Express.js hay Koa để việc xây dựng ứng dụng web trở nên dễ dàng hơn bao giờ hết.

___
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

___
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

___
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

___
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

___
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

___
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

___
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

___
___
___

__XÂY DỰNG GIAO DIỆN APP CHAT REALTIME__

- sau khi thực hiện xây dựng server, chạy thử, kiểm tra emit và on giữa server và client, ta tiến hành thực hiện xây dựng app chat realtime
- app chat realtime sẽ có giao diện như sau:

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/appChatRealtimeSketch.png">

- ta cần chuẩn bị 2 icon add friend và send message, 1 background

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/iconAndBackground.png">

___
LAYOUT CHO MAIN ACTIVITY

- file Layout của MainActivity ta thiết kế như sau
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/background_app_chat"
    android:orientation="vertical"
    android:padding="3dp"
    android:weightSum="10"
    tools:context=".MainActivity">

    <ListView
        android:id="@+id/listviewUser"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="2" />

    <TextView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:gravity="center_vertical"
        android:text="Nội dung chat: "
        android:textColor="@color/design_default_color_on_primary"
        android:textSize="20sp" />

    <ListView
        android:id="@+id/listviewChat"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="6" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:orientation="horizontal"
        android:weightSum="10">

        <EditText
            android:id="@+id/editTextContent"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="8"
            android:hint="Input here..."
            android:textColor="@color/design_default_color_on_primary"
            android:textColorHint="@color/design_default_color_on_primary" />

        <ImageButton
            android:id="@+id/imageButtonAdd"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@null"
            android:src="@drawable/ico_add_friend" />

        <ImageButton
            android:id="@+id/imageButtonSend"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="@null"
            android:src="@drawable/ico_send_message" />

    </LinearLayout>
</LinearLayout>
```

- preview trên Android Studio ta sẽ được như sau

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/previewMainActivityLayout.png">

___

KHAI BÁO ÁNH XẠ CÁC VIEW TRÊN LAYOUT CỦA MAIN ACTIVITY

- ta tiến khai khai báo và ánh xạ các thành phần trên layout của MainActivity đã thiết kế
    - ListView user (hiển thị danh sách bạn bè), chat (hiển thị danh sách nội dung của tất cả mọi người)
    - EditText content (input nội dung chat)
    - ImageButton add (dùng để thêm bạn), send (dùng để gửi nội dung nhập vào editText content)
- file MainActivity.java sẽ có nội dung như sau
```java
public class MainActivity extends AppCompatActivity {

    ListView lvUser, lvChat;
    EditText edtContent;
    ImageButton btnAdd, btnSend;

    private Socket mSocket;

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


    private void AnhXa() {
        btnAdd = findViewById(R.id.imageButtonAdd);
        btnSend = findViewById(R.id.imageButtonSend);
        edtContent = findViewById(R.id.editTextContent);
        lvUser = findViewById(R.id.listviewUser);
        lvChat = findViewById(R.id.listviewChat);
    }
}
```    

___
___

CÁC SỰ KIỆN QUẢN LÝ ĐĂNG KÝ USER GIỮA CÁC CLIENT VÀ SERVER

- giữa client và server: 
    - client emit đăng ký tên user lên server: ``client_register_user``
    - server emit kết quả xử lý việc đăng ký user cho client: ``server_send_result``
- giữa server và các client:
    - server emit danh sách user được đăng ký đến các client: ``server_send_user_list`` 

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/cacEventGiuaClientVaServer.png">

___

SỰ KIỆN CLIENT ĐĂNG KÝ USER LÊN SERVER

- sự kiện đầu tiên client connect() đến server là sự kiện mặc định ban đầu bắt buộc
- tiếp theo ta xử lý sự kiện, client (app Android) sẽ emit 1 sự kiện có tên ``client_register_user`` đến server để thông báo việc đăng ký user lên server
- đầu tiên ta sẽ xử lý logic ở client, khi client emit đăng ký user đến server
    - buttonAdd user sẽ được bắt sự kiện Listener
    - trong sự kiện Listener ở buttonAdd sẽ lấy giá trị nhập vào edittext
    - sau đó client mSocket sẽ emit giá trị của edittext lên server

```java
        mSocket.connect();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtContent.getText().toString().trim().length() > 0) {
                    mSocket.emit("client_register_user", edtContent.getText().toString());
                }
            }
        });

//        mSocket.on("server_send_data", onRetrieveData);
//
//        mSocket.emit("client_send_data", "Lap trinh Android");
```

- ở server ta chỉnh sửa lại
    - trong sự kiện client socket connect đến server
    - ta bắt sự kiện on ``client_register_user`` của client socket đang kết nối đến server

```js
io.sockets.on('connection', function(socket){
    console.log("co thiet bi vua ket noi...");

    socket.on('client_register_user', function(data){
        console.log("server nhan dang ky: " + data);
    });
});
```

- có vấn đề xảy ra, vì user chỉ là duy nhất trên server, nhưng ở server lúc này chỉ đơn giản là client emit là server sẽ on mà không kiểm tra user đó đã có trên server hay chưa
- cách giải quyết là mỗi khi client emit sự kiện đăng ký user, server sẽ on sự kiện đó, nhưng server phải có 1 database hoặc ở đây đơn giản ta server sẽ chứa tên user vào 1 array, mỗi lần on sự kiện đăng ký user server sẽ kiểm tra user đó đã được đăng ký hay chưa

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

console.log("server running...");

var arrayUser = [];

io.sockets.on('connection', function(socket){
    console.log("co thiet bi vua ket noi...");

    socket.on('client_register_user', function(data){
        if (arrayUser.indexOf(data) == -1) {
            // user chưa được đăng ký vào mảng, nên index của nó nằm ngoài mảng là -1
            // vì là user mới nên sẽ được server ghi vào mảng (được đăng ký)
            arrayUser.push(data);
            console.log("server nhan dang ky: " + data);
        } else {
            console.log("da ton tai user: " + data);
        }
    });
});
```

- như vậy là server đã xử lý thành công việc client socket đăng ký, và kiểm tra user đã đăng ký trước đó hay chưa, nhưng lúc này chỉ có server nhận biết được kết quả thành công hay không, còn client socket vẫn chưa biết được, vì vậy ta cần server trả về kết quả đăng ký tên user cho client socket
- đối với việc server emit trả kết quả đăng ký user của client socket, thì chỉ trả về cho riêng client đã đăng ký, không thể vô lý trả kết quả đăng ký user của 1 client cho tất cả các client không liên quan khác
- để thuận tiện, ta đặt 1 biến ``boolean`` dùng để xác nhận sự tồn tại của user trên server, server sẽ dùng biến ``boolean`` này emit đến client vừa đăng ký user xem như là thông báo sự tồn tại của user trên server, server rút gọn được việc phải emit 2 lần ở ``if-else`` (nó sẽ dẫn đến client phải on 2 lần ở app)
- sau khi kiểm tra ở ``if-else`` và thiết lập giá trị xác nhận user cho biến ``boolean``, server sẽ emit biết ``boolean`` cho client như sau, lưu ý chỉ emit đến duy nhất đến client vừa emit đăng ký user, không emit đến các client không liên quan

```js
var arrayUser = [];
var regUsrResult = true;

io.sockets.on('connection', function(socket){
    console.log("co thiet bi vua ket noi...");

    socket.on('client_register_user', function(data){
        if (arrayUser.indexOf(data) == -1) {
            // user chưa được đăng ký vào mảng, nên index của nó nằm ngoài mảng là -1
            // vì là user mới nên sẽ được server ghi vào mảng (được đăng ký)
            regUsrResult = false; // user không tồn tại trên server
            arrayUser.push(data);
            console.log("server nhan dang ky: " + data);
        } else {
            regUsrResult = true; // user đã tồn tại trên server
            console.log("da ton tai user: " + data);
        }

        // server trả kết quả về duy nhất client vừa đăng ký user
        socket.emit('server_send_result', {regResult : regUsrResult})
    });
});
```

- quay trở lại app, sau khi server emit kết quả đăng ký user, client app phải on sự kiện này để lấy giá trị kết quả đăng ký thông báo cho người dùng app
- ta chỉnh sửa tên của Listener __onRetrieveData__ đã tạo để test chương trình trước đó thành __onRetrieveResult__
- trong Listener __onRetrieveResult__ ta khai báo biến boolean để hứng giá trị boolean mà server emit về app (client), if-else với mỗi giá trị tương ứng ta sẽ thông báo Toast cho người dùng biết user mà người dùng đăng ký đã tồn tại hay đăng ký thành công

```java
public class MainActivity extends AppCompatActivity {

    ListView lvUser, lvChat;
    EditText edtContent;
    ImageButton btnAdd, btnSend;

    private Socket mSocket;

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
                if (edtContent.getText().toString().trim().length() > 0) {
                    mSocket.emit("client_register_user", edtContent.getText().toString().trim());
                }
            }
        });

        mSocket.on("server_send_result", onRetrieveResult);
//
//        mSocket.emit("client_send_data", "Lap trinh Android");
    }


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
```

- trên Android Studio, để có thể chạy 2 emulator ở 2 cửa sổ riêng biệt, mở cửa sổ __Setting (Ctrl+Shift+S)__ của AndroidStudio, trong mục __Tool/Emulator__, bỏ dấu stick __Launch in a tool window__ thì các Emulator sẽ khởi chạy như 1 ứng dụng riêng biệt

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/settingChoEmulator2WindowTrongAndroidStudio.png">

- sau khi start 2 Emulator riêng biệt cho việc dễ dàng kiểm tra server có emit về từng client riêng biệt hay không, tiến hành chạy thử chương trình lên cả 2 Emulator, thực hiện việc đăng ký ở mỗi Emulator, kiểm tra việc đăng trùng user, và việc server emit về mỗi Emulator

___

SỰ KIỆN SERVER EMIT VỀ CÁC CLIENT DANH SÁCH USER ĐÃ ĐĂNG KÝ LÊN SERVER

- sau khi các client đăng ký user thành công, server phải gửi về danh sách các user cho các client biết được danh sách user mà client đang chat
- như vậy server sẽ emit danh sách mảng các user về cho các client, client sử dụng dữ liệu đổ ra listview hiển thị danh sách user
- ở đây, mỗi khi có 1 client đăng ký user thành công, server sẽ emit ngay lập tức danh sách user về cho các client
- khi server kiểm tra user đã tồn tại hay chưa, nếu chưa tồn tại, server cho phép đăng ký, ngay lập tức server cập nhật danh sách user và emit danh sách đó về cho các client

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

console.log("server running...");

var arrayUser = [];
var regUsrResult = true;

io.sockets.on('connection', function(socket){
    console.log("co thiet bi vua ket noi...");

    socket.on('client_register_user', function(data){
        if (arrayUser.indexOf(data) == -1) {
            // user chưa được đăng ký vào mảng, nên index của nó nằm ngoài mảng là -1
            // vì là user mới nên sẽ được server ghi vào mảng (được đăng ký)
            regUsrResult = false; // user không tồn tại trên server
            arrayUser.push(data);
            console.log("server nhan dang ky: " + data);

            // server emit danh sách user về tất cả các client
            io.sockets.emit('server_send_userList', {usrList : arrayUser});
        } else {
            regUsrResult = true; // user đã tồn tại trên server
            console.log("da ton tai user: " + data);
        }

        // server emit kết quả về duy nhất client vừa đăng ký user
        socket.emit('server_send_result', {regResult : regUsrResult})
    });
});
````

- ở client lúc này phải tạo sự kiện on để lấy danh sách user mà server emit về các client

```java
public class MainActivity extends AppCompatActivity {

    //...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //...

        mSocket.on("server_send_userList", onRetrieveUsrList);
    }

    private Emitter.Listener onRetrieveUsrList = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    JSONObject object = (JSONObject) args[0];
                    try {
                        JSONArray array = object.getJSONArray("usrList");
                        for (int i = 0; i < array.length(); i++) {
                            String usrName = array.getString(i);
                            Toast.makeText(MainActivity.this, usrName, Toast.LENGTH_SHORT).show();
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    };

    //...
}
```

- như đoạn code trên, sau khi client on sự kiện của server emit về, ta tạo callback Listener server emit, trong hành động Runnable sau khi lấy được JSONObject
    - lấy ra __value__ là JSONArray của JSONObject với __name__ tương ứng của JSONObject mà server emit về
    - sau khi có array user, ta chỉ cần duyệt qua từng phần từ và lấy nó ra
    - ở đây ta chỉ test bằng cách Toast lần lượt từng user lên màn hình app
- sau khi chạy thử nếu Toast thành công, tức là dữ liệu emit từ server về client, và client on bắt sự kiện thành công, ta sẽ đổ dữ liệu ra ListView

```java
public class MainActivity extends AppCompatActivity {

    ListView lvUser, lvChat;
    //...
    ArrayList<String> userArray;
    ArrayAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //...

        mSocket.on("server_send_userList", onRetrieveUsrList);

        // khai báo Array và Adapter
        userArray = new ArrayList<>();
        userAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, userArray);
        
        // kết nối Adapter đến ListView
        lvUser.setAdapter(userAdapter);

    }

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

    //...
}
```

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/setDataReceiveFromServerOntoListview.png">

___

SỰ KIỆN CLIENT EMIT NỘI DUNG CHAT SERVER ON - SERVER EMIT NỘI DUNG CHAT GIỮA CÁC CLIENT, CÁC CLIENT ON

- khi các client chat với nhau
    - client emit nội dung chat đó lên server, server sẽ on
    - server emit nội dung chat vừa nhận đươc đến các client
    - các client (bao gồm cả client gửi nội dung chat) sẽ on nội dung chat mà server emit để hiển thị lên màn hình
- lưu ý: trong khi chat sẽ có rất nhiều client emit liên tục, cần phân biệt nội dung chat của các client với nhau

CLIENT EMIT NỘI DUNG CHAT

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/eventSendChatContent.png">

- ở phía client, khi người dùng click vào btnSend, client sẽ lấy nội dung trong editText emit lên server
- như vậy ta cần bắt sự kiện click vào btnSend, và khai báo emit trong đó

```java
public class MainActivity extends AppCompatActivity {

    //...
    ImageButton btnAdd, btnSend;

    private Socket mSocket;

    //...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //...

        mSocket.connect();

        //...

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chatContent = edtContent.getText().toString().trim();
                if (chatContent.length() > 0) {
                    mSocket.emit("client_send_chat", chatContent);
                }
            }
        });

        //...
    }

    //...
}
```

- sau khi client emit, thì server phải on đúng sự kiện đó, ở file server __index.js__ ta thực hiện lắng nghe on sự kiện mà client emit nội dung chat, trong sự kiện server on lắng nghe client connect đến server
- lúc này trong sự kiện client connect đến server, ta có 2 sự kiện server on lắng nghe client
    - client emit đăng ký user
    - client emit nội dung chat của user
- trong sự kiện server on lắng nghe client connect đến server, ta tạo thêm sự kiện on lắng nghe client emit nội dung chat đến server, để kiểm tra ta xuất nội dung đó ra console của Git-Bash

```js
io.sockets.on('connection', function(socket){
    console.log("co thiet bi vua ket noi...");

    socket.on('client_register_user', function(data){
        //..
    });

    socket.on('client_send_chat', function(contentChat){
        console.log(contentChat);
    });
});
``` 

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/testChatContent.png">

- vấn đề lúc này, ta không phân biệt nội dung chat của các client, server hệ thống hay chương trình client có thể hiểu, nhưng người dùng hoặc người điều khiển server sẽ không biết, vì mỗi nội không xác định được client nào gửi
- để giải quyết vấn đề này ta phải nắm cách server và client hoạt động như sau
    - client __connect__ đến server
    - server __on__ lắng nghe sự kiện client connect và nhận lưu trữ 1 socket (socket hiểu là thiết bị client - nó đại diện cho chuỗi mã hóa mà chỉ server lưu trữ và quản lý)
    - trong chính sự kiện client connect đến server sẽ chứa các sự kiện __emit on__ qua lại giữa server và client
- như vậy, socket là tên đại diện cho client, nhưng nếu cố tình lấy socket in ra màn hình console ta chỉ nhận được    

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/errorPrintSocket.png">

- giải quyết vấn đề này như sau:
    - trong sự kiện __server on__ lắng nghe __client emit__ đăng ký user, ta gán biến __data__ (data là tên user được đăng ký) cho __socket.un__
    - lúc này __socket.un__ chính là tên user gắn liền với socket và được server quản lý cho những sự kiện sau (không sử dụng biến data vì data chỉ là dữ liệu client gửi đi, không đại diện cho client-socket)

```js
io.sockets.on('connection', function(socket){
    console.log("co thiet bi vua ket noi...");

    socket.on('client_register_user', function(data){
        if (arrayUser.indexOf(data) == -1) {
            // user chưa được đăng ký vào mảng, nên index của nó nằm ngoài mảng là -1
            // vì là user mới nên sẽ được server ghi vào mảng (được đăng ký)
            regUsrResult = false; // user không tồn tại trên server
            arrayUser.push(data);
            console.log("server nhan dang ky: " + data);

            // thiết lập lại định danh cho socket-client connect đến server
            socket.un = data;

            // emit danh sách user về tất cả các client
            io.sockets.emit('server_send_userList', {usrList : arrayUser});
        } else {
            regUsrResult = true; // user đã tồn tại trên server
            console.log("da ton tai user: " + data);
        }

        // server trả kết quả về duy nhất client vừa đăng ký user
        socket.emit('server_send_result', {regResult : regUsrResult})
    });

    socket.on('client_send_chat', function(contentChat){
        console.log("---[" + socket.un + "]---: " + contentChat);
    });
});
```

- kết quả test chương trình

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/testSuccessNameAndChatContent.png">

- hiện giờ ta chỉ đang test trên server hiển thị nội dung chat cùng với tên chỉ định của client, nhưng ứng dụng chat là cuộc trò chuyện giữa các client, và các client phải thấy được nội dung chat với nhau, server phải emit nội dung chat mà client emit lên server cho các client trong hệ thống chat để người dùng có thể biết được mình và các client khác đang chat nội dung gì
- khi server on lắng nghe được client emit nội dung chat, ngay lập tức trong sự kiện server lắng nghe được nội dung chat, server ngay lập tức emit nội dung chat đó về cho tất cả các client trong toàn server

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/eventServerSendChatContent.png">

- ta thêm sự kiện server emit nội dung chat về cho các client trong sự kiện server on nội dung chat từ client emit lên server

```js
    socket.on('client_send_chat', function(contentChat){
        console.log("---[" + socket.un + "]---: " + contentChat);

        io.sockets.emit('server_send_chat', {chatContent : "---[" + socket.un + "]---: " + contentChat});
    });
```

- bây giờ phía client phải on lắng nghe sự kiện server emit nội dung chat về
- khai báo data và adapter
```java
    ArrayList<String> chatArray;
    ArrayAdapter chatAdapter;
```
- trong onCreate khởi tạo data và adapter
```java
        // khởi tạo Array và Adapter chat List
        chatArray = new ArrayList<>();
        chatAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, chatArray);
        // kết nối Adapter đến ListView
        lvChat.setAdapter(chatAdapter);
```
- trong onCreate gọi on lắng nghe sự kiện __server_send_chat__ từ server emit về
```java
        mSocket.on("server_send_chat", onListChat);
```
- __onListChat__ là callback do ta dựng dùng để lắng nghe sự kiện của __Emitter.Listener__
- trong MainActivity ta tạo callback này như sau
```java
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
```
- lưu ý là khác với userList, chatList này không cần clear() array
    - ở userList, trên server sẽ giữ 1 array user, mỗi lần thêm user server sẽ emit 1 lần, nên tránh trùng lặp ở client ta phải clear array
    - ở chatList, server on được nội dung chat nào, sẽ emit nội dung chat đó ngay lặp tức, nếu client clear array, sẽ mất những đoạn chat trước đó, vì server ở đây ta xây dựng không có lưu lại nội dung chat nhận được từ client
- kết quả test nội dung chat giữa 2 client

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/testListChat.png">
