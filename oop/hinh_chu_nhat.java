import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 2 * ( a + b);
		int d = a * b;
		if( a <= 0 || b <= 0)
			System.out.println("0");
		else
			System.out.println(c + " " + d);
	}
}