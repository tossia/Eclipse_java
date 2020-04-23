//sum of three-digit numbers
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("");
		int a = in.nextInt();
		int b = a /100;
		int c = (a - (b * 100)) / 10;
		int d = a - (b * 100) - (c * 10);

		System.out.println(b + c + d);
		in.close();
	}
}