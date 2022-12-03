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
public class chia_het_cho_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int chan = 0, le = 0;
            for(int i=0;i<s.length();i++){
                if(i%2==0)
                    chan+= (s.charAt(i)-'0');
                else
                    le += (s.charAt(i)-'0');
            }
            if(Math.abs(chan-le)%11==0)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
