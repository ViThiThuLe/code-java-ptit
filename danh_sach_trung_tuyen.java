/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author HP
 */
class ThiSinh implements Comparable<ThiSinh>{
    private String id,ten, kq ="";
    private float toan,ly,hoa,dxt;

    public ThiSinh(String id, String ten, float toan, float ly, float hoa) {
        this.id = id;
        this.ten = chuanHoaTen(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.dxt = this.tinhDiemXetTuyen();
    }

    public float getDxt() {
        return dxt;
    }
    
    public float diemUuTien(){
        String kv = id.substring(0, 3);
        if(kv.equals("KV1")){
            return (float)0.5;
        }
        if(kv.equals("KV2")){
            return (float)1.0;
        }
        return (float)2.5;
              
    }
    public float tinhDiemXetTuyen(){
        float sum = toan*2 + ly + hoa + diemUuTien();
        return sum;
    }

    public void setKq(String kq) {
        this.kq = kq;
    }
    public String chuanHoaTen(String ten){
        String res = "";
        StringTokenizer s = new StringTokenizer(ten);
        while(s.hasMoreTokens()){
            String temp = s.nextToken().toLowerCase();
            res +=  (String.valueOf(temp.charAt(0)).toUpperCase()+temp.substring(1))+" ";
        }
        return res;
    }

    @Override
    public int compareTo(ThiSinh o) {
        if(this.dxt == o.dxt)
            return this.id.compareTo(o.id);
        return Float.compare(o.dxt,this.dxt);
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");
        return id + " " + ten + " " + format.format(diemUuTien()) + " " + format.format(dxt) + " " + kq;
    }
    
    
}
public class danh_sach_trung_tuyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        List<ThiSinh> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ent = sc.nextLine();
            a.add(new ThiSinh(sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat()));
        }
        int chitieu = sc.nextInt();
        Collections.sort(a);
        int k = chitieu;
        float diemChuan=0;
        for(ThiSinh ts:a){
            if(k>0){
                ts.setKq("TRUNG TUYEN");
                k--;
                diemChuan = ts.getDxt();
            }
            else{
                if(ts.getDxt()==diemChuan)
                    ts.setKq("TRUNG TUYEN");
                else
                    ts.setKq("TRUOT");
            }
        }
        System.out.println(String.format("%.1f", diemChuan));
        for(ThiSinh ts:a){
            System.out.println(ts);
        }
    }
}
