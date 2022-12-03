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
public class bo_sung_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        boolean ok = true;
        for(int i=1;i<a[0];i++){
            System.out.println(i);
            ok = false;
        }
        for(int i=1;i<n;i++){
            if(a[i]-a[i-1]!=1){
                ok = false;
                for(int j=a[i-1]+1;j<a[i];j++)
                    System.out.println(j);
            }
        }
        if(ok) System.out.println("Excellent!");
        
    }
    
}
