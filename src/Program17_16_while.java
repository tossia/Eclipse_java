//Sum all even numbers from 25 up to Number
import java.util.*;

public class Program17_16_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();
		int first = 25;
		int sumEven = 0;
		while (first < number) {
			if (first % 2 == 0) {
				sumEven= sumEven + first;
			}
			first++;
		}
		System.out.println(sumEven);		
		in.close(); 
	}
}