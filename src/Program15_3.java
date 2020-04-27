//If the point is a part of one of two lignes
import java.util.*;

public class Program15_3 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		float point = in.nextFloat();
		
		
		if (point < -2 || point > 3 && point < 6 || point > 15) {
			System.out.println("true");
		} else {
			System.out.println("false");
		} in.close();
	}
}