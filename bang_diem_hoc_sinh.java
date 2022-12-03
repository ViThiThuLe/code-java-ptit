/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class bang_diem_hoc_sinh {
    static class Student{
        private String name,id;
        private double[] p;
        private double ptb = 0;
        public int idx;
        public int x;
        public int xx;
        public float k;

        public Student(String name, double[] p,int id) {
            if(id<10)
                this.id = "HS0" + String.valueOf(id);
            else
                this.id = "HS" + String.valueOf(id);
            this.idx = id;
            this.name = name;
            this.p = p;
            for(int i=0;i<10;i++){
                if (i<2) 
                    ptb+= p[i];
                ptb += p[i];
            }
            ptb = ptb/12;
            k=(float)ptb;
            x=(int)Math.floor(k*100);
            xx=x%10;
            if(xx>=5){
                ptb=((x+10-xx)/100.0);
            }
            else{
                ptb=((x-xx)/100.0);
            }
//            ptb = Math.round(ptb * 10.0) / 10.0;
        }
        public String setLoai(){
            if(ptb >= 9.0)
                return "XUAT SAC";
            if(ptb >= 8.0)
                return "GIOI";
            if(ptb >=7.0)
                return "KHA";
            if(ptb >= 5.0)
                return "TB";
            return "YEU";
        }

        public double getPtb() {
            return ptb;
        }
        
        @Override
        public String toString(){
            return id + " " + name + " " + String.valueOf(ptb) + " " + setLoai();
        }
    }
    static class SortStudent implements Comparator<Student>{
        @Override
        public int compare(Student a, Student b){
            if(b.getPtb()!= a.getPtb())
                return Double.compare(b.getPtb(), a.getPtb());
            return a.idx - b.idx;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> a = new ArrayList<>();
        for(int i = 0;i<n;i++){
            String ent = sc.nextLine();
            String s = sc.nextLine();
            double[] p = new double[10];
            for(int j=0;j<10;j++)
                p[j] = sc.nextFloat();
            a.add(new Student(s,p,i+1));
        }
        a.sort(new SortStudent());
        for(Student st:a){
            System.out.println(st);
        }
    }

}
