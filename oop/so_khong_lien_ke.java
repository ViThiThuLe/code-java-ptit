package oop;

import java.util.Scanner;

public class so_khong_lien_ke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            String s = sc.next();
            int check = 1;
            int sum = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                int a = Integer.valueOf(s.charAt(i)) - 48;
                int b = Integer.valueOf(s.charAt(i + 1)) - 48;
                if (Math.abs(a - b) != 2) {
                    check = 0;
                    break;
                } else {
                    if(i == 0) sum += a;
                    sum += b;
                }
            }

            if (check == 1 && sum % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
