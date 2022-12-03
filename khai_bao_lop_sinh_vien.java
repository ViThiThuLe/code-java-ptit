/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class khai_bao_lop_sinh_vien {
    static class SinhVien{
        private String id, name, lop, dob;
        private float gpa;

        public SinhVien() {
            this.id = "B20DCCN001";
            this.name = "";
            this.lop = "";
            this.dob = "";
            this.gpa = 0;
        }
        public void input(){
            Scanner sc = new Scanner(System.in);
            name = sc.nextLine();
            lop = sc.nextLine();
            dob = sc.nextLine();
            gpa = sc.nextFloat();
        }
        public void chuanHoaDob(){
            String s = this.dob;
            if(s.charAt(1) == '/'){
                s = "0" + s;
            }
            if(s.charAt(4)=='/'){
                s = s.substring(0, 3) + "0" + s.substring(3);
            }
            this.dob = s;
        }
        @Override
        public String toString(){
            return id + " " + name + " " + lop + " " + dob + " " + String.format(Locale.UK, "%.2f", gpa);
        }
    }
    public static void main(String[] args) {
        SinhVien st = new SinhVien();
        st.input();
        st.chuanHoaDob();
        System.out.println(st.toString());
    }
}
