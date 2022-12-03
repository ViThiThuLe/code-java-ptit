/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class hieu_so_nguyen_lon_2 {
    static String xoa0(String s){
        int i = 0;
        while(s.charAt(i)=='0' && i<s.length()-1){
            i++;
        }
        return s.substring(i);
    }
    static String sub(String a, String b){
        String dau = "";
        if (a.compareTo(b)<0){
            dau = a;
            a = b;
            b = dau;
            dau = "-";
        }
        int du = 0;
        String res = "";
        for(int i=a.length()-1;i>=0;i--){
            int x = (a.charAt(i)-'0')-(b.charAt(i)-'0'+du);
            if(x<0){
                x+=10;
                du=1;
            }
            else du = 0;
            res = String.valueOf(x) + res;
        }
        return dau + xoa0(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = xoa0(sc.next());
        String b = xoa0(sc.next());
        if(a.length()<b.length()){
            while(a.length()<b.length()){
                a = "0" + a;
            }
        }
        else{
            while(a.length()>b.length()){
                b = "0" + b;
            }
        }
        System.out.println(sub(a,b));
    }
}
