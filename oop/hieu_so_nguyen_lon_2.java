package oop;

import java.math.BigInteger;
import java.util.Scanner;

public class hieu_so_nguyen_lon_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();
        
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        
        System.out.println(a.subtract(b));
    }
}
