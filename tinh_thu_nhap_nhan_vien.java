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
public class tinh_thu_nhap_nhan_vien {
    static class NhanVien implements Comparable<NhanVien>{

        private String ten, chucvu, ma = "NV";
        private long luongngay, songay;

        public NhanVien(int ma, String ten, String chucvu, long luongngay, long songay) {
            if (ma < 10) {
                this.ma += "0";
            }
            this.ma += String.valueOf(ma);
            this.ten = ten;
            this.chucvu = chucvu;
            this.luongngay = luongngay;
            this.songay = songay;
        }

        public long getLuongChinh() {
            return luongngay * songay;
        }

        public long getTamUng() {
            long dieukien = getThuNhap();
            long tamung = 25000;
            if(dieukien*2/3<25000)
                tamung = (long) (Math.round((double)dieukien*2.0/3.0/1000.0)*1000);
            return tamung;
        }

        public long getPhuCap() {
            switch (chucvu) {
                case "GD":
                    return 500;
                case "PGD":
                    return 400;
                case "TP":
                    return 300;
                case "KT":
                    return 250;
                default:
                    return 100;
            }
        }
        public long getConLai(){
            return getThuNhap()-getTamUng();
        }
        public long getThuNhap() {
            return getLuongChinh() + getPhuCap();
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + getPhuCap() + " " + getLuongChinh() + " " + getTamUng() + " " + getConLai();
        }        

        @Override
        public int compareTo(NhanVien o) {
            if(this.getThuNhap() == o.getThuNhap())
                return this.ma.compareTo(o.ma);
            return (int) (o.getThuNhap()-this.getThuNhap());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<NhanVien> a = new ArrayList<>();
        String ent = sc.nextLine();
        for (int i = 0; i < n; i++) {
            a.add(new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(a);
        for (NhanVien nv : a) {
            System.out.println(nv);
        }
        
    }
}
