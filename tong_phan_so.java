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
public class tong_phan_so {
    static long gcd(long a, long b){
        while(a*b!=0){
            if(a>b){
                a%=b;
            }
            else b%=a;
        }
        return a+b;
    }
    static long lcm(long a, long b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t1 = sc.nextLong();
        long m1 = sc.nextLong();
        long t2 = sc.nextLong();
        long m2 = sc.nextLong();
        long temp = gcd(t1,m1);
        t1 = t1/temp;
        m1 = m1/temp;
        temp = gcd(t2,m2);
        t2 = t2/temp;
        m2 = m2/temp;
        long m = lcm(m2,m1);
        long t = (t1*(m/m1) + t2*(m/m2));
        System.out.println(t/gcd(t,m) + "/" + m/gcd(t,m));
    }
}
