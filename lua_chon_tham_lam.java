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
public class lua_chon_tham_lam {
    static String minNum(int n,int s){
        if(9*n<s || (s==0 && n>1))
            return "-1";
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            int x = 9;
            s-= x;
            while(s<1){
                x-=1;
                s+=1;
            }
            a[i] = x;
        }
        String res = "";
        a[n-1]+=1;
        for(int i=n-1;i>=0;i--)
            res += String.valueOf(a[i]);
        return res;
    }
    static String maxNum(int n,int s){
        if(9*n<s || (s==0 && n>1))
            return "-1";
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            int x = 9;
            s-= x;
            while(s<0){
                x-=1;
                s+=1;
            }
            a[i] = x;
        }
        String res = "";
        for(int i=0;i<n;i++)
            res += String.valueOf(a[i]);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        System.out.println(minNum(n, s) + " " + maxNum(n,s));
    }
}
