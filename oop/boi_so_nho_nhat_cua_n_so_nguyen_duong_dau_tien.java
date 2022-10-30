package oop;

import java.util.Scanner;

public class boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {

    public static long ucln(long a, long b) {
        while (a != 0) {
            long c = b % a;
            b = a;
            a = c;
        }
        return b;
    }

    //c2: dung de quy
//    public static int ucln(int a, int b) {
//        if (b == 0) {
//            return a;
//        } else {
//            return ucln(b, a % b);
//        }
//    }
    public static long bcnn(long a, int b) {
        return a * b / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            long boi = 1;
            for (int i = 2; i <= n; i++) {
                boi = bcnn(boi, i);
            }

            System.out.println(boi);
            t--;
        }
    }
}
