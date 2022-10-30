package oop;

import java.util.Scanner;

public class so_nto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            t--;
            
            int check = 1;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    check = 0;
                    break;
                }
                else check = 1;
            }
            if(check == 1) 
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}
