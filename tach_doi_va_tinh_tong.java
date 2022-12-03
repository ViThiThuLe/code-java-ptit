/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tach_doi_va_tinh_tong {
    static String s;
    static void readFile(String fileName){
        try{
            Scanner sc = new Scanner(new File(fileName));
            s = sc.nextLine(); 
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    static void xuly(BigInteger a){
        while(String.valueOf(a).length()>1){
            String tt = String.valueOf(a);
            BigInteger a1 = new BigInteger(tt.substring(0, tt.length()/2));
            BigInteger a2 = new BigInteger(tt.substring(tt.length()/2));
//            System.out.println(a1 + " " +a2);
            a = a1.add(a2);
            System.out.println(a);
        }
    }
    public static void main(String[] args){
        readFile("DATA.in");
        BigInteger a = new BigInteger(s);
        xuly(a);
    }
}
