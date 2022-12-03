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
public class bai_toan_tinh_cong {
    static class NhanVien{
        String name,cv;
        int lcb,day,lm;
        public void input(){
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            lcb = sc.nextInt();
            day = sc.nextInt();
            cv = sc.next();
            lm = lcb*day;
        }
        public int thuong(){
            if(day>25)
                return lm/5;
            if(day>22)
                return lm/10;
            return 0;
        }
        public int phucap(){
            switch(cv){
                case "GD":
                    return 250000;
                case "PGD":
                    return 200000;
                case "TP":
                    return 180000;
                case "NV":
                    return 150000;
            }
            return 0;
        }
        @Override
        public String toString(){
            return "NV01 " + name + " " + lm + " " + thuong() + " " + phucap() + " " + (lm + thuong() +phucap());
        }
    }
    public static void main(String[] args) {
        NhanVien nv = new NhanVien();
        nv.input();
        System.out.println(nv.toString());
    }
}
