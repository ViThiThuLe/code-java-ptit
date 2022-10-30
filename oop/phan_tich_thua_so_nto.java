package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class phan_tich_thua_so_nto {

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

    public static List<Integer> phanTich(int n) {
        int i = 2;
        List<Integer> a = new ArrayList<>();
        // phân tích
        while (n > 1) {
            if (nto(i)) {
                if (n % i == 0) {
                    n = n / i;
                    a.add(i);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }
        // nếu listNumbers trống thì add n vào listNumbers
        if (a.isEmpty()) {
            a.add(n);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int tt = 1;

        while (t > 0) {
            int n = sc.nextInt();
            List<Integer> a = phanTich(n);
            System.out.print("Test " + tt + ": ");
            int size = a.size();
            int vt = 0;

            for (int i = 0; i < size - 1; i++) {
                if (a.get(i) != a.get(i + 1)) {
                    System.out.print(a.get(i) + "(" + (i - vt + 1) + ") ");
                    vt = i + 1;
                }
                if (i == size - 2) {
                    System.out.print(a.get(i + 1) + "(" + (i - vt + 2) + ") ");
                }
            }
            System.out.print("\n");
            t--;
            tt++;
        }
    }
}
