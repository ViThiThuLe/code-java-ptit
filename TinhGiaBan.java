/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TinhGiaBan {
    static class SanPham implements Comparable<SanPham>{
        private String ten, dv, id;
        private float sl;
        private float gianhap;
        private long vanchuyen, thanhtien, giaban;

        public SanPham(int id,String ten, String dv, float gianhap,  float sl) {
            this.id = "MH";
            if(id<10)
                this.id+="0";
            this.id += String.valueOf(id);
            this.ten = ten;
            this.dv = dv;
            this.sl = sl;
            this.gianhap = gianhap;
            this.vanchuyen = (long)Math.round(this.sl*this.gianhap*5.0/100.0);
            this.thanhtien = (long)Math.round(this.sl*this.gianhap) + this.vanchuyen;
            this.giaban = (long)Math.ceil(Math.round( (this.thanhtien + this.thanhtien*2.0/100.0)/this.sl)/100.0)*100;
        }
        @Override
        public String toString(){
            return id + " " + ten + " " + dv + " " + vanchuyen + " " + thanhtien + " " + giaban;
        }
        public int compareTo(SanPham other){
            return (int)(other.giaban - this.giaban);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<SanPham> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ent = sc.nextLine();
            SanPham temp = new SanPham(i+1,sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat());
            a.add(temp);
        }
        Collections.sort(a);
        for(SanPham sp : a){
            System.out.println(sp);
        }
    }
}
