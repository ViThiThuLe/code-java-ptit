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
public class danh_sach_ke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int[][] m = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    m[i][j] = sc.nextInt();
            for (int i = 0; i < n; i++){
                System.out.print("List(" + (i+1) + ") = ");
                for (int j = 0; j < n; j++) {
                    if (m[i][j] == 1)
                        System.out.print(j+1 + " ");                   
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        
    }
}
