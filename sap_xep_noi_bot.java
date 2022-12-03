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
public class sap_xep_noi_bot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }       
        int step = 1;
        for(int i=1;i<n;i++){
            int ok = 0;
            for(int j=0;j<n-i;j++)
                if(a[j]>a[j+1]){
                    int tg = a[j];
                    a[j]=a[j+1];
                    a[j+1]=tg;
                    ok = 1;
                }
            if(ok==1){
                System.out.print("Buoc " + step + ": ");
                for(int j=0;j<n;j++)
                    System.out.print(a[j] + " ");
                System.out.print("\n");
                step++;
            }
        }                            
    }
}
