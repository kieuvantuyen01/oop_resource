package exception;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CACLV
 */
public class arrayIndexOfBoundsException {
    public static int ArrayIndexOutOfBounds() throws ArrayIndexOutOfBoundsException {
        int [] Arr = {1, 2};
        return Arr[8];
    }
    public static void main(String[] args) {
        
        try {
            System.out.println(ArrayIndexOutOfBounds());// truy cập ngoài mảng => exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
