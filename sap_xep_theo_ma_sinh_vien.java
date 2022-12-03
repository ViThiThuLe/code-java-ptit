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
public class sap_xep_theo_ma_sinh_vien {
    static class SinhVien{
        private String id,name,lop,email;

        public SinhVien(String id, String name, String lop, String email) {
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
        }

        public String getId() {
            return id;
        }
        
        @Override
        public String toString(){
            return id + " " + name + " " + lop + " " + email;
        }
    }
    static class SortSinhVienID implements Comparator<SinhVien>{

        @Override
        public int compare(SinhVien a, SinhVien b) {
            return a.getId().compareTo(b.getId());
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<SinhVien> a = new ArrayList<>();
        while(sc.hasNextLine()){
            SinhVien st = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(st);
        }
        a.sort(new SortSinhVienID());
        for(SinhVien st: a){
            System.out.println(st);
        }
    }
}
