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
public class giao_cua_hai_day_so {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] giao = new int[1000];
        int[] hop = new int[1000];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            giao[a[i]]=1;
            hop[a[i]]=1;
        }
        for(int i=0;i<m;i++){
            b[i] = sc.nextInt();
            hop[b[i]]=1;
            if(giao[b[i]]==1) giao[b[i]]=2;
        }
        for(int i=0;i<1000;i++){
            if(hop[i]==1)
                System.out.print(i + " ");
        }
        
    }
}
