/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class loai_phong {
    static class LoaiPhong implements Comparable<LoaiPhong>{
        private String sign,name, gia,pv;

        public LoaiPhong(String line) {
            String[] a = line.split(" ");
            sign = a[0];
            name = a[1];
            gia = a[2];
            pv = a[3];
        }
        
        @Override
        public int compareTo(LoaiPhong a){
            return this.name.compareTo(a.name);
        }
        @Override
        public String toString(){
            return sign + " " + name + " " + gia + " " + pv;
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
