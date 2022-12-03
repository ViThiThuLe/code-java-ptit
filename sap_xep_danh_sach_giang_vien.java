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
public class sap_xep_danh_sach_giang_vien {
    static class GiangVien implements Comparable<GiangVien>{
        private String hoten,mon,ten;
        private int id;

        public GiangVien(String hoten, String mon, int id) {
            this.id = id;
            this.hoten = hoten;
            this.mon = mon;
            String[] a = this.hoten.split(" ");
            this.ten = a[a.length-1];
        }
        public String xulyMon(){
            String a[] = mon.toUpperCase().split(" ");
            String res = "";
            for(int i=0;i<a.length;i++){
                res += String.valueOf(a[i].charAt(0));
            }
            return res;
        }
        @Override
        public int compareTo(GiangVien other){
            if(this.ten.equals(other.ten))
                return this.id-other.id;
            return this.ten.compareTo(other.ten);
        }
        @Override
        public String toString(){
            String id;
            if(this.id<10)
                id = String.format("GV0%d", this.id);
            else
                id = String.format("GV%d", this.id);
            return id + " " + hoten + " " + xulyMon();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ent = sc.nextLine();
        List<GiangVien> gv = new ArrayList<>();
        for(int i=0;i<n;i++){
            GiangVien temp = new GiangVien(sc.nextLine(),sc.nextLine(),i+1);
            gv.add(temp);
        }
        Collections.sort(gv);
        for(GiangVien i:gv){
            System.out.println(i);
        }
    }
}
