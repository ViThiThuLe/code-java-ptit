package test;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class bang_ke_nhap_kho {
    static class MatHang{
        private String ten,ma;
        private int soluong;
        private long dongia,tien,ck;

        public MatHang(int id,String ten, int soluong, long dongia) {
            this.ten = ten;
            this.soluong = soluong;
            this.dongia = dongia;
            this.setCk();
            this.tien = this.soluong * this.dongia - this.ck;
        }

        public String getTen() {
            String[] s = ten.split(" ");
            String maten = String.valueOf(s[0].charAt(0)) + String.valueOf(s[1].charAt(0));
            return maten.toUpperCase();
        }

        public void setMa(int id) {
            String temp = getTen();
            if(id<10)
                temp+="0";
            temp+= String.valueOf(id);
            this.ma = temp;
        }

        public long getCk() {
            return ck;
        }
        
        public void setCk() {
            this.ck = dongia*soluong;
            if(soluong > 10)
                this.ck *= 0.05;
            else if(soluong>=8)
                this.ck *= 0.02;
            else if(soluong>=5)
                this.ck *= 0.01;
            else
                this.ck *= 0;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + ck + " " + tien;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<MatHang> a = new ArrayList<>();
        Map<String,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            String ent = sc.nextLine();
            MatHang temp = new MatHang(i+1,sc.nextLine(),sc.nextInt(),sc.nextLong());
            if(m.containsKey(temp.getTen()))
                m.replace(temp.getTen(), m.get(temp.getTen())+1);
            else
                m.put(temp.getTen(), 1);           
            temp.setMa(m.get(temp.getTen()));
            a.add(temp);
        }
        a.sort(new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return (int) (o2.getCk() - o1.getCk());
            }
        });
        for(MatHang i:a){
            System.out.println(i);
        }
    }
}
