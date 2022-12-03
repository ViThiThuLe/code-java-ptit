/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class loai_bo_so_nguyen {
    public static void main(String[] args) {
        File f = new File("DATA.in");
        List<String> a = new ArrayList<>();
        try{          
            Scanner sc = new Scanner(f);
            while(sc.hasNext()){
                String temp = sc.next();
                try{
                    int x = Integer.parseInt(temp);
                    
                }
                catch(NumberFormatException e){
                    a.add(temp);
                }
            }
        }
        catch(FileNotFoundException e){
        }
        Collections.sort(a);
        for(String i:a){
            System.out.print(i + " ");
        }
    }
}
