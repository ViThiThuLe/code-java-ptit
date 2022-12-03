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
public class danh_sach_doi_tuong_sinh_vien_2 {
    static class SinhVien{
        private String id, name, lop, dob;
        private float gpa;

        public SinhVien() {
            this.id = "B20DCCN0";
            this.name = "";
            this.lop = "";
            this.dob = "";
            this.gpa = 0;
        }

        public float getGpa() {
            return gpa;
        }
        
        public void input(Scanner sc,int i){
            if(i<10){
                id += "0";
            }
            id += String.valueOf(i);
            name = sc.nextLine();
            lop = sc.nextLine();
            dob = sc.nextLine();
            gpa = sc.nextFloat();
            chuanHoaDob();
            chuanhoaName();
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
        public void chuanhoaName(){
            String s = this.name;
            s = s.trim().toLowerCase();
            s = s.replaceAll("\\s+", " ");
            String[] a = s.split(" ");
            String res = "";
            for(int i=0;i<a.length;i++){
                res+= String.valueOf(a[i].charAt(0)).toUpperCase()+a[i].substring(1);
                if(i<a.length-1){
                    res+=" ";
                }
            }
            this.name = res;
        }
        @Override
        public String toString(){
            return id + " " + name + " " + lop + " " + dob + " " + String.format("%.2f", gpa);
        }
    }
    static class SortStudent implements Comparator<SinhVien>{
        @Override
        public int compare(SinhVien a, SinhVien b){
            return Double.compare(b.getGpa(), a.getGpa());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<SinhVien> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String p = sc.nextLine();
            SinhVien temp = new SinhVien();
            temp.input(sc, i+1);
            a.add(temp);
        }
        a.sort(new SortStudent());
        for(int i=0;i<n;i++){
            System.out.println(a.get(i).toString());
        }
    }
}
