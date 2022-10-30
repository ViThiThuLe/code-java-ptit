package oop;

import java.util.Scanner;

public class tong_uoc_so_1 {

    public static boolean nto(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int tong(int s) {
        int j = 2;
        int[] b = new int[100];
        int k = 0;
        while (s > 1) {
            if (s % j == 0) {
                s /= j;
                b[k] = j;
                k++;
            } else {
                j++;
            }
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += b[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int i = 0;
        int sum = 0;
        while (n > 0) {
            int s = sc.nextInt();
            if (nto(s) == true) {
                a[i] = s;
                i++;
            } else {
                a[i] = tong(s);
                i++;
            }
            n--;
        }
        for (int j = 0; j < i; j++) {
            sum += a[j];
        }
        System.out.println(sum);
    }
}
