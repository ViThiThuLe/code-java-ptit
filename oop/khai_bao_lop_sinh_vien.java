package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class khai_bao_lop_sinh_vien {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String lop = sc.next();
        String ngaysinh = sc.next();
        Float gpa = sc.nextFloat();
        SinhVien sv = new SinhVien("B20DCCN001", ten, lop, ngaysinh, gpa);
        System.out.println(sv);
        sc.close();
    }
}

class SinhVien {

    private String ma, ten, lop, ngaysinh;
    private Float gpa;

    SinhVien(String ma, String ten, String lop, String ngaysinh, Float gpa) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        this.ngaysinh = sdf.format(sdf.parse(ngaysinh));
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + ngaysinh + " " + String.format("%.2f", gpa);
    }
}
