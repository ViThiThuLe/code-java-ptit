/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.*;
/**
 *
 * @author HP
 */
public class tong_uoc_so_1 {
    public static long tongUoc(int n){
        long sum = 0;
        while(n%2==0){
            sum += 2;
            n /= 2;
        }
        for(int i=3;i*i<=n;i+=2){
            while(n%i==0){
                sum += i;
                n /= i;
            }
        }
        if(n>1) return sum + n;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n!=1){
                sum += tongUoc(n);
            }
        }
        System.out.println(sum);
    }

}
