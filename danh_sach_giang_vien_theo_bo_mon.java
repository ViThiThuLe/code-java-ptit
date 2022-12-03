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
public class danh_sach_giang_vien_theo_bo_mon {
    static String xulyMon(String s){
        String a[] = s.toUpperCase().split(" ");
        String res = "";
        for(int i=0;i<a.length;i++){
            res += String.valueOf(a[i].charAt(0));
        }
        return res;
    }
    static class GiangVien{
        private String hoten,mon,ten;
        private int id;

        public GiangVien(String hoten, String mon, int id) {
            this.id = id;
            this.hoten = hoten;
            this.mon = mon;
            String[] a = this.hoten.split(" ");
            this.ten = a[a.length-1];
        }

        public String getMon() {
            return mon;
        }
        
        @Override
        public String toString(){
            String id;
            if(this.id<10)
                id = String.format("GV0%d", this.id);
            else
                id = String.format("GV%d", this.id);
            return id + " " + hoten + " " + xulyMon(mon);
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
        int q = sc.nextInt();
        ent = sc.nextLine();
        while(q-->0){
            String mon = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN BO MON " + xulyMon(mon) + ":");
            for(GiangVien i:gv){
                if(i.getMon().equals(mon))
                    System.out.println(i);
            }
        }
    }
}
