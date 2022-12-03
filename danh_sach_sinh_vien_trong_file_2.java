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
public class danh_sach_sinh_vien_trong_file_2 {
    static class SinhVien{
        private String id, name, lop, dob;
        private float gpa;


        public float getGpa() {
            return gpa;
        }

        public SinhVien(int id, String name, String lop, String dob, float gpa) {
            this.id = "B20DCCN0";
            if(id < 10)
                this.id += "0";
            this.id += String.valueOf(id);
            this.name = name;
            this.lop = lop;
            this.dob = dob;
            this.gpa = gpa;
        }
        
        
        public void chuanHoaDob(){
            String s = this.dob;
            if(s.charAt(1) == '/'){
                s = "0" + s;
            }
            if(s.charAt(4)=='/'){
                s = s.substring(0, 3) + "0" + s.substring(3);
            }
            this.dob = s;
        }
        @Override
        public String toString(){
            return id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
        }
    }
    
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("SV.in"));
            int n = sc.nextInt();
            List<SinhVien> a = new ArrayList<>();
            for(int i=0;i<n;i++){
                String p = sc.nextLine();
                SinhVien temp = new SinhVien(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextFloat());
                temp.chuanHoaDob();
                a.add(temp);
            }
            
            for(int i=0;i<n;i++){
                System.out.println(a.get(i).toString());
            }
        }
        catch(FileNotFoundException e){
            
        }
    }
}
