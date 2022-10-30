package oop;

import java.util.Scanner;

public class so_chinh_phuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            double a = Math.sqrt(n);
            System.out.println(a == (int) a ? "YES" : "NO");
            t--;
        }
    }
}
