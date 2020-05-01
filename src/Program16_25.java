//order three numbers
import java.util.*;

public class Program16_25 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int number3 = in.nextInt();
		int numberTemp;

		if (number1 >= number2) {
		    numberTemp = number1;
			number1 = number2;
			number2 = numberTemp;
		}
		if (number2 >= number3) {
			numberTemp = number2;
			number2 = number3;
			number3 = numberTemp;
		}
			
		if (number1 >= number2) {
			numberTemp = number1;
			number1 = number2;
			number2 = numberTemp;
		}
		System.out.println(number1 +" "+number2 +" "+ number3);		
		in.close(); 
	}
}