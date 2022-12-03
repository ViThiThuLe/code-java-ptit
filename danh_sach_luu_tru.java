/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class danh_sach_luu_tru {
    static class Khach implements Comparable<Khach>{
        private String id = "KH",name,room,dcome,dleave;
        private long days;

        public Khach(int id,String name, String room, String dcome, String dleave) {
            if(id<10)
                this.id += "0";
            this.id += String.valueOf(id);
            this.name = name;
            this.room = room;
            this.dcome = dcome;
            this.dleave = dleave;
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
            Date d1 = null;
            Date d2 = null;
            try{
                d1 = format.parse(this.dcome);
                d2 = format.parse(this.dleave);
                long diff = d2.getTime() - d1.getTime();
                days = diff / (24 * 60 * 60 * 1000);
            }
            catch(Exception e){
                
            }
        }
        @Override
        public int compareTo(Khach other){
            return (int)(other.days - this.days);
        }
        public String toString(){
            return id + " " + name + " " + room + " " + days;
        }
        
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        String ent = sc.nextLine();
        List<Khach> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            Khach temp = new Khach(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(temp);
        }
        Collections.sort(a);
        for(Khach k:a){
            System.out.println(k);
        }
    }
}
