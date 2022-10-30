package oop;

import java.util.Scanner;

public class so_tam_phan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int check = 1;
            while (n > 1) {
                int m = n % 10;
                if (m != 0 && m != 1 && m != 2) {
                    check = 0;
                    break;
                }
                n /= 10;
            }
            if (check == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
