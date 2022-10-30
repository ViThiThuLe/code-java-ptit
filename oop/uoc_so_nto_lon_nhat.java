package oop;

import java.util.Scanner;

public class uoc_so_nto_lon_nhat {

    static long nto(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    static long uoc(long n) {
        long max = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                if(nto(i)==1) max = i;
                if(nto(n/i)==1) max = n/i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            long n = sc.nextLong();
            System.out.println(uoc(n));
            t--;
        }
    }
}
