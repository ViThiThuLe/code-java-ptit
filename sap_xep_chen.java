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
public class sap_xep_chen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && b[j-1]>a[i]){
                b[j] = b[j-1];
                j--;
            }
            b[j]=a[i];
            
            System.out.print("Buoc " + i + ": ");
            for(int k=0;k<=i;k++)
                System.out.print(b[k] + " ");
            System.out.print("\n");
        }
        
                    
    }
}
