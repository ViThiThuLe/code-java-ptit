package oop;

import java.util.Scanner;

public class liet_ke_to_hop_1 {

    static int n, k, dem = 0;
    static int[] a = new int[1000];

    public static void inra() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    public static void tohop(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                inra();
                dem++;
            } else {
                tohop(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        tohop(1);
        System.out.println("\n");
        System.out.println("Tong cong co " + dem + " to hop");
    }
}
