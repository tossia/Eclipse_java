//If the point is into the sector
import java.util.*;

public class Program15_21 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		Double pointX = in.nextDouble();
		Double pointY = in.nextDouble();
		
		if (pointX<2 && pointX>pointY && pointX*pointX + pointY*pointY>4 && pointY>0) {
			System.out.println("YES");
		} else {
		System.out.println("NO");
		}in.close();
	}
}