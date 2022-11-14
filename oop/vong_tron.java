package oop;

import java.util.*;

public class vong_tron {

    public static int ktra(String s) {
        int a[] = new int[26];
        int b[] = new int[26];
        Arrays.fill(a, -1);
        Arrays.fill(b, 0);
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i) - 'A';
            if (a[k] == -1) {
                b[k]++;
                a[k] = i;
                continue;
            }
            for (int j = a[k] + 1; j < i; j++) {
                if (b[s.charAt(j) - 'A'] == 1) {
                    res++;
                }
            }
            b[k]++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(ktra(s));
    }
}
