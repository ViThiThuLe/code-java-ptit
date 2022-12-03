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
public class tre_nhat_gia_nhat {
    static class People implements Comparable<People>{
        public String name,dob;
        private int d,m,y;

        public People(String name, String dob) {
            this.name = name;
            this.dob = dob;
            String[] temp = dob.split("/");
            d = Integer.parseInt(temp[0]);
            m = Integer.parseInt(temp[1]);
            y = Integer.parseInt(temp[2]);
        }
        @Override
        public int compareTo(People other){
           if(this.y == other.y){
               if(this.m == other.m){
                   return this.d - other.d;
               }
               return this.m - other.m;
           }
           return this.y - other.y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<People> a = new ArrayList<>();
        String line = sc.nextLine();
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            String[] s = line.split(" ");
            a.add(new People(s[0],s[1]));
        }
        Collections.sort(a);
        System.out.println(a.get(a.size()-1).name);
        System.out.println(a.get(0).name);
        
    }
}
