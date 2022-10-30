package oop;

import java.util.Scanner;

public class so_dep_2 {

    public static void ktra(String s) {
        int n = s.length() - 1;
        int check = 0;
        int sum = 0;
        String dao = new StringBuilder(s).reverse().toString();
        if (s.equals(dao)) {
            for (int i = 0; i <= n; i++) {
                int a = Integer.valueOf(s.charAt(i)) - 48;
                sum += a;
            }
            if (s.charAt(0) == '8' && s.charAt(n) == '8') {
                check = 1;
            }
            else check = 0;
        } else {
            check = 0;
        }
        if (check == 1 && sum % 10 == 0) {
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
