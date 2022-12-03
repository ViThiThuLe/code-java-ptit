package test;
import java.util.*;

public class tinh_gia_ban {
    static class SanPham{
        private String ten, dv, id;
        private float sl, gianhap;
        private long vanchuyen, thanhtien, giaban;
        private long vanChuyen1, thanhTien1, giaBan1;
        private long vanChuyen2, thanhTien2, giaBan2;
        public SanPham(int id,String ten, String dv,  float gianhap, float sl) {
            this.id = "MH";
            if(id<10)
                this.id+="0";
            this.id += String.valueOf(id);
            this.ten = ten;
            this.dv = dv;
            this.gianhap = gianhap;
            this.sl = sl;
            vanChuyen1=(long)(Math.floor(this.sl*this.gianhap*50.0/100.0));
            vanChuyen2=vanChuyen1%10;
            if (vanChuyen2>=5)
                this.vanchuyen = (long)(Math.floor(vanChuyen1/10.0))+1;
            else
                this.vanchuyen = (long)(Math.floor(vanChuyen1/10.0));
            thanhTien1=(long)(Math.floor(this.sl*this.gianhap*10.0));
            thanhTien2=thanhTien1%10;
            if (thanhTien2>=5)
                this.thanhtien = (long)(Math.floor(thanhTien1/10.0))+ this.vanchuyen+1;
            else
                this.thanhtien = (long)(Math.floor(thanhTien1/10.0))+ this.vanchuyen;
            giaBan1=(long)(Math.floor(this.thanhtien*20.0/100.0));
            giaBan2=giaBan1%10;
            if (giaBan2>=5)
                this.giaban = this.thanhtien +(long)(Math.floor(giaBan1/10.0))+1;
            else
                this.giaban = this.thanhtien + (long)(Math.floor(giaBan1/10.0));
        }
        @Override
        public String toString(){
            return id + " " + ten + " " + dv + " " + vanchuyen + " " + thanhtien + " " + giaban;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<SanPham> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            String ent = sc.nextLine();
            SanPham temp = new SanPham(i+1,sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat());
            a.add(temp);
        }
        for(SanPham sp : a){
            System.out.println(sp);
        }
    }
}
