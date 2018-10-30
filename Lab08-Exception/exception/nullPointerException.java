/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author CACLV
 */
public class nullPointerException {
 
    public static int nullPoiter() throws NullPointerException {
        
        // Gọi phương thức để lấy ra độ dài chuỗi.
        // NullPointerException sẽ xẩy ra tại đây.
        // Nó là ngoại lệ xuất hiện tại thời gian chạy (runtime).
        // (Kiểu RuntimeException).
        // Trình biên dịch (compiler) của Java không bắt buộc 
        
        // Đây là một biến có tham chiếu null.
        String text2 = null;
        return text2.length();// exception
    }
    public static void main(String[] args) {
 
        // Đây là một biến có tham chiếu khác null.
        String text1 = "Hello exception";
 
        // Gọi phương thức để lấy ra độ dài chuỗi.
        int length = text1.length();
 
        System.out.println("Length text1 = " + length);
 
        try {
            System.out.println(nullPoiter());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
