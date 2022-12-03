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
public class liet_ke_to_hop {
    static int n,k,dem;
    static int[] a = new int[10];
    static void in(){
        dem+=1;
        for(int i=1;i<=k;i++)
            System.out.print(a[i]);
        System.out.print(" ");
    }
    static void sinhToHop(int i){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if(i==k)
                in();
            else sinhToHop(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        n = sc.nextInt();
        k = sc.nextInt();
        dem = 0;
        a[0]=0;
        sinhToHop(1);
        System.out.println("\nTong cong co " + dem + " to hop");
    }
}
