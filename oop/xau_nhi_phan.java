package oop;

import java.util.Scanner;

public class xau_nhi_phan {

    public static long[] a = new long[1000];

    public static void fibo() {
        a[1] = 1;
        a[2] = 1;
        for (int i = 3; i <= 93; i++) {
            a[i] = a[i - 2] + a[i - 1];
        }
    }

    public static int ktra(int n, long k) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (k <= a[n - 2]) {
            return ktra(n - 2, k);
        }
        return ktra(n - 1, k - a[n - 2]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            fibo();
            System.out.println(ktra(n, k));
        }
    }
}
