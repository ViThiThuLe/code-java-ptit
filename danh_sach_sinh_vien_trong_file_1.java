/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class danh_sach_sinh_vien_trong_file_1 {
    static class SinhVien{
        private String id, name, lop, email;

        public SinhVien(String id, String name, String lop, String email) {
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
        }

        public String getId() {
            return id;
        }
        
        public void chuanHoaName(){
            String s = name.trim().toLowerCase();
            String[] a = s.split("\\s+");
            s = "";
            for(int i=0;i<a.length;i++){
                s+= String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
                if(i<a.length-1)
                    s+= " ";
            }
            name = s;
        }
        @Override
        public String toString(){
            chuanHoaName();
            return id + " " + name + " " + lop + " " + email;
        }
    }
    static class SortId implements Comparator<SinhVien>{
        @Override
        public int compare(SinhVien a, SinhVien b){
            return a.getId().compareTo(b.getId());
        }
    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("SINHVIEN.in"));
            int n = sc.nextInt();
            String ent = sc.nextLine();
            List<SinhVien> a = new ArrayList<>();
            for(int i = 0;i<n;i++){
                SinhVien sv = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
                a.add(sv);
            }
            a.sort(new SortId());
            for(SinhVien sv : a){
                System.out.println(sv);
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
}
