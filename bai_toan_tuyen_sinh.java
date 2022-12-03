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
public class bai_toan_tuyen_sinh {
    static class ThiSinh{
        private String id,name;
        private double toan,ly,hoa,ut;
        public void setUu(){
            String s = id.substring(0, 3);
            switch(s){
                case "KV1":
                    ut = 0.5;
                    break;
                case "KV2":
                    ut = 1.0;
                    break;
                default:
                    ut = 2.5;
                    break;
            }
        }
        public void input(Scanner sc){
            id = sc.nextLine();
            name = sc.nextLine();
            toan = sc.nextDouble();
            ly = sc.nextDouble();
            hoa = sc.nextDouble(); 
            this.setUu();
        }
        public boolean isInt(double d){
            d = d*10;
            return (int)d%10==0;
        }
        @Override
        public String toString(){
            double tong = toan*2 + ly + hoa;
            String status = tong+ut>=24? "TRUNG TUYEN" : "TRUOT";
            return id + " " + name + " " + (isInt(ut) ? String.format("%.0f", ut) : String.format("%.1f", ut)) + " " 
                    + (isInt(tong) ? String.format("%.0f", tong) : String.format("%.1f", tong)) + " " + status;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh();
        ts.input(sc);
        System.out.println(ts.toString());
    }
}
