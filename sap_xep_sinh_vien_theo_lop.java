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
public class sap_xep_sinh_vien_theo_lop {
    static class SinhVien{
        private String id,name,lop,email;

        public SinhVien(String id, String name, String lop, String email) {
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
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
    static class SortSinhVien implements Comparator<SinhVien>{

        @Override
        public int compare(SinhVien a, SinhVien b) {
            if(a.getLop().equals(b.getLop()))
                return a.getId().compareTo(b.getId());
            return a.getLop().compareTo(b.getLop());
        }
        
    }
    static class SortSinhVienID implements Comparator<SinhVien>{

        @Override
        public int compare(SinhVien a, SinhVien b) {
            return a.getId().compareTo(b.getId());
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
        a.sort(new SortSinhVienID());
        for(SinhVien st: a){
            System.out.println(st);
        }
    }
}
