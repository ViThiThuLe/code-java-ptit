/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class lop_inset {
    static class IntSet{
        public int[] a;

        public IntSet(int[] a) {
            this.a = a;
        }
        public IntSet union(IntSet s){
            Set<Integer> set = new TreeSet<>();
            for(int i=0;i<s.a.length;i++){
                set.add(s.a[i]);
            }
            for(int i=0;i<a.length;i++){
                set.add(this.a[i]);
            }
            int[] b = new int[set.size()];
            int k = 0;
            for(Integer i:set){
                b[k] = i;
                k++;
            }
            return new IntSet(b);
        }
        @Override
        public String toString(){
            String res = "";
            for(int i=0;i<a.length;i++)
                res += String.valueOf(a[i]) + " ";
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
