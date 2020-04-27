//Transfom the last bits on zero
import java.util.Scanner;

public class Program14_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("");
		int number = in.nextInt(); 
		int numBit = in.nextInt();
		if (number < 0) {
			number = number+1;
		}
		number >>>= numBit;
			System.out.println(number << numBit);
		
	}
}
