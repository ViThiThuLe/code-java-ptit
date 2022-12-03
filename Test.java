package test;
import java.util.*;

public class Test {
    static long p = 1000000007;
    static long power(long a,long b){
        if(b==0) return 1;
        if(b == 1) return a;
        if(b%2==0)
            return power(a*a%p,b/2)%p;
        else
            return power(a*a%p,b/2)*a%p;
    }
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a==0 && b==0)
                break;
            System.out.println(power(a,b));
        }
    }
    
}
