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
public class uoc_so_chung_lon_nhat_cua_2_so_nguyen_lon {
    static int gcd(int reduceNum, int b){
        return b == 0 ? reduceNum : gcd(b,reduceNum%b);
    }
    static int reduceB(int a, String b){
        int res = 0;
        for(int i=0;i<b.length();i++){
            res = (res*10 + b.charAt(i)-'0')%a;
        }
        return res;
    }
    static int gcdLarge(int a, String b){
        int num = reduceB(a,b);
        return gcd(num,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            String b = sc.next();
            System.out.println(gcdLarge(a, b));
        }
    }
}
