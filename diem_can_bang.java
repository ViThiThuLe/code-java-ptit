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
public class diem_can_bang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] sl = new int[n];
            int s = 0;
            boolean ok = false;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                s+=a[i];
                sl[i] = s-a[i];
            }
            for(int i=0;i<n;i++)
                if(sl[i]==s-sl[i]-a[i]){
                    System.out.println(i+1);
                    ok = true;
                    break;
                }
            if(!ok) System.out.println(-1);
            t--;
        }
    }
}
