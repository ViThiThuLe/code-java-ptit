/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tinh_tong {
    public static void main(String[] args) {
        File f = new File("DATA.in");
        long t = 0;
        try{          
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String temp = sc.next();
                try{
                    int x = Integer.parseInt(temp);
                    t += x;
                }
                catch(NumberFormatException e){
                }
            }
        }
        catch(FileNotFoundException e){
        }
        System.out.println(t);
    }
}
