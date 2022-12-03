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
public class dao_tu {
    static String reversed(String s){
        String rs = "";
        for(int i=0;i< s.length();i++)
            rs = s.charAt(i) + rs;
        return rs;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = s.trim().replace("\\s+", " ");
            String[] a = s.split(" ");
            for(String i:a){
                System.out.print(reversed(i)+" ");
            }
            System.out.print("\n");
        }
    }
}
