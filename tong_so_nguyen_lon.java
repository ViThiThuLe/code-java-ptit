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
public class tong_so_nguyen_lon {
    static String tong(String x, String y){
        String res = "";
        int du = 0;
        for(int i=x.length()-1;i>=0;i--){
            int n = (x.charAt(i)-'0') + (y.charAt(i)-'0') + du;
            if(n>=10){
                du = 1;
                n = n-10;
            }
            else du = 0;
            res = String.valueOf(n) + res;
        }
        if(du!=0) res = "1" + res; 
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            String x = sc.next();
            String y = sc.next();
            while(x.length()!=y.length()){
                if(x.length()<y.length()){
                    x = "0" +x;
                }
                else if(x.length()>y.length()){
                    y = "0" + y;
                }
            }
            System.out.println(tong(x, y));
        }
    }
}
