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
public class in_ma_tran {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] m = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    m[i][j] = sc.nextInt();
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    if (i % 2 == 0)
                        System.out.print(m[i][j] + " ");
                    else
                        System.out.print(m[i][n - j - 1] + " ");
                }
            System.out.print("\n");
        }
    }
}
