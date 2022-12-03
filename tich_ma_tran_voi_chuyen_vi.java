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
public class tich_ma_tran_voi_chuyen_vi {
    static void in(int a[][],int n, int m){
        for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(a[i][j] + " ");
                }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int l=0;l<t;l++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[n][m];
            int b[][] = new int[m][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++){
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            int c[][] = new int[n][n];
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    int temp = 0;
                    for(int k = 0;k<m;k++){
                        temp += (a[i][k]*b[k][j]);
                    }
                    c[i][j] = temp;
                }
            }
            System.out.println("Test " + (l+1) + ":");
            in(c,n,n);
        }
    }
}
