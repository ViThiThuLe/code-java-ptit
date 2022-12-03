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
public class so_xa_cach {
    static int a[] = new int[12], vs[] = new int[12];
    static int n;
    static boolean check(){
        for(int i=1;i<n;i++){
            if(Math.abs(a[i]-a[i+1])==1)
                return false;
        }
        return true;
    }
    static void in(){
        if(check()){
            for(int i=1;i<=n;i++){
                System.out.print(a[i]);
            }
            System.out.print("\n");
        }
    }
    static void hoanvi(int i){
        for(int j=1;j<=n;j++){
            if(vs[j] == 0){
                a[i] = j;
                vs[j] = 1;
                if(i==n) in();
                else hoanvi(i+1);
                vs[j] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            hoanvi(1);
        }
    }
}
