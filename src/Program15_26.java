//If the point is into the sector
import java.util.*;

public class Program15_26 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		Double x = in.nextDouble();
		Double y = in.nextDouble();
		
		if ((0 <= x && x<1 && 0<=y && y<1) || x*x+y*y<1){
			System.out.println("YES");
		} else {
		System.out.println("NO");

		} in.close();
	}
}