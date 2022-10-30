package oop;

import java.util.Scanner;

public class uoc_so_chia_het_cho_2 {

    static int uoc(long n) {
        int dem = 0;
        if (n % 2 != 0) {
            return 0;
        }
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    dem++;
                }
                if ((n / i) % 2 == 0) {
                    dem++;
                }
                if (i == n / i) {
                    dem--;
                }
            }
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            long n = sc.nextLong();
            System.out.println(uoc(n));
            t--;
        }
    }
}
