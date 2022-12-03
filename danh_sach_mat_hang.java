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
public class danh_sach_mat_hang {
    static class Product{
        private String id,name,donvi;
        private int buy,sell,loi;
        public void input(Scanner sc,int id){
            if(id<10){
                this.id = "MH00" + String.valueOf(id);
            }
            else
                this.id = "MH0" + String.valueOf(id);
            name = sc.nextLine();
            donvi = sc.nextLine();
            buy = sc.nextInt();
            sell = sc.nextInt();
            loi = sell-buy;
        }

        public int getLoi() {
            return loi;
        }
        
        @Override
        public String toString(){
            return id + " " + name + " " + donvi + " " + buy + " " + sell + " " + loi;
        }
    }
    static class SortProduct implements Comparator<Product>{
        @Override
        public int compare(Product a, Product b){
            return -a.getLoi()+b.getLoi();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Product> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            Product temp = new Product();
            String p = sc.nextLine();
            temp.input(sc, i+1);
            a.add(temp);
        }
        a.sort(new SortProduct());
        for(int i=0;i<n;i++){
            System.out.println(a.get(i).toString());
        }
    }
}
