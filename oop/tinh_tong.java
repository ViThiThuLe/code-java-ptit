package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class tinh_tong {

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t > 0) {
//            long n = sc.nextLong();
//            t--;
//
//            long sum = (n * (n + 1)) / 2;
//            System.out.println(sum);
//        }
//    }
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("DATA.in");
        long sum = 0;
        try {
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String temp = sc.next();
                try {
                    int x = Integer.parseInt(temp);
                    sum += x;
                } catch (NumberFormatException e) {
                }
            }
        } catch (FileNotFoundException e) {
        }
        System.out.println(sum);
    }
}
