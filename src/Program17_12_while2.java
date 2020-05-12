//N even numbers
import java.util.*;

public class Program17_12_while2 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();
		int i = 0;
		int evenNum = 0;
		while (i < number) {
			System.out.print((evenNum = evenNum + 2) +" ");
			i++;
		}
		in.close(); 
	}
}