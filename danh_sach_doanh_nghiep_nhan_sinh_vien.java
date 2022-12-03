/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class danh_sach_doanh_nghiep_nhan_sinh_vien {
    static class DoanhNghiep{
        private String id, name;
        private int sv;

        public DoanhNghiep(String id, String name, int sv) {
            this.id = id;
            this.name = name;
            this.sv = sv;
        }

        public int getSv() {
            return sv;
        }

        public String getId() {
            return id;
        }

               
     
        @Override
        public String toString(){
            return id + " " + name + " " + sv;
        }
    }
    static class SortDoanhNghiep implements Comparator<DoanhNghiep>{
        @Override
        public int compare(DoanhNghiep a,DoanhNghiep b){
            if(b.getSv()!=a.getSv())
                return b.getSv()-a.getSv();
            return a.getId().compareTo(b.getId());
        }
    }
    public static void main(String[] args) {
        List<DoanhNghiep> arr = new ArrayList<>();
        int n;
        
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            for(int i=0;i<n;i++){
                String p = sc.nextLine();
                DoanhNghiep sub = new DoanhNghiep(sc.nextLine(),sc.nextLine(),sc.nextInt());
                arr.add(sub);
            }
        
        arr.sort(new SortDoanhNghiep());
        int q = sc.nextInt();
        while(q-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " + a + " DEN " + b + " SINH VIEN:");
            for(DoanhNghiep sub : arr){
                if(sub.getSv()<=b && sub.getSv() >=a)
                    System.out.println(sub);
            }
        }
    }
}
