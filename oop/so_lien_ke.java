package oop;

import java.util.Scanner;

public class so_lien_ke {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            String s = sc.next();
            int check = 1;
            for (int i = 0; i < s.length() - 1; i++) {
                int a = Integer.valueOf(s.charAt(i));
                int b = Integer.valueOf(s.charAt(i + 1));
                if (Math.abs(a - b) != 1) {
                    check = 0;
                    break;
                } else {
                    check = 1;
                }
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
