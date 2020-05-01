//the number of decimal digits in the number.
import java.util.*;

public class Program17_17_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();
		int numberDecimal = (number == 0) ? 1 : 0;
		System.out.println(numberDecimal);
		while (number != 0 ) {
				numberDecimal++;
				number /= 10;
		}
		System.out.println(numberDecimal);		
		in.close(); 
	}
}