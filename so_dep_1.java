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
public class so_dep_1 {
    static boolean check(String s){
        String s1 = "";
        for(int i = 0;i<s.length();i++){
            s1 = s.charAt(i) + s1;
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2!=0)
                return false;
        }
        return s1.equals(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
