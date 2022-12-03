/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class danh_sach_san_pham_2 {
    static class SanPham implements Comparable<SanPham>{
        private String id,name;
        private int gia,bh;       
        
        public SanPham(String id, String name, int gia, int bh) {
            this.id = id;
            this.name = name;
            this.gia = gia;
            this.bh = bh;
        }
        @Override
        public int compareTo(SanPham other){
            if(this.gia != other.gia)
                return other.gia-this.gia;
            return this.id.compareTo(other.id);
        }
        @Override
        public String toString(){
            return id + " " + name + " " + gia + " " + bh;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n= sc.nextInt();
        List<SanPham> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ent = sc.nextLine();
            SanPham x = new SanPham(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt());
            a.add(x);
        }
        Collections.sort(a);
        for(SanPham sp:a){
            System.out.println(sp);
        }
    }
}
