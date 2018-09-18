## Cách đẩy code lên repo
### Một vài lưu ý:
- Đẩy lên đúng folder của mình (cấu trúc là *Group/MSSV/Lab*)
- Chỉ được phép sửa đổi trong thư mục của mình, nghiêm cấm sửa đổi trong folder của người khác (rất nguy hiểm nếu xóa code của người khác đi)
- Nguyên tắc pull trước khi push
### Hướng dẫn cơ bản (sử dụng Github Desktop):
Yêu cầu chung: cài đặt và đăng nhập vào app như trong Guide mình đã đưa.
1. Với lần đầu tiên
- Nếu bạn chưa clone repo về
Chọn File -> Clone repository. Popup hiện lên, chọn đúng repo tại tab đầu tiên (Github.com), or chuyển sang tab Url và paste link repo vào. 
![alt text](https://raw.githubusercontent.com/oopuet/oop_resource/master/resources/clone.png)
- Nếu bạn đã clone từ trước đó (sử dụng cmd or others)
Chọn File -> Add local repository, chọn tới folder chứa repo tại local (folder chứa thư mục .git).
![alt text](https://raw.githubusercontent.com/oopuet/oop_resource/master/resources/add_local.PNG)
2. Với các lần sau:
- Đảm bảo đã chọn đúng repo, tại trên cùng bên trái 'Current repository'
- Chọn 'Fetch origin' tại bên phải trên cùng, nếu có xuất hiện 'Pull origin', click để pull change từ server về.
![alt text](https://raw.githubusercontent.com/oopuet/oop_resource/master/resources/pull.PNG)
- Nếu chưa copy mã nguồn thì các bạn copy mã nguồn của mình vào đúng folder, chọn các file thay đổi (bỏ tick những file không push lên, ví dụ như file .class). Thêm commit message, chọn 'commit to master' ở dưới.
![alt text](https://raw.githubusercontent.com/oopuet/oop_resource/master/resources/commit.PNG)
- click chọn 'push origin' để push lên server
![alt text](https://raw.githubusercontent.com/oopuet/oop_resource/master/resources/push.PNG)
- Cuối cùng lên http://github.com để check lại xem mình đã commit chưa nhé 🙃
