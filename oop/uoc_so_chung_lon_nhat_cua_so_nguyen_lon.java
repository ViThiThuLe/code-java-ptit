
package oop;

import java.math.BigInteger;
import java.util.Scanner;

public class uoc_so_chung_lon_nhat_cua_so_nguyen_lon {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();
        
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        
        System.out.println(a.gcd(b));
        t--;
        }
    }
}
