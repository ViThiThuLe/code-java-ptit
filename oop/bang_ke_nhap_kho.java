
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.Scanner;


class sp {
    String name, type;
    int x, y, s, msp;
};
 
public class bang_ke_nhap_kho {
    private final static Scanner sc = new Scanner(System.in);
    
 
    public static String MSP(int x) {
        String s = String.valueOf(x);
        while (s.length() < 3)
            s = "0" + s;
        return "MH" + s;
    }
 
    public static void sol() {
        int n = sc.nextInt();
        Vector<sp> c = new Vector<sp>();
        for (int i = 1; i <= n; i++) {
            sp a = new sp();
            sc.nextLine();
            a.msp = i;
            a.name = sc.nextLine();
            a.type = sc.nextLine();
            a.x = sc.nextInt();
            a.y = sc.nextInt();
            a.s = a.y - a.x;
            c.add(a);
        }
        Collections.sort(c, new Comparator<sp>() {
            @Override
            public int compare(sp a, sp b) {
                if (a.s < b.s)
                    return 1;
                else if(a.s == b.s && a.msp > b.msp)
                    return 1;
                return -1;
            }
        });
        sp a = new sp();
        for (int i = 0; i < n; i++) {
            a = c.elementAt(i);
            System.out.printf("%s %s %s %d %d %d\n", MSP(a.msp), a.name, a.type, a.x, a.y, a.s);
        }
 
    }
 
    public static void main(String[] args) {
        int t = 1;
        // t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            sol();
        }
    }
}