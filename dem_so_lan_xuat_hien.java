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
public class dem_so_lan_xuat_hien {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 1;k<=t;k++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] cnt = new int[10000];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                cnt[a[i]]++;
            }
            System.out.print("Test " + k + ":\n");
            for(int i=0;i<n;i++){
                if(cnt[a[i]]>0){
                    System.out.print(a[i] + " xuat hien " + cnt[a[i]] + " lan\n");
                    cnt[a[i]]=0;
                }
            }
            
        }
    }
}
