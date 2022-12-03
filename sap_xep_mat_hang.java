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
public class sap_xep_mat_hang {
    static class MatHang implements Comparable<MatHang>{
        private String id,name,group;
        private double buy,sell,profit;

        public MatHang(int id, String name, String group, double buy, double sell) {
            this.id = "MH";
            if(id<10) this.id += "0";
            this.id += String.valueOf(id);
            this.name = name;
            this.group = group;
            this.buy = buy;
            this.sell = sell;
            this.profit = sell-buy;
        }
        @Override
        public String toString(){
            return id + " " + name + " " + group + " " + String.format("%.2f", profit);
        }
        @Override
        public int compareTo(MatHang other){
            return Double.compare(other.profit,this.profit);
        }
    }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n= sc.nextInt();
        List<MatHang> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ent = sc.nextLine();
            MatHang x = new MatHang(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a);
        for(MatHang sp:a){
            System.out.println(sp);
        }
    }
}
