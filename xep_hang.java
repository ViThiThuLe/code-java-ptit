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
public class xep_hang {
    static class Khach implements Comparable<Khach>{
        public int t,d;

        public Khach(int t, int d) {
            this.t = t;
            this.d = d;
        }

        public int compareTo(Khach other){
            return this.t - other.t;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Khach> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(new Khach(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(a);
        long t = 0;
        for(Khach k:a){
            if(k.t>t)
                t = k.t + k.d;
            else
                t += k.d;
        }
        System.out.println(t);
    }
}
