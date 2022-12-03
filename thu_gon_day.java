/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.*;
import java.io.*; 
/**
 *
 * @author HP
 */
public class thu_gon_day {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> v = new Vector<Integer>(n);
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            v.add(x);
        }
        int i = 1;
        while(i<v.size()){
            if((v.get(i)+v.get(i-1))%2==0){
                v.remove(i-1);
                v.remove(i-1);
                if(i>1) i=i-1;
            }
            else i++;
        }
        System.out.println(v.size());
    }
}
