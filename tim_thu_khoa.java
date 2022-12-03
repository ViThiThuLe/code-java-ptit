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
public class tim_thu_khoa {
    static class ThiSinh{
        private String name,dob;
        private double d1,d2,d3;
        private int id;
        public void input(Scanner sc,int i){
            id = i;
            name = sc.nextLine();
            dob = sc.nextLine();
            d1 = sc.nextDouble();
            d2 = sc.nextDouble();
            d3 = sc.nextDouble();           
        }
        public double getTongDiem(){
            return d1+d2+d3;
        }
        @Override
        public String toString(){
            return id + " " + name + " " + dob + " " + getTongDiem();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThiSinh a[] = new ThiSinh[n];
        double max = 0;
        for(int i=0;i<n;i++){
            String p = sc.nextLine();
            ThiSinh temp = new ThiSinh();
            temp.input(sc,i+1);
            a[i] = temp;
            if(a[i].getTongDiem()>max) max = a[i].getTongDiem();
        }
        for(ThiSinh ts:a){
            if(ts.getTongDiem() == max)
                System.out.println(ts.toString());
        }
    }
}
