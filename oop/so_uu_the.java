package oop;

import java.util.Scanner;

public class so_uu_the {

    public static void ktra(String s) {
        int chan = 0, le = 0;
        int n = s.length();
        int check = 1;
        if (s.charAt(0) == '0') {
            System.out.println("INVALID");
        } else {
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    int a = Integer.valueOf(s.charAt(i)) - 48;
                    if (a % 2 == 0) {
                        chan++;
                    } else {
                        le++;
                    }
                } else {

                    check = 0;
                    break;
                }
            }

            if (check == 0) {
                System.out.println("INVALID");
            } else {
                if ((chan > le && n % 2 == 0) || (chan < le && n % 2 != 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
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
