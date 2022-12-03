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
public class danh_sach_doanh_nghiep {
    static class DoanhNghiep{
        private String id, name;
        private int sv;

        public DoanhNghiep(String id, String name, int sv) {
            this.id = id;
            this.name = name;
            this.sv = sv;
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
            return a.getId().compareTo(b.getId());
        }
    }
    public static void main(String[] args) {
        List<DoanhNghiep> a = new ArrayList<>();
        int n;
        try{
            Scanner sc = new Scanner(new File("DN.in"));
            n = sc.nextInt();
            for(int i=0;i<n;i++){
                String p = sc.nextLine();
                DoanhNghiep sub = new DoanhNghiep(sc.nextLine(),sc.nextLine(),sc.nextInt());
                a.add(sub);
            }
        }
        catch(FileNotFoundException e){
            
        }
        a.sort(new SortDoanhNghiep());
        for(DoanhNghiep sub : a){
            System.out.println(sub);
        }
    }
}
