//number of chiffres
import java.util.*;

public class Program17_13_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("");
		int i;
		int numberLength;
		do {
			int number = in.nextInt();
			numberLength = String.valueOf(Math.abs(number)).length();
			if (numberLength == 2) {
				sum = sum + number % 10 + (number % 100) / 10;
				}
			i = number;
		}
		while (numberLength == 2);
		System.out.println(sum);		
		in.close(); 
	}
}