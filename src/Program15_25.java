//If the point is into the sector
import java.util.*;

public class Program15_25 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		Double x = in.nextDouble();
		Double y = in.nextDouble();
		
		if (x*x+y*y<1 && x<=0|| x*x+y*y<1 && y>x && x>=0) {
			System.out.println("YES");
		} else {
		System.out.println("NO");

		} in.close();
	}
}