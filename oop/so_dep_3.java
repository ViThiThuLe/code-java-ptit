package oop;

import java.util.Scanner;

public class so_dep_3 {

    public static int nto(int n) {
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void ktra(String s) {
        int n = s.length();
        int check = 0;
        String dao = new StringBuilder(s).reverse().toString();
        if (s.equals(dao)) {
            for (int i = 0; i < n; i++) {
                int a = Integer.valueOf(s.charAt(i)) - 48;
                if (nto(a) == 1) {
                    check = 1;
                } else {
                    check = 0;
                }
            }
        } else {
            check = 0;
        }
        if (check == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            String s = sc.next();
            ktra(s);
            t--;
        }
    }

}
