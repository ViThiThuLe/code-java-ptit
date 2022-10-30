package oop;

import java.util.Scanner;

public class boi_so_chung_uoc_so_chung {

    static long ucln(long a, long b) {
        if (a < b) {
            long c = a;
            a = b;
            b = c;
        }
        while (b != 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long bcnn = a * b / ucln(a, b);
            System.out.println(bcnn + " " + ucln(a, b));
            t--;
        }
    }
}
