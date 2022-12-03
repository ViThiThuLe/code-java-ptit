/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class sap_xep_danh_sach_doi_tuong_nhan_vien {
    static class NhanVien{
        String id = "000", name, gen, dob, add, tax, dky;
        public void input(Scanner sc,int i){
            if(i<10)
               id += "0";
            id += String.valueOf(i);
            name = sc.nextLine();
            gen = sc.nextLine();
            dob = sc.nextLine();
            add = sc.nextLine();
            tax = sc.nextLine();
            dky = sc.nextLine();
        }
        public int getNgay(){
            return Integer.parseInt(dob.substring(0,2));
        }
        public int getThang(){
            return Integer.parseInt(dob.substring(3,5));
        }
        public int getNam(){
            return Integer.parseInt(dob.substring(6));
        }
        @Override
        public String toString(){
            return id + " " + name + " " + gen + " " + dob + " " + add + " " + tax + " " + dky;
        }
    }
    static class SortNhanVien implements Comparator<NhanVien>{

        @Override
        public int compare(NhanVien a, NhanVien b) {
            if(a.getNam()!=b.getNam())
                return a.getNam()-b.getNam();
            else{ 
                if(a.getThang()!=b.getThang())
                    return a.getThang()-b.getThang();
                return a.getNgay()-b.getNgay();
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<NhanVien> a = new ArrayList<>();
        String p = sc.nextLine();
        for(int i=0;i<n;i++){    
            NhanVien temp = new NhanVien();
            temp.input(sc, i+1);
            a.add(temp);
        }
        a.sort(new SortNhanVien());
        for(int i=0;i<n;i++){
            System.out.println(a.get(i).toString());
        }
        
    }
}
