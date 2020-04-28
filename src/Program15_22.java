//If the point is into the sector
import java.util.*;

public class Program15_22 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		Double pointX = in.nextDouble();
		Double pointY = in.nextDouble();
		
		if (pointX > 0 && pointY < 0.5 && pointY > 0 && pointX < Math.PI && pointY < Math.sin(pointX)) {
			System.out.println("YES");
		} else {
		System.out.println("NO");

		} in.close();
	}
}