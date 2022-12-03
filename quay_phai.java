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
public class quay_phai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            int max = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                if(a[i]>a[max])
                    max = i;
            }
            for(int i=0;i<n;i++){
                if(a[i]==a[max] && i-max == 1)
                    max = i;
            }
            if(max<n-1)
                System.out.println(max+1);
            else
                System.out.println("0");
        }
    }
}
