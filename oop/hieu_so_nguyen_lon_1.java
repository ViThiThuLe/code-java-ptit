package oop;

import static java.lang.Integer.max;
import java.util.Scanner;

public class hieu_so_nguyen_lon_1 {

    public static String dao(String s) {
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        return s1;
    }

    public static String hieu(String s1, String s2) {
        String s = "";
        if (s1.compareTo(s2) >= 0) {
            s1 = dao(s1);
            s2 = dao(s2);
            int max = max(s1.length(), s2.length());
            int nho = 0;
            for (int i = max; i > s2.length(); i--) {
                s2 += "0";
            }
            for (int i = 0; i < max; i++) {
                int x = 0;
                if (s1.charAt(i) - '0' < s2.charAt(i) - '0') {
                    x = (s1.charAt(i) - '0') - (s2.charAt(i) - '0') + 10 - nho;
                    nho = 1;
                } else {
                    x = (s1.charAt(i) - '0') - (s2.charAt(i) - '0') - nho;
                    nho = 0;
                }
                s += x;
            }
        } else {
            s = hieu(s2, s1);
        }
        s = dao(s);

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            String s1, s2;
            s1 = sc.next();
            s2 = sc.next();

            System.out.println(hieu(s1, s2));

            t--;
        }
    }
}
