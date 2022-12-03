/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
class CaThi implements Comparable<CaThi>{
    private int mad;
    private String id,ma="C",ngay,gio;
    private int[] day = new int[3],time = new int[2];

    public CaThi(int i, String ngay, String gio,String id) {
        this.mad = i;
        if(i<10)
            this.ma += "0";
        if(i<100)
            this.ma += "0";
        this.ma += String.valueOf(i);
        this.id = id;
        this.ngay = ngay;
        this.gio = gio;
        String[] temp = this.ngay.split("/");
        for(int j = 0;j<temp.length;j++){
            this.day[j] = Integer.parseInt(temp[j]);
        } 
        temp = this.gio.split(":");
        for(int j = 0;j<temp.length;j++){
            this.time[j] = Integer.parseInt(temp[j]);
        }
    }
    @Override
    public int compareTo(CaThi other){
        if(this.ngay==other.ngay && this.gio == other.gio)
            return this.mad - other.mad;
        if(this.day[2] == other.day[2]){
            if(this.day[1] == other.day[1]){
                if(this.day[0] == other.day[0]){
                    if(this.time[0] == other.time[0]){
                        return this.time[1] - other.time[1];
                    }
                    return this.time[0] - other.time[0];
                }
                return this.day[0] - other.day[0];
            }
            return this.day[1] - other.day[1];
        }
        return this.day[2] - other.day[2];
    }
    @Override
    public String toString(){
        return ma + " " + ngay + " " + gio + " " + id;
    }
}
public class danh_sach_ca_thi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int n = sc.nextInt();
        List<CaThi> a = new ArrayList<>();
        String ent = sc.nextLine();
        for(int i=0;i<n;i++){
            CaThi temp = new CaThi(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(temp);
        }
        Collections.sort(a);
        for(CaThi ct : a){
            System.out.println(ct);
        }
    }
}
