package oop;

import java.util.Arrays;
import java.util.Scanner;

public class giao_cua_hai_day_so {


    public static void giao(int[] a, int[] b, int n, int m) {
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
        System.out.print("\n");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            b[i] = sc.nextInt();
        }

        giao(a, b, n, m);

    }
}
