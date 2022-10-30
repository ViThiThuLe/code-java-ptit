package oop;

import java.util.Scanner;

public class cat_doi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int check = 1;
            int k = 0;
            String s = sc.next();
            s = s.replace('9', '0');
            s = s.replace('8', '0');
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '8' && s.charAt(i) != '9' && s.charAt(i) != '0' && s.charAt(i) != '1') {
                    System.out.println("INVALID");
                    check = 0;
                    break;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0') {
                    k = 1;
                    break;
                } else {
                    k = 0;
                }
            }
            if (check == 1 && k == 1) {
                System.out.println(s.replaceFirst("^0+(?!$)", ""));
            }
            if(k == 0) System.out.println("INVALID");
            t--;
        }
    }
}
