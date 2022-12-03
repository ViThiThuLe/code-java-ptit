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
public class phan_so {
    static long gcd(long a, long b){
        while(a*b!=0){
            if(a>b){
                a%=b;
            }
            else b%=a;
        }
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        System.out.println(tu/gcd(tu,mau) + "/" + mau/gcd(tu,mau));
    }
}
