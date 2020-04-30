//Rome numbers
import java.util.*;

public class Program16_23 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {

		System.out.print("");
		int month = in.nextInt();
		int day = in.nextInt();
		
		switch (month) {
		case (2):
			System.out.println(28);
			break;
		case (4):
		case (6):
		case (9):
		case (11):
			System.out.println(30);
			break;
		case (1):
		case (3):
		case (5):
		case (7):
		case (8):
		case (10):
		case (12):
			System.out.println(31);
			break;
		default:
			System.out.println(0);
		}		
		
		in.close(); 
	}
}