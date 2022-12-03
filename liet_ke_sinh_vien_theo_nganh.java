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
public class liet_ke_sinh_vien_theo_nganh {
    static class SinhVien{
        private String id,name,lop,email,nganh;

        public SinhVien(String id, String name, String lop, String email) {
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.email = email;
        }

        public String getNganh() {
            return nganh;
        }
        
        public void setNganh(){
            String temp = id.substring(3, 7);
            switch(temp){
                case "DCCN":
                    if(lop.charAt(0)=='E')
                        this.nganh = "";
                    else
                        this.nganh = "cong nghe thong tin";
                    break;
                case "DCKT":
                    this.nganh = "ke toan";
                    break;
                case "DCAT":
                    if(lop.charAt(0)=='E')
                        this.nganh = "";
                    else
                        this.nganh = "an toan thong tin";
                    break;    
                case "DCVT":
                    this.nganh = "vien thong";
                    break; 
                case "DCDT":
                    this.nganh = "dien tu";
                    break;    
            }
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
            st.setNganh();
            a.add(st);
        }
        int q = sc.nextInt();
        ent = sc.nextLine();
        while(q-->0){
            String s = sc.nextLine().toLowerCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for(SinhVien st: a){
                if(st.getNganh().equals(s))
                    System.out.println(st);
            }
        }
    }
}
