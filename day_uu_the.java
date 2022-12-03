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
public class day_uu_the {
    static boolean check(String[] a){
        int chan = 0;
        for(String i:a){
            if(Integer.parseInt(i)%2==0)
                chan++;
        }
        return (a.length%2==0 && 2*chan>a.length)||(a.length%2!=0 && 2*chan<a.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] a = s.split("\\s+");
            if(check(a))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
