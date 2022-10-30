package oop;

import java.util.Scanner;

public class chuan_hoa_xau_ho_ten_1 {

    public static void chuanhoa(String s) {
        s = s.toLowerCase();
        String[] a = s.split("\\s+"); // tach tu trong xau roi gan vao mang
        s = "";
        for (int i = 0; i < a.length; i++) {
            s += String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            if (i < a.length - 1) {
                s += " ";
            }
        }
        System.out.println(s);
    }
    //c2:
//    public static String solve (String s) {
//        StringBuilder sb = new StringBuilder("");
//        String[] arr = s.split("\\s+");
//        // nGuYEN    vAN    naM
//        // arr[0] = Nguyen , arr[1] Van. arr[2] nam;

//        for (int i = 0; i < arr.length; i++) {
//            sb.append(Character.toUpperCase(arr[i].charAt(0)));
//            for (int j = 1; j < arr[i].length(); j++) {
//                sb.append(Character.toLowerCase(arr[i].charAt(j)));
//            }
//            if (i != arr.length - 1) sb.append(" ");
//        }
//        return sb.toString();
//    }
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
