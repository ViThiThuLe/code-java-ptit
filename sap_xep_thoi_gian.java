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
public class sap_xep_thoi_gian {
    static class Time{
        public int h,m,s;
        public void input(Scanner sc){
            h = sc.nextInt();
            m = sc.nextInt();
            s = sc.nextInt();
        }
        @Override
        public String toString(){
            return h + " " + m + " " + s;
        }
    }
    static class SortTime implements Comparator<Time>{
        @Override
        public int compare(Time a, Time b){
            if(a.h!=b.h)
                return a.h-b.h;
            else{
                if(a.m!=b.m)
                    return a.m-b.m;
                else
                    return a.s-b.s;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            Time temp = new Time();
            temp.input(sc);
            a.add(temp);
        }
        a.sort(new SortTime());
        for(int i=0;i<n;i++){
            System.out.println(a.get(i).toString());
        }
    }
}
