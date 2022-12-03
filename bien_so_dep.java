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
public class bien_so_dep {
    static boolean tang(String s){
        for (int i = 0; i < s.length() - 1; i++)
            if (s.charAt(i) >= s.charAt(i+1))
                return false;
        return true;
    }
    static boolean bang(String s){
        for (int i = 0; i < s.length() - 1; i++)
            if (s.charAt(i) != s.charAt(i+1) && i!=2)
                return false;
        return true;
    }
    static boolean lp(String s){
        for (int i = 0; i < s.length() - 1; i++)
            if (s.charAt(i)!='8' && s.charAt(i)!='6')
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            String res = "";
            for(int i=5;i<s.length();i++){
                if(s.charAt(i)!='.')
                    res+=s.charAt(i);
            }
            if(tang(res) || bang(res) || lp(res)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
