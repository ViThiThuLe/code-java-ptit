package oop;

import java.util.Scanner;

public class diem_can_bang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int vt = -1;
            int dt = 0, dp = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                dp += a[i];
            }
            
            dp -= a[0];
            for (int i = 1; i < n; i++) {
                if (dt == dp) {
                    vt = i;
                    break;
                } else {
                    dt += a[i - 1];
                    dp -= a[i];
                }
            }

            System.out.println(vt);
            t--;
        }
    }
}
