/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class dien_tich_hinh_tron_ngoai_tiep {
    static class Point{
        private double x,y;

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
        public void input(Scanner sc){
            x = sc.nextDouble();
            y = sc.nextDouble();
        }
        public double distance(Point p){
            return Math.sqrt((x-p.getX())*(x-p.getX())+(y-p.getY())*(y-p.getY()));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point p1 = new Point(),p2 = new Point(),p3 = new Point();
            p1.input(sc);
            p2.input(sc);
            p3.input(sc);
            double a = p1.distance(p2);
            double b = p1.distance(p3);
            double c = p3.distance(p2);
            if(a+b>c && a+c>b && b+c>a){
                double s = 0.25 * Math.sqrt((a + b + c) * (a + b - c) * (a - b + c) * (-a + b + c));
                double r = a*b*c/(4*s);
                System.out.printf("%.3f\n",r*r*Math.PI);
            }
            else System.out.println("INVALID");
        }
    }    
}
