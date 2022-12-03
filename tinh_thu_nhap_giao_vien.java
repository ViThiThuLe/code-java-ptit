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
public class tinh_thu_nhap_giao_vien {
    static class GiaoVien{
        private String id,name;
        private long lcb,salary;
        public void input(){
            Scanner sc = new Scanner(System.in);
            id = sc.nextLine();
            name = sc.nextLine();
            lcb = sc.nextLong();
        }
        public long phucap(){
            String cv = id.substring(0, 2);
            switch(cv){
                case "HT":
                    return 2_000_000L;
                case "HP":
                    return 900_000L;
                case "GV":
                    return 500_000L;
            }
            return 0;
        }
        public long heso(){
            return Long.parseLong(id.substring(2));
        }
        @Override
        public String toString(){
            salary = lcb*this.heso() + this.phucap();
            return id + " " + name + " " + this.heso() + " " + this.phucap() + " " +salary;
        }
    }
    public static void main(String[] args) {
        GiaoVien gv = new GiaoVien();
        gv.input();
        System.out.println(gv.toString());
    }
}
