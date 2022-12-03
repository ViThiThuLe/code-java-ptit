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
public class bang_theo_doi_nhap_xuat_hang {

    static class MatHang implements Comparable<MatHang> {

        private String ma;
        private long nhap;
        
        public String getNhom() {
            return ma.substring(0, 1);
        }

        public MatHang(String ma, long nhap) {
            this.ma = ma;
            this.nhap = nhap;
        }

        public long getXuat() {
            if (ma.substring(0, 1).equals("A")) {
                return Math.round(nhap * 60.0 / 100.0);
            } else {
                return Math.round(nhap * 70.0 / 100.0);
            }
        }

        public long getDonGia() {
            if (ma.endsWith("Y")) {
                return 110000;
            } else {
                return 135000;
            }
        }

        public long getTien() {
            return getXuat() * getDonGia();
        }

        public long getThue() {
            if (ma.substring(0, 1).equals("A")) {
                if (ma.endsWith("Y")) {
                    return getTien() * 8 / 100;
                } else {
                    return getTien() * 11 / 100;
                }
            } else {
                if (ma.endsWith("Y")) {
                    return getTien() * 17 / 100;
                } else {
                    return getTien() * 22 / 100;
                }
            }
        }

        @Override
        public String toString() {
            return ma + " " + nhap + " " + getXuat() + " " + getDonGia() + " " + getTien() + " " + getThue();
        }
        
        @Override
        public int compareTo(MatHang o) {
            return (int) (o.getThue() - this.getThue());
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MatHang> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ent = sc.nextLine();
            a.add(new MatHang(sc.nextLine(), sc.nextLong()));
        }
        String ent = sc.nextLine();
        String nhom = sc.nextLine();
        Collections.sort(a);
        for (MatHang m : a) {
            if (m.getNhom().equals(nhom)) {
                System.out.println(m);
            }
        }
    }
}
