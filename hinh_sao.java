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
public class hinh_sao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt(), y = sc.nextInt();
        int demx = 1, demy = 1;
        boolean ok = true;
        for (int i = 0; i < n - 2; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            if (u == x || v == x) {
                demx += 1;
            }
            if (u == y || v == y) {
                demy += 1;
            }
        }
        
        if (demx == n - 1 || demy == n - 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
