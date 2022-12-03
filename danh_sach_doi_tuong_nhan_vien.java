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
public class danh_sach_doi_tuong_nhan_vien {
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
        @Override
        public String toString(){
            return id + " " + name + " " + gen + " " + dob + " " + add + " " + tax + " " + dky;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NhanVien a[] = new NhanVien[n];
        String p = sc.nextLine();
        for(int i=0;i<n;i++){    
            NhanVien temp = new NhanVien();
            temp.input(sc, i+1);
            a[i] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i].toString());
        }
        
    }
}
