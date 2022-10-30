package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class quan_ly_bai_tap_nhom_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<hocSinh> arr = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String sdt = sc.nextLine();
            int stt = Integer.parseInt(sc.nextLine());
            hocSinh x = new hocSinh(ma, ten, sdt, stt);
            arr.add(x);
        }
        String[] nhom = new String[m + 1];
        for (int i = 1; i <= m; i++) {
            nhom[i] = sc.nextLine();
        }

        Collections.sort(arr, new Comparator<hocSinh>() {
            @Override
            public int compare(hocSinh t, hocSinh t1) {
                return t.getMa().compareTo(t1.getMa());
            }

        });
        for (hocSinh x : arr) {
            System.out.println(x.toString() + nhom[x.getStt()]);
        }

    }

}

class hocSinh {

    private String ma, ten, sdt;
    private int stt;

    hocSinh(String ma, String ten, String sdt, int stt) {
        this.ma = ma;
        this.ten = ten;
        this.sdt = sdt;
        this.stt = stt;
    }

    public String getMa() {
        return ma;
    }

    public int getStt() {
        return stt;
    }

    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + this.sdt + " " + this.stt + " ";
    }

}
