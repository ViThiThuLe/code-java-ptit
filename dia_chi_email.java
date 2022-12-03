/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class dia_chi_email {
    static String convert(String s){
        s = s.trim().toLowerCase();
        s = s.replaceAll("\\s+", " ");
        String[] a = s.split(" ");
        String res = a[a.length-1];
        for(int i=0;i<a.length-1;i++){
            res += String.valueOf(a[i].charAt(0));
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String p = sc.nextLine();
        String[] e = new String[n]; 
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            e[i] = convert(s);
        }
        for(int i=0;i<n;i++){
            int dem = 1;
            for(int j=0;j<i;j++){
                if(e[i].equals(e[j])) dem++;
            }
            System.out.print(e[i]);
            if(dem>1) System.out.print(dem);
            System.out.println("@ptit.edu.vn");
        }
    }
}
