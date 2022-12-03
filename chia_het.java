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
public class chia_het {
    static String MOD(String a, String b){
        BigInteger s = new BigInteger(a);
        BigInteger s1 = new BigInteger(b);
        if(s.mod(s1)==BigInteger.valueOf(0) || s1.mod(s)==BigInteger.valueOf(0))
            return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String b = sc.next();
            System.out.println(MOD(a, b));
        }
    }
}
