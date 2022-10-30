package oop;

import java.util.Scanner;

public class dia_chi_email {
    public static String ktra(String s){
        String [] a = s.split("\\s+");
        s = "";
        s += a[a.length - 1].toLowerCase();
        for(int i = 0; i < a.length - 1; i++){
            s += Character.toLowerCase(a[i].charAt(0));
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        while( t > 0){
            String s = sc.nextLine();
            s = s.trim();
            System.out.println(ktra(s) + "@ptit.edu.vn");
            t--;
        }
    }
}
