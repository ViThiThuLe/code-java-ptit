package oop;

import java.util.Scanner;

public class chuan_hoa_xau_ho_ten_2 {

//    public static void chuanhoa(String s) {
//        s = s.toLowerCase();
//        String[] a = s.split("\\s+");
//        s = "";
//        for (int i = 1; i < a.length; i++) {
//            s += String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
//            if (i != a.length - 1) {
//                s += " ";
//            } else {
//                s += ", ";
//            }
//        }
//        s += a[0].toUpperCase();
//        System.out.println(s);
//    }
    public static void chuanhoa(String s) {
        StringBuilder str = new StringBuilder("");
        String[] a = s.split("\\s+");
        for (int i = 1; i < a.length; i++) {
            str.append(Character.toUpperCase(a[i].charAt(0)));
            for (int j = 1; j < a[i].length(); j++) {
                str.append(Character.toLowerCase(a[i].charAt(j)));
            }
            if (i != a.length - 1) {
                str.append(" ");
            } else {
                str.append(", ");
            }
        }
        str.append(a[0].toUpperCase());
        System.out.println(str.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t > 0) {
            String s = sc.nextLine();
            s = s.trim();
            chuanhoa(s);
            t--;
        }
    }
}
