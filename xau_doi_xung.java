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
public class xau_doi_xung {
    static boolean check(String s){
        int dem = 0;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                dem++;
            }
        }
        if(dem==1) return true;
        if(dem>1) return false;
        
            return s.length()%2 != 0;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
