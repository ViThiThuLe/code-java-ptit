/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class tinh_tien_phong {

    static class KhachHang implements Comparable<KhachHang>{

        private String ten, phong, dnhan, dtra, ma = "KH";
        private int dichvu;

        public KhachHang(int id, String ten, String phong, String dnhan, String dtra, int dichvu) {
            if (id < 10) {
                this.ma += "0";
            }
            this.ma += String.valueOf(id);
            this.ten = this.chuanHoaTen(ten);
            this.phong = phong;
            this.dnhan = dnhan;
            this.dtra = dtra;
            this.dichvu = dichvu;
        }

        public String chuanHoaTen(String ten) {
            String res = "";
            StringTokenizer s = new StringTokenizer(ten);
            while (s.hasMoreTokens()) {
                String temp = s.nextToken().toLowerCase();
                res += String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1) + " ";
            }
            return res;
        }

        public String chuanHoaNgay(String s) {
            if (s.charAt(1) == '/') {
                s = "0" + s;
            }
            if (s.charAt(4) == '/') {
                s = s.substring(0, 3) + "0" + s.substring(3);
            }
            return s;

        }

        public int getSoNgayO() {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d1 = LocalDate.parse(chuanHoaNgay(dnhan), format);
            LocalDate d2 = LocalDate.parse(chuanHoaNgay(dtra),format);
            return (int) ChronoUnit.DAYS.between(d1, d2) + 1;
        }
        public int getGiaPhong(){
            switch(phong.charAt(0)){
                case '1':
                    return 25;
                case '2':
                    return 34;
                case '3':
                    return 50;
                case '4':
                    return 80;
                default:
                    return 1;
            }
        }
        public int getThanhTien(){
            return getGiaPhong() * getSoNgayO() + dichvu;
        }
        @Override
        public String toString() {
            return ma + " " + ten + " " + phong + " " + this.getSoNgayO() + " " + getThanhTien();
        }

        @Override
        public int compareTo(KhachHang o) {
            return o.getThanhTien() - this.getThanhTien();
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = sc.nextInt();
        List<KhachHang> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ent = sc.nextLine();
            a.add(new KhachHang(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }
        Collections.sort(a);
        for(KhachHang k:a){
            System.out.println(k);
        }
    }
}
