//Get the min chifre in the Number
import java.util.*;

public class Program17_18_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();
		
		int i = 1;
		int numberTemp = (int) (number % Math.pow(10, i));
		int count = 0;
		int min = 0;
		if (numberTemp % 2 != 0) {
			min = numberTemp;
			count++;
		}
		while (i <= String.valueOf(Math.abs(number)).length()) {
				numberTemp = (int) ((number % Math.pow(10, i + 1))/ Math.pow(10, i));
				if (numberTemp % 2 != 0) {
					min = numberTemp;
					count++;
				}
				i++;
		} 
		if (count == 0 ) {
			System.out.println("NO");
		} else {
			System.out.println(min);
		}
		in.close();
	}
}