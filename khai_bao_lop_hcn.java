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
public class khai_bao_lop_hcn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        String color = sc.next();
        color = color.toLowerCase();
        color = String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1);
        if(w>0 && h>0)
            System.out.println((w+h)*2 + " " + w*h + " " + color);
        else
            System.out.println("INVALID");
    }
}
