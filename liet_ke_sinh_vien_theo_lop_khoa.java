/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class liet_ke_sinh_vien_theo_lop_khoa {
    static class SinhVien{
        private String id,name,lop,email;
        private int khoa;
        public SinhVien(String id, String name, String lop, String email) {
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
            this.khoa = Integer.parseInt(this.lop.substring(1, 3));
        }

        public String getLop() {
            return lop;
        }

        public String getId() {
            return id;
        }
        
        @Override
        public String toString(){
            return id + " " + name + " " + lop + " " + email;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<SinhVien> a = new ArrayList<>();
        String ent = sc.nextLine();
        for(int i=0;i<n;i++){
            SinhVien st = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(st);
        }
        int q = sc.nextInt();
        ent = sc.nextLine();
        while(q-->0){
            String clas = sc.nextLine();
            int khoa = Integer.parseInt(clas.substring(2, 4));
            System.out.println("DANH SACH SINH VIEN KHOA " + clas + ":");
            for(SinhVien st: a){
                if(st.khoa == khoa)
                   System.out.println(st);
            }
        }
    }
}
