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
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
class Student{
    private String ten,loai;
    private int d1,d2,d3,ma;
    private float tb;

    public Student(int ma,String ten, int d1, int d2, int d3) {
        this.ten = this.chuanHoaTen(ten);
        this.ma = ma;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.setTb();
        this.setLoai();
    }

    public float getTb() {
        return tb;
    }
    
    public String getId() {
        String id = "SV";
        if(ma<10)
            id += "0";
        id+=String.valueOf(ma);
        return id;
    }    
    
    public String chuanHoaTen(String ten){
        StringTokenizer s = new StringTokenizer(ten);
        String res = "";
        while(s.hasMoreTokens()){
            String temp = s.nextToken().toLowerCase();
            res += String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1) + " ";
        }
        return res;
    }
    public void setTb(){
        float diem = (float) (Math.round((d1*0.25+d2*0.35+d3*0.4)*100.0)/100.00);
        this.tb = diem;
    }

    public void setLoai() {
        if(tb>=8.0)
            loai = "GIOI";
        else if(tb>=6.5)
            loai = "KHA";
        else if(tb>=5.0)
            loai = "TRUNG BINH";
        else
            loai = "KEM";
    }
    
    @Override
    public String toString() {
        return getId() + " " + ten + " " + String.format("%.2f", tb) + " " + loai;
    }
    
}
public class xep_loai {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        List<Student> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ent = sc.nextLine();
            list.add(new Student(i+1,sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        list.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {               
                return Float.compare(o2.getTb(), o1.getTb());
            }
            
        });        
        for(Student s:list){
            System.out.println(s);
        }
    }
}
