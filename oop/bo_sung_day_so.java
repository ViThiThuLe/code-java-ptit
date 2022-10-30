package oop;

import java.util.Scanner;

public class bo_sung_day_so {

    public static void ktra(int[] a, int n) {
        int check = 1;
        for (int i = 1; i < a[1]; i++) {
            System.out.println(i);
            check = 0;
        }
        for (int i = 1; i < n; i++) {
            if (a[i] + 1 != a[i + 1]) {
                check = 0;
                for (int j = a[i] + 1; j < a[i + 1]; j++) {
                    System.out.println(j);
                }
            }
        }
        if (check == 1) {
            System.out.println("Excellent!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        ktra(a, n);
    }
}
