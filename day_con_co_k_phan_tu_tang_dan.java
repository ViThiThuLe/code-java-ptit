/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class day_con_co_k_phan_tu_tang_dan {
    static int[] a;
    static int[] b;
    static int n,k;
    static public void in(){
        for(int i=1;i<=k;i++){
            System.out.print(a[b[i]] + " ");
        }
        System.out.print("\n");
    }
    static public void sinh(int i){
        for(int j = b[i-1]+1;j<=n-k+i;j++){
            b[i] = j;
            if(i==k)
                in();
            else if(i<k){
                sinh(i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            a = new int[n+1];
            b = new int[k+1];       
            for(int i=1;i<=n;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            sinh(1);
        }
    }
}
