
package oop;

import java.util.Scanner;

public class sap_xep_thoi_gian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            thoigian tg = new thoigian(gio, phut, giay);
        }
    }
}

class thoigian{
    private int gio, phut, giay;
    
    public thoigian(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    public boolean ktra(){
        
    }
    
}
