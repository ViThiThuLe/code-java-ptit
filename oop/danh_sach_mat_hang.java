package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class danh_sach_mat_hang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<mathang> arr = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            arr.add(new mathang(i, sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
            sc.nextLine();
        }
        arr.sort((a, b) -> {
            if (a.loinhuan != b.loinhuan) {
                return b.loinhuan - a.loinhuan;
            } else {
                return a.index - b.index;
            }
        });
        arr.forEach(System.out::println);
        sc.close();
    }
}

class mathang {

    String id, ten, donvi;
    int mua, ban, index, loinhuan;

    public mathang(int index, String ten, String donvi, int mua, int ban) {
        this.id = "MH" + String.format("%03d", index);
        this.ten = ten;
        this.donvi = donvi;
        this.mua = mua;
        this.ban = ban;
        this.index = index;
        this.loinhuan = ban - mua;
    }

    @Override
    public String toString() {
        return id + " " + ten + " " + donvi + " " + mua + " " + ban + " " + loinhuan;
    }
}
