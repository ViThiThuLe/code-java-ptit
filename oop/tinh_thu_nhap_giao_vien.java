package oop;

import java.util.Scanner;

public class tinh_thu_nhap_giao_vien {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Thunhap x= new Thunhap(sc.nextLine(),sc.nextLine(),sc.nextLong());
        System.out.println(x.toString());
    }
}

 class Thunhap {
    private String mgv,name;
    private long luongcoban;
    private int heso;
    private long phucap,thunhap;
    public long pc() {
        if(mgv.substring(0, 2).equals("HT")) {
            return 2000000;
        }
        if(mgv.substring(0, 2).equals("HP")) {
            return 900000;
        }
        if(mgv.substring(0, 2).equals("GV")) {
            return 500000;
        }
        return 0;
    }
    public Thunhap(String mgv,String name,long luongcoban) {
        this.mgv=mgv;
        this.name=name;
        String hs=mgv.substring(2);
        this.heso=Integer.parseInt(hs);
        this.phucap=pc();
        this.thunhap=luongcoban*heso+phucap;
    }
    @Override
    public String toString() {
        return mgv+" "+name+" "+String.valueOf(heso)+" "+String.valueOf(phucap)+" "+String.valueOf(thunhap);
    }
}