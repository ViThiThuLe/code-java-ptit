/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
class DaySo implements Comparable<DaySo>{
    private int[] arr;

    public DaySo(int[] arr) {
        this.arr = arr;
    }
    @Override
    public int compareTo(DaySo other){
        int n = this.arr.length < other.arr.length ? this.arr.length : other.arr.length;
        for(int i=0;i<n;i++){
            if(this.arr[i]!=other.arr[i])
                return this.arr[i]-other.arr[i];
        }
        return this.arr.length - other.arr.length;
    }
    @Override
    public String toString(){
        String res = "";
        for(int i=0;i<arr.length;i++)
            res += String.valueOf(arr[i]) + " ";
        return res;
    }
}
public class day_con_co_tong_le {
    static Integer[] a;
    static List<Integer> b = new ArrayList<>();
    static int n,sum;
    static List<DaySo> s = new ArrayList<>();
    static public void save(){
        int[] c = new int[b.size()];
        for(int i=0;i<b.size();i++)
            c[i] = b.get(i);
        DaySo temp = new DaySo(c);
        s.add(temp);
    }
    static public void sinh(int i){
        for(int j = i;j<n;j++){
                b.add(a[j]);
                sum+= a[j];
                if(sum%2!=0)
                    save();
                if(i<n-1){
                    sinh(j+1);
                }
                b.remove(b.size()-1);
                sum-=a[j];            
        }
    }
    public static void sortDESC(Integer [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            n = sc.nextInt();
            a = new Integer[n];  
            sum = 0;
            s.clear();
            b.clear();
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            sortDESC(a);
            sinh(0);
            Collections.sort(s);
            for(int i=0;i<s.size();i++){
                System.out.println(s.get(i));
            }
        }
    }
}
