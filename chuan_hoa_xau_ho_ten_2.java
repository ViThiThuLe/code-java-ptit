/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.*;

/**
 *
 * @author HP
 */
public class chuan_hoa_xau_ho_ten_2 {
    static String chuanhoa(String s){
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] a = s.split(" ");
        String res = "";
        for(int i=1;i<a.length;i++){
            res+= String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1); 
            if(i<a.length-1)
                res+= " ";
            else res+=", ";
        }
        res += a[0].toUpperCase();
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();                      
            System.out.println(chuanhoa(s));
        }
    }
}
