/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author HP
 */
public class danh_dau_chu_cai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<String> se = new HashSet<>();
        for(int i=0;i<s.length();i++)
            se.add(String.valueOf(s.charAt(i)));
        System.out.println(se.size());
    }
}
