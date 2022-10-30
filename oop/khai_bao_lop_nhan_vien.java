package oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class khai_bao_lop_nhan_vien {

    public static void main(String[] args) throws ParseException  {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String gt = sc.next();
        String ngaysinh = sc.next();
        String diachi = sc.nextLine();
        int thue = Integer.parseInt(sc.nextLine());
        //sc.nextLine();
        String hopdong = sc.next();

        NhanVien nv = new NhanVien("00001", ten, gt, ngaysinh, diachi, thue, hopdong);
        System.out.println(nv);
        sc.close();

    }
}

class NhanVien {

    private String ma, ten, gt, ngaysinh, diachi, hopdong;
    private int thue;

    public NhanVien(String ma, String ten, String gt, String ngaysinh, String diachi, int thue, String hopdong) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.gt = gt;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        this.ngaysinh = sdf.format(sdf.parse(ngaysinh));
        this.diachi = diachi;
        this.thue = thue;
        this.hopdong = sdf.format(sdf.parse(hopdong));
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gt + " " + ngaysinh + " " + diachi + " " + thue + " " + hopdong;
    }
}
