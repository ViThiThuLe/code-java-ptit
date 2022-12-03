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
public class khai_bao_lop_nhan_vien {
    static class NhanVien{
        String id = "00001", name, gen, dob, add, tax, dky;
        public void input(){
            Scanner sc = new Scanner(System.in);
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
        NhanVien nv = new NhanVien();
        nv.input();
        System.out.println(nv.toString());
    }
}
