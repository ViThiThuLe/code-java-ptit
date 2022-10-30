package oop;

import java.util.Scanner;

public class tinh_tong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            t--;

            long sum = (n * (n + 1)) / 2;
            System.out.println(sum);
        }
    }
}
