package oop;

import java.util.Scanner;

public class dem_so_lan_xuat_hien {

    public static void ktra(int[] a, int n) {
        int dem, k;
        for (int i = 0; i < n; i++) {
            dem = 0;
            k = 1;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    k = 0;
                }
            }
            if (k == 1) {
                for (int j = 0; j < n; j++) {
                    if (a[i] == a[j]) {
                        dem++;
                    }
                }
            System.out.println(a[i] + " xuat hien " + dem + " lan");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int tt = 1;

        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Test " + tt + ":");
            ktra(a, n);
            t--;
            tt++;
        }
    }
}
