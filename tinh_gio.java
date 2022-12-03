/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tinh_gio {
    static class Player implements Comparable<Player>{
        private String id,name,in,out;
        private int h,m;

        public Player(String id, String name, String in, String out) {
            this.id = id;
            this.name = name;
            this.in = in;
            this.out = out;
        }
        
        public void count(){
            String[] temp1 = in.split(":");
            String[] temp2 = out.split(":");
            int[] vao = new int[2];
            int[] ra = new int[2];
            for(int i=0;i<2;i++){
                vao[i] = Integer.parseInt(temp1[i]);
                ra[i] = Integer.parseInt(temp2[i]);                
            }
            if(ra[1]<vao[1]){
                ra[1]+=60;
                ra[0]-=1;
            }
            h = ra[0]-vao[0];
            m = ra[1]-vao[1];           
        }
        @Override
        public String toString(){
            return id + " " + name + " " + h + " gio " + m + " phut";
        }
        @Override
        public int compareTo(Player other){
            if(this.h == other.h)
                return other.m - this.m;
            return other.h - this.h;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Player> a = new ArrayList<>();
        String ent = sc.nextLine();
        for(int i=0;i<n;i++){
            Player p = new Player(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            p.count();
            a.add(p);
        }
        Collections.sort(a);
        for(Player p : a){
            System.out.println(p);
        }
    }
}
