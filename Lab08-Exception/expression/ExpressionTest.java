/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expression;

/**
 *
 * @author CACLV
 */
public class ExpressionTest {
    public static void main(String[] args) {
        Expression expression1 = new Numeral(10);
        Expression expression2 = new Numeral(1);
        Expression expression3 = new Numeral(2);
        Expression expression4 = new Numeral(3);
        
        Expression e1 = new Square(expression1); // e1 = 10^2
        Expression e2 = new Subtraction(e1, expression2); // tính e2 = e1 - 1
        Expression e3 = new Multiplication(expression3, expression4); // e3 = 2 * 3
        Expression e4 = new Addition(e2, e3); // e4 = e2 + e3
        Expression e5 = new Square(e4); // trả về bình phương của e4
        Expression ex = new Addition(e1, new Division(new Numeral(2), new Numeral(0)));
        
        System.out.println(e5.toString());
        System.out.println(e5.evaluate());
        
        try {
            System.out.println(ex.evaluate());
        } catch (ArithmeticException exa) {
            System.out.println("/ by zero");
        }
    }
}
