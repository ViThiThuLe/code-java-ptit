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
public class ma_tran_nhi_phan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int[][] m = new int[n][3];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < 3; j++)
                    m[i][j] = sc.nextInt();
            int cnt = 0;
            for (int i = 0; i < n; i++){
                int dem=0;
                for (int j = 0; j < 3; j++) {
                    if (m[i][j] == 1)
                        dem++;                  
                }
                if(dem>1)
                    cnt++;
            }
            System.out.print(cnt);
        
    }
}
