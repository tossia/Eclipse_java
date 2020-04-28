//If the point is into the sector
import java.util.*;

public class Program15_24 {

	public static void main(String[] args) {
		
		System.out.print("");
		Scanner in = new Scanner(System.in);
		Double pointX = in.nextDouble();
		Double pointY = in.nextDouble();
		
		if (pointY>pointX*pointX-2 && pointY<-pointX && pointX<0 || pointY>pointX*pointX-2 && pointY<pointX && pointX>=0){
			System.out.println("YES");
		} else {
		System.out.println("NO");

		} in.close();
	}
}