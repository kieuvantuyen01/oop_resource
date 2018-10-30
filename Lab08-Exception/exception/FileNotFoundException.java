/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author CACLV
 */
public class FileNotFoundException {
    static String filename = "dictionaries.txt";
    public static void readFile(String filename) throws java.io.FileNotFoundException, IOException {
        BufferedReader br;
        FileReader f = new FileReader("dictionaries.txt");
        br = new BufferedReader(f);
        System.out.println(br.lines());
    }

    public static void main(String[] args) {

        try {
            readFile(filename);
        } catch ( java.io.FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
