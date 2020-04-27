//If there are at least 2 even numbers
import java.util.*;

public class Program15_6 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int number3 = in.nextInt();
		
		if ((number1 % 2 == 0) && (number2 % 2 == 0 || number3 % 2 == 0)) {
			System.out.println("true");
		} else if (number2 % 2 == 0 && (number1 % 2 == 0 || number3 % 2 == 0)) {
			System.out.println("true");
		} else {
		System.out.println("false");
	}in.close();
	}
}