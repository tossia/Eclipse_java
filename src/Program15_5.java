//If there are twa oposide numbers
import java.util.*;

public class Program15_5 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int number3 = in.nextInt();
		int number4 = in.nextInt();

		if (number1 == -number2) {
			System.out.println("true");
		}else if (number1 == -number3){
			System.out.println("true");
		}else if (number1 == -number4) {
			System.out.println("true");
		}else if (number2 == -number3) {
			System.out.println("true");
		}else if (number2 == -number4) {
			System.out.println("true");
		}else if (number3 == -number4) {
			System.out.println("true");
		} else {
		System.out.println("false");
	}in.close();
}
}