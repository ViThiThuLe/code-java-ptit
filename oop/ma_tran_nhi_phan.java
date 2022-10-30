package oop;

import java.util.Scanner;

public class ma_tran_nhi_phan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dem = 0;

        for (int i = 0; i < n; i++) {
            int dem0 = 0;
            int dem1 = 0;
            for (int j = 0; j < 3; j++) {
                int a = sc.nextInt();
                if (a == 1) {
                    dem1++;
                } else {
                    dem0++;
                }
            }
            if (dem1 > dem0) {
                dem++;
            }
        }
        System.out.println(dem);

    }
}
