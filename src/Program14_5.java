//Inverse on zero all byts before i byte
import java.util.Scanner;

public class Program14_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("");
		int number = in.nextInt();
		int biteNum = in.nextInt();

		number &= (1 << biteNum) - 1;
			
	System.out.println(String.valueOf(number));

	}
}