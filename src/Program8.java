//Buy pirozhki = rub & kop
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("");
		int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
		int kopeek = a * 100 + b;
		int totalSumKop = kopeek * n;
		int rub = totalSumKop /100;
		int kop = totalSumKop - rub * 100;

		System.out.println(rub + " " + kop);
		in.close();
	}

}