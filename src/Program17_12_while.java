//number of numbers
import java.util.*;

public class Program17_12_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("");
		int i;	
		do {
			int number = in.nextInt();
			if (number > 10) {
				sum = sum + number;
				}
			i = number;
		}
		while (i % 5 != 0);
		System.out.println(sum);		
		in.close(); 
	}
}