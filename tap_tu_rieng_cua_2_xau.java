/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tap_tu_rieng_cua_2_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while(t-->0){
            String s1 = sc.nextLine();
//            p = sc.nextLine();
            String s2 = sc.nextLine();
            String[] a = s1.split(" ");
            String[] b = s2.split(" ");
            Set<String> s = new TreeSet<>();
            for (String a1 : a) {
                if (!s.contains(a1)) s.add(a1);
            }
            for (String b1:b){
                if (s.contains(b1)) s.remove(b1);
            }
            
            for(String i:s){
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
