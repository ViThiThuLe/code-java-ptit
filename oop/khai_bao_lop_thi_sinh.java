package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class khai_bao_lop_thi_sinh {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ngaysinh = sc.next();
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        float d3 = sc.nextFloat();
        Student st = new Student(ten, ngaysinh, d1, d2, d3);
        System.out.println(st);
        sc.close();
    }
}

class Student {

    String ten, ngaysinh;
    float d1, d2, d3, tong;

    public Student(String ten, String ngaysinh, float d1, float d2, float d3) throws ParseException {
        this.ten = ten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        tong = d1 + d2 + d3;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        this.ngaysinh = sdf.format(sdf.parse(ngaysinh));
    }

    @Override
    public String toString() {
        return ten + " " + ngaysinh + " " + String.format("%.1f", tong);
    }

}
