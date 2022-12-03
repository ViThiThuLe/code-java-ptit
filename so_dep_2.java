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
public class so_dep_2 {
    static boolean check(String s){
        if(s.charAt(0)!='8' || s.charAt(s.length()-1)!='8')
            return false;
        String s1 = "";
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            s1 = s.charAt(i) + s1;
            sum+= Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return s1.equals(s) && sum%10==0;
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
