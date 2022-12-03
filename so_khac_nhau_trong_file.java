/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class so_khac_nhau_trong_file {
    static int[] a = new int[1001];
    public static void readFile(String fileName){
        try{
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNextInt()){
                int n = sc.nextInt();
                a[n]+=1;
            }
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        readFile("DATA.in");
        for(int i=0;i<a.length;i++)
            if(a[i]>0){
                System.out.println(i + " " + a[i]);
            }
    }
}
