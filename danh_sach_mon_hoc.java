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
public class danh_sach_mon_hoc {
    static class MonHoc{
        private String id, name;
        private int tin;

        public MonHoc(String id, String name, int tin) {
            this.id = id;
            this.name = name;
            this.tin = tin;
        }

        public String getName() {
            return name;
        }
     
        @Override
        public String toString(){
            return id + " " + name + " " + tin;
        }
    }
    static class SortMonHoc implements Comparator<MonHoc>{
        @Override
        public int compare(MonHoc a,MonHoc b){
            return a.getName().compareTo(b.getName());
        }
    }
    public static void main(String[] args) {
        List<MonHoc> a = new ArrayList<>();
        int n;
        try{
            Scanner sc = new Scanner(new File("MONHOC.in"));
            n = sc.nextInt();
            for(int i=0;i<n;i++){
                String p = sc.nextLine();
                MonHoc sub = new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextInt());
                a.add(sub);
            }
        }
        catch(FileNotFoundException e){
            
        }
        a.sort(new SortMonHoc());
        for(MonHoc sub : a){
            System.out.println(sub);
        }
    }
}
