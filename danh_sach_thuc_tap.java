/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class danh_sach_thuc_tap {
    static class SinhVien implements Comparable<SinhVien>{
        private int id;
        private String ma, ten, lop, email, dn;

        public String getDn() {
            return dn;
        }

        public SinhVien(int id, String ma, String ten, String lop, String email, String dn) {
            this.id = id;
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
            this.dn = dn;
        }
        @Override
        public int compareTo(SinhVien other){
            return this.ma.compareTo(other.ma);
        }
        @Override
        public String toString(){
            return id + " " + ma + " " + ten + " " + lop + " " + email + " " +dn;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<SinhVien> a = new ArrayList<>();
        String ent = sc.nextLine();
        for(int i=0;i<n;i++){
            SinhVien temp = new SinhVien(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(temp);
        }
        Collections.sort(a);
        int q = sc.nextInt();
        ent = sc.nextLine();
        while(q-->0){
            String dn = sc.nextLine();
            for(SinhVien sv :a){
                if(sv.getDn().equals(dn)){
                    System.out.println(sv);
                }
            }
        }
    }
}
