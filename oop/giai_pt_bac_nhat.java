package oop;

import java.util.Scanner;

public class giai_pt_bac_nhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = -b / a;

        if (a == 0) {
            if (b != 0) {
                System.out.println("VN");
            } else {
                System.out.println("VSN");
            }
        } else {
            System.out.format("%.2f", c);
        }
    }
}
