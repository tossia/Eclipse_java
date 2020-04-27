//If the point is a part of the ligne
import java.util.*;

public class Program15_1 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		float point = in.nextFloat();
		
		if (3 <= point && point <= 8) {
			System.out.println("true");
		} else {
			System.out.println("false");
		} in.close();
	}
}