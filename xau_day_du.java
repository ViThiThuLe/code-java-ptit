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
public class xau_day_du {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int k = sc.nextInt();
            int[] a = new int[26];
            int du = 0,thieu = 0;
            for(int i = 0;i<s.length();i++){
                a[s.charAt(i)-'a'] += 1;
            }
            for(int i=0;i<25;i++){
                if(a[i]==0) thieu += 1;
                if(a[i]>1){
                    du += a[i] - 1;
                }
            }            
            if(du>=thieu && k>=thieu){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
