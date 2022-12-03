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
public class chuan_hoa_xau_ho_ten_trong_file {
    public static String chuanhoa(String s){
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] a = s.split(" ");
        String res = "";
        for(int i=0;i<a.length;i++){
            res+= String.valueOf(a[i].charAt(0)).toUpperCase()+a[i].substring(1);
            if(i<a.length-1){
                res+=" ";
            }
        }
        return res;
    }
    public static void main(String[] args) {
        try{
                Scanner sc = new Scanner(new File("DATA.in"));
                while(sc.hasNextLine()){
                    String s = sc.nextLine();
                    if(s.equals("END")) break;
                    System.out.println(chuanhoa(s));
                }
                
            }
            catch(FileNotFoundException e){
            
            }
    }
}
