package oop;

import java.util.Scanner;

public class tinh_so_fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            long a = 1;
            long b = 1;
            long c = 0;
            if (n <= 2) {
                c = 1;
            }
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
            t--;
        }
    }
}
