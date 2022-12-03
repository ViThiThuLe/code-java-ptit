package test;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class sap_xep_danh_sach_mat_hang {
    static class MatHang{
        private int id;
        private String name,group;
        private float buy,sell,profit;
        public void input(Scanner sc,int i){
            id = i;
            name = sc.nextLine();
            group = sc.nextLine();
            buy = sc.nextFloat();
            sell = sc.nextFloat();
            profit = sell-buy;
        }

        public float getProfit() {
            return profit;
        }
        
        @Override
        public String toString(){
            return id + " " + name + " " + group + " " + String.format("%.2f", profit);
        }
    }
    static class SortMatHang implements Comparator<MatHang>{
        @Override
        public int compare(MatHang a, MatHang b){
            return Float.compare(b.getProfit(), a.getProfit());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MatHang> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            MatHang x = new MatHang();
            String ent = sc.nextLine();
            x.input(sc, i+1);
            a.add(x);
        }
        a.sort(new SortMatHang());
        for(MatHang i : a){
            System.out.println(i);
        }
    }
}
