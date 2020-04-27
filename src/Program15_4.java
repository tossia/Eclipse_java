//If the number is positiv, 3points and %3 = 0
import java.util.*;

public class Program15_4 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();

		if ((number > 0) && (((int)Math.log10(number) + 1) == 3) && (number % 3 == 0)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
			in.close();
	}
}