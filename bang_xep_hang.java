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
public class bang_xep_hang {
    static class SinhVien implements Comparable<SinhVien>{
        private String name;
        private int ac,sub;

        public SinhVien(String name, int ac, int sub) {
            this.name = name;
            this.ac = ac;
            this.sub = sub;
        }
        public void chuanhoa(){
            String[] s = name.toLowerCase().split("\\s+");
            String res = "";
            for(int i=0;i<s.length;i++){
                res += String.valueOf(s[i].charAt(0)).toUpperCase() + s[i].substring(1);
            }
            name = res;
        }
        @Override
        public String toString(){
            return name + " " + ac + " " + sub;
        }
        public int compareTo(SinhVien other){
            if(this.ac == other.ac){
                if(this.sub == other.sub){
                    return this.name.compareTo(other.name);
                }
                return this.sub - other.sub;
            }
            return other.ac - this.ac;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<SinhVien> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ent = sc.nextLine();
            a.add(new SinhVien(sc.nextLine(),sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(a);
        for(SinhVien sv:a){
            System.out.println(sv);
        }
    }
}
