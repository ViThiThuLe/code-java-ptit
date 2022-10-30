package oop;

import java.util.*;

public class sap_xep_thoi_gian{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Time> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Time x = new Time(in.nextInt(), in.nextInt(), in.nextInt());
            a.add(x);
        }
        Collections.sort(a);
        for (Time x : a) {
            System.out.println(x);
        }
    }

    public static class Time implements Comparable<Time> {

        private int gio, phut, giay;

        public Time(int gio, int phut, int giay) {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }

        public String toString() {
            return gio + " " + phut + " " + giay;
        }

        public int compareTo(Time o) {
            if (this.gio > o.gio) {
                return 1;
            } else if (this.gio < o.gio) {
                return -1;
            } else {
                if (this.phut > o.phut) {
                    return 1;
                } else if (this.phut < o.phut) {
                    return -1;
                } else {
                    if (this.giay > o.giay) {
                        return 1;
                    } else if (this.giay < o.giay) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }
}
