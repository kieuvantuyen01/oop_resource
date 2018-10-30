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
public class arithmeticException {
    public static int Arithmetic() throws ArithmeticException {
        int a = 10, b = 0;
        return a / b;
    }
    public static void main(String[] args) {
        
        try {
            System.out.println(Arithmetic()); //  /by zero => exception 
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
