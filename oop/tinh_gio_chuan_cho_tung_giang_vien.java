package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class MonHoc{
    private String maMH, tenMH;

    public MonHoc() {
    }

    public MonHoc(String maMH, String tenMH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
    }
    
}
class GiangVien{
    private String maGV, tenGV;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV) {
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getTenGV() {
        return tenGV;
    }
    
    
}
class GiangDay{
    private String maGV, maMH;
    double  gioChuan;

    public GiangDay() {
    }

    public GiangDay(String maGV, String maMH, double gioChuan) {
        this.maGV = maGV;
        this.maMH = maMH;
        this.gioChuan = gioChuan;
    }

    public String getMaGV() {
        return maGV;
    }

    public String getMaMH() {
        return maMH;
    }

    public double getGioChuan() {
        return gioChuan;
    }
    
    
}
public class tinh_gio_chuan_cho_tung_giang_vien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<MonHoc> listMH = new ArrayList<>();
        List<GiangDay> listGD = new ArrayList<>();
        List<GiangVien> listGV = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            String[] arr = sc.nextLine().split("\\s+");
            String maMH = arr[0]; String tenMH = arr[1];
            MonHoc mh = new MonHoc(maMH, tenMH);
            listMH.add(mh);
        }
        
        int m = Integer.parseInt(sc.nextLine());
        for(int i=0; i<m; i++){
            String[] arr = sc.nextLine().split("\\s+");
            StringBuilder sb = new StringBuilder("");
            for(int j=1; j< arr.length; j++){
                sb.append(arr[j]).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            String maGV = arr[0]; String tenGV = sb.toString();
            GiangVien gv = new GiangVien(maGV, tenGV);
            listGV.add(gv);
        }
        
        int q = Integer.parseInt(sc.nextLine());
        for(int i=0; i<q; i++){
            String[] arr = sc.nextLine().split("\\s+");
            String maGV = arr[0];
            String maMH = arr[1];
            double gioChuan = Double.parseDouble(arr[2]);
            GiangDay gd = new GiangDay(maGV, maMH, gioChuan);
            listGD.add(gd);
        }
        
        for(GiangVien x : listGV){
            Double sum = listGD.stream().filter(item -> item.getMaGV().equals(x.getMaGV()))
                    .map(e -> e.getGioChuan())
                    .collect(Collectors.summingDouble(Double::doubleValue));
            
            String tongGioChuan = String.format("%.2f", sum);
            System.out.println(x.getTenGV() +" "+ tongGioChuan);
             
        }
    }
}
