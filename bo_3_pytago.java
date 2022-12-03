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
public class bo_3_pytago {
    static boolean isTriplet(long[] a, int n){
        for(int i=0;i<n;i++)
            a[i] = a[i]*a[i];
        Arrays.sort(a);
        for(int i=n-1;i>=2;i--){
            int l = 0;
            int r = i-1;
            while(l<r){
                if(a[l]+a[r]==a[i])
                    return true;
                if(a[l]+a[r]<a[i])
                    l++;
                else r--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            if(isTriplet(a,n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
