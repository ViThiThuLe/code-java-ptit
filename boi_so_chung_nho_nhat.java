/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class boi_so_chung_nho_nhat {
    static BigInteger LCM(String a, String b){
        BigInteger s = new BigInteger(a);
        BigInteger s1 = new BigInteger(b);
        BigInteger mul = s.multiply(s1);
        BigInteger gcd = s.gcd(s1);
        BigInteger lcm = mul.divide(gcd);
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            System.out.println(LCM(a, b));
        }
    }
}
