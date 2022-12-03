/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.*;
/**
 *
 * @author HP
 */
public class buoi_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b<=c || a+c<=b || b+c<=a){
            System.out.println("INVALID");
        }
        else{
            float p = ((float)a+b+c)/2;
            float s = (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.printf("%.2f %.2f",p,s);
        }
        int x = sc.nextInt();
        double s2 = (Math.exp(Math.sin(x)+7))/(x+Math.log(x+Math.exp(2)));
        System.out.printf("%.2f",s2);
    }
}
