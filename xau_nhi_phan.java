package test;

import java.util.*;

public class xau_nhi_phan {
    static long[] g = new long[93];
    public static int solve(int n, long k){
        if(n==1) return 0;
        if(n==2) return 1;
        if(k<=g[n-2])
            return solve(n-2,k);
        else
            return solve(n-1,k-g[n-2]);
    }
    public static void main(String[] args){
        g[1] = 1;
        g[2] = 1;
        for(int i=3;i<93;i++){
            g[i] = g[i-1] + g[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(solve(n,k));
            t--;
        }
    }
}
