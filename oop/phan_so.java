
package oop;

import java.util.Scanner;

public class phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}

final class phanSo{
    private String tu, mau;
    private char x;
    
    public long gcd(long a, long b){
        while(a != b){
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        return b;
    }
    
    public phanSo(String tu, String mau){
        this.tu = tu;
        this.mau = mau;
    }
}
