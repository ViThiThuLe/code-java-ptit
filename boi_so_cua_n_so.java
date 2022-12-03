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
public class boi_so_cua_n_so {
    public static long lcm(long a,long b){
        long n = a, m = b;
        while(a*b!=0){
            if(a>b)
                a%=b;
            else b%=a;
        }
        long gcd = a+b;
        return n*m/gcd;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long n = sc.nextInt();
            long res = 1;
            for(long i = 2;i<=n;i++){
                res = lcm(res,i);
            }
            System.out.println(res);
            t--;
        }
    }
}
