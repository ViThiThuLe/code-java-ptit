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
public class bang_diem_thanh_phan {
    static class SinhVien implements Comparable<SinhVien>{
        private String id, name, lop;
        private float d1,d2,d3;

        public SinhVien(String id, String name, String lop, float d1, float d2, float d3) {
            
            this.id = id;
            this.name = name;
            this.lop = lop;
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }
        @Override
        public int compareTo(SinhVien other){
            return this.name.compareTo(other.name);
        }
        @Override
        public String toString(){
            return id + " " + name + " " + lop + " " + String.format("%.1f %.1f %.1f", d1,d2,d3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<SinhVien> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ent = sc.nextLine();
            SinhVien temp = new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
            a.add(temp);
        }
        Collections.sort(a);
        int k = 1;
        for(SinhVien sv : a){
            System.out.println(k + " " + sv);
            k++;
        }
    }
}
