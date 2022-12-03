/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
public class chuan_hoa_va_sap_xep {
    public static String chuanHoa(String line){
        String ten = "";
        StringTokenizer s = new StringTokenizer(line);
        while(s.hasMoreTokens()){
            String temp = s.nextToken().toLowerCase();
            ten+= String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1) + " ";
        }
        return ten.substring(0,ten.length()-1);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<String> a = new ArrayList<>();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            a.add(chuanHoa(line));
        }
        a.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                String ten1 = o1.substring(o1.lastIndexOf(" ")+1) + o1.substring(0,o1.lastIndexOf(" "));
                String ten2 = o2.substring(o2.lastIndexOf(" ")+1) + o2.substring(0,o2.lastIndexOf(" "));
                
                return ten1.compareTo(ten2);
            }
            
        });
        for(String s:a){
            System.out.println(s);
        }
    }
}
