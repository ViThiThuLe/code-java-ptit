package oop;

import java.util.Scanner;

public class so_dep_1 {

    public static void ktra(String s) {
        int n = s.length() - 1;
        int check = 0;
        String dao = new StringBuilder(s).reverse().toString();
        if (s.equals(dao)) {
            for (int i = 0; i <= n / 2; i++) {
                int a = Integer.valueOf(s.charAt(i)) - 48;
                int b = Integer.valueOf(s.charAt(n - i)) - 48;
                if (a % 2 == 0 && b % 2 == 0) {
                    if (a == b) {
                        check = 1;
                    } else {
                        check = 0;
                        break;
                    }

                } else {
                    check = 0;
                    break;
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
