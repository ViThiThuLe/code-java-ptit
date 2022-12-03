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
public class lop_pair {
    static class Pair<T0, T1> {
        private int a,b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
        public boolean isPrime(){
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0)
                    return false;
            }
            for(int i=2;i<=Math.sqrt(b);i++){
                if(b%i==0)
                    return false;
            }
            return true;
        }
        @Override
        public String toString(){
            return a + " " + b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
