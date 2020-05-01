//number of numbers
import java.util.*;

public class Program17_11_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		int sum = 1;
		System.out.print("");
		int number = in.nextInt();
		
		while (number >= 0) {
			number = in.nextInt();
			sum++;
		}
		System.out.println(sum);		
		in.close(); 
	}
}