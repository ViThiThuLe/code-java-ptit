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
public class hinh_vuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p1 = new int[4];
        int[] p2 = new int[4];
        for(int i=0;i<4;i++)
            p1[i] = sc.nextInt();
        for(int i=0;i<4;i++)
            p2[i] = sc.nextInt();
        int x1 = Math.min(p1[0], p2[0]);
        int y1 = Math.min(p1[1], p2[1]);
        int x2 = Math.max(p1[2], p2[2]);
        int y2 = Math.max(p1[3], p2[3]);
        int len = Math.max(Math.abs(x1-x2), Math.abs(y1-y2));
        
        System.out.println(len*len);
    }
}
