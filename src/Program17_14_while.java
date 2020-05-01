//Find quotient and remainder of division
import java.util.*;

public class Program17_14_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int numberA = in.nextInt();
		int numberB = in.nextInt();
		int rest = numberA - numberB;;
		int i = 0;
		while (rest >= 0) {
			rest = rest - numberB;
			i++;
		}
		System.out.println(i + " " + (rest + numberB));		
		in.close(); 
	}
}