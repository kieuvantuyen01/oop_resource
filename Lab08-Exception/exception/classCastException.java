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
public class classCastException {

    public static int ClassCast(Object s) throws ClassCastException {
      s = 12.3;
        return (int) s; // exception
    }
    
    public static void main(String[] args) {
        try {
            System.out.println(ClassCast(12.3));
        } catch (ClassCastException e) {
            System.out.println("gfdgdh");
        }
    }
}
