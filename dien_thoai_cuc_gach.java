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
public class dien_thoai_cuc_gach {
    static String convert(char c){
        if(c=='A' || c == 'B' || c =='C')
            return "2";
        if(c=='D' || c == 'E' || c =='F')
            return "3";
        if(c=='G' || c == 'H' || c =='I')
            return "4";
        if(c=='J' || c == 'K' || c =='L')
            return "5";
        if(c=='M' || c == 'N' || c =='O')
            return "6";
        if(c=='P' || c == 'Q' || c =='R' || c == 'S')
            return "7";
        if(c=='T' || c == 'U' || c =='V')
            return "8";
//        if(c=='W' || c == 'X' || c =='Y' || c == 'Z')
            return "9";
    }
    static boolean check(String s){
        String temp = "";
        for(int i=0;i<s.length();i++)
            temp = String.valueOf(s.charAt(i)) + temp;
        return temp.equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            s = s.toUpperCase();
            String res = "";
            for(int i = 0;i<s.length();i++)
                res += convert(s.charAt(i));
            if(check(res)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
