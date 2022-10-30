package oop;

import java.util.Scanner;

public class bai_toan_tinh_cong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thunhap x = new Thunhap(sc.nextLine(), sc.nextLong(), sc.nextInt(), sc.next());
        System.out.println(x.toString());
    }
}

class Thunhap {

    private String mnv, name, chucvu;
    private long luongthang, luongcoban;
    private int songay;
    private long phucap, thunhap, thuong;

    public long phuCap() {
        if (chucvu.substring(0).equals("GD")) {
            return 250000;
        }
        if (chucvu.substring(0).equals("PGD")) {
            return 200000;
        }
        if (chucvu.substring(0).equals("TP")) {
            return 180000;
        }
        if (chucvu.substring(0).equals("NV")) {
            return 150000;
        }
        return 0;
    }

    public long Thuong() {
        if (songay >= 25) {
            return luongthang * 20 / 100;
        }
        if (songay >= 22 && songay < 25) {
            return luongthang * 10 / 100;
        }
        return 0;
    }

    public Thunhap(String name, long luongcoban, int songay, String chucvu) {
        this.mnv = "NV01";
        this.name = name;
        this.chucvu = chucvu;
        this.songay = songay;
        this.luongthang = songay * luongcoban;
        this.thuong = Thuong();
        this.phucap = phuCap();
        this.thunhap = luongthang + phuCap() + Thuong();
    }

    @Override
    public String toString() {
        return mnv + " " + name + " " + String.valueOf(luongthang) + " " + String.valueOf(thuong) + " " + String.valueOf(phucap) + " " + String.valueOf(thunhap);
    }
}
