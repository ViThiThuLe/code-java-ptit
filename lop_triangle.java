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
public class lop_triangle {
    static class Point{
        private double x,y;

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        
        static Point nextPoint(Scanner sc){
            return new Point(sc.nextDouble(),sc.nextDouble());
        }
        public double distance(Point p){
            return Math.sqrt((x-p.getX())*(x-p.getX())+(y-p.getY())*(y-p.getY()));
        }
    }
    static class Triangle{
        private Point p1,p2,p3;
        private double a,b,c;

        public Triangle(Point p1, Point p2, Point p3) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
        public boolean valid(){
            a = p1.distance(p2);
            b = p1.distance(p3);
            c = p3.distance(p2);
            return a+b>c && a+c>b && b+c>a;
        }
        public String getPerimeter(){
            return String.format("%.3f", a+b+c);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
