package oop;

import java.util.Scanner;

public class diem_can_bang {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int p = 1;
        while (p <= t) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int sum1 = 0;
            int k = 0;
            for (int i = 0; i < n; i++) {
                sum1 += a[i];
                if (sum1 - a[i] == (sum - a[i]) / 2) {
                    k = 1;
                    System.out.println(i + 1);
                    break;
                }
            }
            if (k == 0) {
                System.out.println(-1);
            }

            p++;
        }
    }
}
