/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class xet_tuyen {

    static class ThiSinh {

        private String ten, ma = "PH", dob, loai;
        private float lt, th;
        private int tuoi, tb;

        public ThiSinh(int ma, String ten, String dob, float lt, float th) {
            if (ma < 10) {
                this.ma += "0";
            }
            this.ma += String.valueOf(ma);
            this.ten = this.chuanHoaTen(ten);
            this.dob = dob;
            this.lt = lt;
            this.th = th;
            this.setTuoi();
            this.tb = Math.round((lt + th) / 2 + diemCong());
            if (this.tb > 10) {
                this.tb = 10;
            }
            this.setLoai();
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

        public void setTuoi() {
            int nam = Integer.parseInt(dob.substring(dob.lastIndexOf("/") + 1));
            this.tuoi = 2021 - nam;
        }

        public float diemCong() {
            if (lt >= 8.0 && th >= 8.0) {
                return (float) 1.0;
            }
            if (lt >= 7.5 && th >= 7.5) {
                return (float) 0.5;
            }
            return 0;
        }

        public void setLoai() {
            if (tb >= 9) {
                loai = "Xuat sac";
            } else if (tb == 8) {
                loai = "Gioi";
            } else if (tb == 7) {
                loai = "Kha";
            } else if (tb >= 5) {
                loai = "Trung binh";
            } else {
                loai = "Truot";
            }
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + tuoi + " " + tb + " " + loai;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        List<ThiSinh> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ent = sc.nextLine();
            a.add(new ThiSinh(i + 1, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat()));
        }
        for (ThiSinh ts : a) {
            System.out.println(ts);
        }
    }
}
