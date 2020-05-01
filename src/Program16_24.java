//The bigest from three numbers
import java.util.*;

public class Program16_24 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int number3 = in.nextInt();

		if (number1 >= number2 && number1 >= number3) {
		  System.out.println(number1);
		} else if (number2 >= number1 && number2 >= number3){
			System.out.println(number2);
		} else {
			System.out.println(number3);
		}
		in.close(); 
	}
}