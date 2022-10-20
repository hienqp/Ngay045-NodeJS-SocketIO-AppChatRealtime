__XÂY DỰNG ỨNG DỤNG CHAT REALTIME SỬ DỤNG NODE JS SOCKET IO__

- trong phần này ta sẽ xây dựng ứng dụng chat realtime (thời gian thực) thông qua server được điểu khiển bởi Node JS
- ứng dụng chat realtime phổ biến hiện nay như Zalo, Messenger, ... đều là những ứng dụng chat realtime, khi 1 user gửi 1 text cho 1 user khác, thì ngay lập tức cả trên 2 thiết bị đều sẽ hiển thị text lên màn hình của user (client)
- để làm được điều này, server sẽ thực hiện việc __On__ (lắng nghe) các __Emit__ (phát tín hiệu) của các client, sau đó trả kết quả về các client hoặc chính client vừa emit

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/mo_ta_node_js_hoat_dong_o_server.png">

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

<img src="https://github.com/hienqp/Ngay045-NodeJS-SocketIO-AppChatRealtime/blob/main/kiem_tra_version_cua_node_js.png">

- vì NodeJS là môi trường runtime để thực thi JavaScript, nên việc có kiến thức về cách sử dụng NodeJS là cần thiết
- link tham khảo tài liệu NodeJS -> [NodeJS Cơ Bản](http://online.khoapham.vn/nodejs/93-lap-trinh-nodejs-cho-nguoi-moi-bat-dau.html)

- vì NodeJS sử dụng ngôn ngữ JavaScript nên cần có kiến thức về JavaScript

___

__XÂY DỰNG SERVER LOCALHOST:3000 VỚI NODE JS__

