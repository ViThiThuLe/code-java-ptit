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
public class khai_bao_lop_thi_sinh {
    static class ThiSinh{
        private String name, dob;
        private float p1,p2,p3,sp;
        public void input(){
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            dob = sc.nextLine();
            p1 = sc.nextFloat();
            p2 = sc.nextFloat();
            p3 = sc.nextFloat();
            sp = p1 + p2 + p3;
        }
        @Override
        public String toString(){
            return name + " " + dob + " " +  String.format("%.1f", sp);
        }
    }
    public static void main(String[] args) {
        ThiSinh ts = new ThiSinh();
        ts.input();
        System.out.println(ts.toString());
    }
}
