/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tinh_toan_phan_so {
    static class PhanSo{
        private long tu,mau;

        public long getMau() {
            return mau;
        }

        public long getTu() {
            return tu;
        }
        public PhanSo(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
        }
        public static long gcd(long a, long b){
            while(a*b!=0){
                if(a>b) a %= b;
                else b%=a;
            }
            return a+b;
        }
        public static long lcm(long a,long b){
            return a*b/gcd(a,b);
        }
        public static PhanSo rutGon(PhanSo a){
            long gcd = gcd(a.getTu(),a.getMau());
            return new PhanSo(a.getTu()/gcd,a.getMau()/gcd);
        }
        public static PhanSo tong(PhanSo a, PhanSo b){
            long lcm = lcm(a.getMau(),b.getMau());
            long tu1 = a.getTu()*(lcm/a.getMau());
            long tu2 = b.getTu()*(lcm/b.getMau());
            return rutGon(new PhanSo(tu1+tu2,lcm));
        }
        public static PhanSo tich(PhanSo a, PhanSo b){
            return rutGon(new PhanSo(a.getTu()*b.getTu(),a.getMau()*b.getMau()));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            PhanSo a = new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(),sc.nextLong());
            PhanSo c = PhanSo.tich(PhanSo.tong(a,b),PhanSo.tong(a, b));
            PhanSo d = PhanSo.tich(a, PhanSo.tich(b,c));
            System.out.println(c.getTu() + "/" + c.getMau() + " " + d.getTu() + "/" + d.getMau());
        }
    }
}
