/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class diem_tuyen_sinh {

    static class ThiSinh implements Comparable<ThiSinh> {

        private String ten, dantoc, ma = "TS";
        private float diem, tong;
        private int kv;

        public ThiSinh(int i, String ten, float diem, String dantoc, int kv) {
            if (i < 10) {
                this.ma += "0";
            }
            this.ma += String.valueOf(i);
            this.ten = this.chuanHoaTen(ten);
            this.dantoc = dantoc;
            this.kv = kv;
            this.diem = diem;
            this.tong = diem + this.getDiemCong();
        }

        public float getDiemCong() {
            float cong = 0.0F;
            if (kv == 1) {
                cong += 1.5;
            }
            if (kv == 2) {
                cong += 1.0;
            }
            if (!dantoc.equals("Kinh")) {
                cong += 1.5;
            }
            return cong;
        }

        public String chuanHoaTen(String ten) {
            StringTokenizer s = new StringTokenizer(ten);
            String res = "";
            while (s.hasMoreTokens()) {
                String temp = s.nextToken().toLowerCase();
                res += String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1) + " ";
            }
            return res;
        }

        @Override
        public String toString() {
            String status = tong >= 20.5 ? "Do" : "Truot";
            return ma + " " + ten + " " + String.format("%.1f", tong) + " " + status;
        }

        @Override
        public int compareTo(ThiSinh o) {
            if (this.tong == o.tong) {
                return this.ma.compareTo(o.ma);
            }
            return Float.compare(o.tong, this.tong);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        List<ThiSinh> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ent = sc.nextLine();
            a.add(new ThiSinh(i + 1, sc.nextLine(), Float.parseFloat(sc.nextLine()), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(a);
        for (ThiSinh s : a) {
            System.out.println(s);
        }
    }
}
