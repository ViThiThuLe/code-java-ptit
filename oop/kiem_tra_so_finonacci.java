package oop;

import java.util.Scanner;

public class kiem_tra_so_finonacci {

    static long ktra(long n) {
        long a = 0, b = 1, c = 0;
	while( c < n){
		c = a + b;
		a = b;
		b = c;
	}		
	if(c != n) return 0;
	return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();
            if (ktra(n) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
