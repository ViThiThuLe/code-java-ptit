package oop;

import java.util.Scanner;

public class mang_doi_xung {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int check = 1;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i <= n / 2; i++) {
                if (a[i] != a[n - i - 1]) {
                    check = 0;
                    break;
                }
            }
                System.out.println(check == 1 ?"YES":"NO");
           
            t--;
        }
    }
}
