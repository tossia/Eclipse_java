//Get the min chifre in the Number
import java.util.*;

public class Program17_10_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();
		
		int i = 0;
		int min = 9;

		while (i <= String.valueOf(Math.abs(number)).length()) {
				int numberTemp = (int) ((number % Math.pow(10, i + 1))/ Math.pow(10, i));
				if (numberTemp != 0 && numberTemp < min) {
					min = numberTemp;
				}
				i++;
		} 
		System.out.println(min);
		in.close();
	}
}