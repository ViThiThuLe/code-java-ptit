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
public class lap_bang_tinh_cong {

    static class NhanVien implements Comparable<NhanVien>{

        private String ten, chucvu, ma = "NV";
        private long luongngay, songay;

        public NhanVien(int ma, String ten, long luongngay, long songay, String chucvu) {
            if (ma < 10) {
                this.ma += "0";
            }
            this.ma += String.valueOf(ma);
            this.ten = ten;
            this.chucvu = chucvu;
            this.luongngay = luongngay;
            this.songay = songay;
        }

        public long getLuongThang() {
            return luongngay * songay;
        }

        public long getThuong() {
            long thuong = getLuongThang();
            if (songay >= 25) {
                thuong *= 0.2;
            } else if (songay >= 22) {
                thuong *= 0.1;
            } else {
                thuong *= 0;
            }
            return thuong;
        }

        public long getPhuCap() {
            switch (chucvu) {
                case "GD":
                    return 250000;
                case "PGD":
                    return 200000;
                case "TP":
                    return 180000;
                default:
                    return 150000;
            }
        }

        public long getThucLinh() {
            return getLuongThang() + getPhuCap() + getThuong();
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + getLuongThang() + " " + getThuong() + " " + getPhuCap() + " " + getThucLinh();
        }

        @Override
        public int compareTo(NhanVien o) {
            return Float.compare(o.getThucLinh(), this.getThucLinh());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<NhanVien> a = new ArrayList<>();
        String ent = sc.nextLine();
        for (int i = 0; i < n; i++) {
            a.add(new NhanVien(i + 1, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(a);
        for (NhanVien nv : a) {
            System.out.println(nv);
        }
        
    }
}
