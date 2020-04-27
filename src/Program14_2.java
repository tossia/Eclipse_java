//Squaring
import java.util.Scanner;

public class Program14_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("");
		int stepen = in.nextInt();
		int number = 2;
		long result;
		if (stepen == 0) {
			result = 1L;
		} else {
		number <<= (stepen - 1);
			if (stepen > 30) {
				result = 2147483648L;
			}else {
				result = number;
			}
		}
		System.out.println(String.valueOf(result));
	}
}
