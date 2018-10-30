/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.Scanner;

/**
 *
 * @author CACLV
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        //        Scanner scanner = new Scanner(System.in);
        //        try {
        //            System.out.println("Nhập vào số yêu thích: ");
        //            int number = Integer.valueOf(scanner.next());
        //            System.out.println(number);
        //        } catch (NumberFormatException e) {
        //            System.out.println(e.getMessage());
        //        }
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào một số yêu thích : ");
        int number = Integer.valueOf(input.nextLine());
        if (number < 0) {
            try {
                throw new SoAmException("Không được nhập vào số âm!");
            } catch (SoAmException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Number love : " + number);

    }

    private static class SoAmException extends java.lang.Exception {
        public SoAmException(String không_được_nhập_vào_số_âm) {
            super(không_được_nhập_vào_số_âm);
        }
    }

}
