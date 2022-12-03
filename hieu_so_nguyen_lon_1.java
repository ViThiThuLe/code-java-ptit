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
public class hieu_so_nguyen_lon_1 {
    static String sub(String a, String b){
        String dau = "";
        if (a.compareTo(b)<0){
            dau = a;
            a = b;
            b = dau; 
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
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
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
}
