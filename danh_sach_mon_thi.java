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
public class danh_sach_mon_thi {
    static class MonHoc implements Comparable<MonHoc>{
        private String id,name,form;

        public MonHoc(String id, String name, String form) {
            this.id = id;
            this.name = name;
            this.form = form;
        }
        @Override
        public String toString(){
            return id + " " + name + " " + form;
        }
        @Override
        public int compareTo(MonHoc other){
            return this.id.compareTo(other.id);
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        String ent = sc.nextLine();
        List<MonHoc> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            MonHoc x = new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(x);
        }
        Collections.sort(a);
        for(MonHoc x:a){
            System.out.println(x);
        }
    }
}
