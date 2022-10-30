package oop;

import java.util.Scanner;

public class dao_tu {

    public static String daotu(String s) {
        String[] a = s.split(" ");
        s = "";
        for (int i = 0; i < a.length; i++) {
            for(int j = a[i].length() - 1 ; j >= 0; j--){
                s += a[i].charAt(j);
            }
            if(i != a.length - 1)
                s += " ";
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(daotu(s));
            t--;
        }
    }
}
