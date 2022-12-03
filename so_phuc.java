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
public class so_phuc {
    static class SoThuc{
        public int thuc,ao;
        public void input(Scanner sc){
            thuc = sc.nextInt();
            ao = sc.nextInt();
        }
        static SoThuc tong(SoThuc a, SoThuc b){
            SoThuc res = new SoThuc();
            res.thuc = a.thuc + b.thuc;
            res.ao = a.ao + b.ao;
            return res;
        }
        static SoThuc tich(SoThuc a, SoThuc b){
            SoThuc res = new SoThuc();
            res.thuc = a.thuc*b.thuc + a.ao*b.ao*(-1);
            res.ao = a.ao*b.thuc + a.thuc*b.ao;
            return res;
        }
        @Override
        public String toString(){
            String dau = "+";
            if(ao<0){
                dau = "-";
                ao*= -1;
            }
            return thuc + " " + dau + " " + ao + "i";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            SoThuc a = new SoThuc();
            SoThuc b = new SoThuc();
            a.input(sc);
            b.input(sc);
            SoThuc c = SoThuc.tich(SoThuc.tong(a,b),a);
            SoThuc d = SoThuc.tich(SoThuc.tong(a, b),SoThuc.tong(a, b));
            System.out.println(c + ", " + d);
        }
    }
}
