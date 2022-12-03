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
public class so_uu_the {
    static int check(String s){
        int chan = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>'9' || s.charAt(i)<0)
                return -1;
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2 == 0){
                chan++;
            }
        }
        if((s.length()%2 == 0 && 2*chan-s.length()>0) || (s.length()%2 != 0 && 2*chan-s.length()<0))
            return 1;
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if (check(s)==1)
                System.out.println("YES");
            if(check(s)==0)
                System.out.println("NO");
            if(check(s)==-1)
                System.out.println("INVALID");
        }
    }
}
