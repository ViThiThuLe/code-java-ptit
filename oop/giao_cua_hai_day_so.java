package oop;

import java.util.*;

public class giao_cua_hai_day_so {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[100000];
        List<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (a[x] == 0) {
                a[x] = 1;
            }
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (a[x] == 1) {
                b.add(x);
                a[x] = 0;
            }
        }
        b.sort(Comparator.naturalOrder());
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
