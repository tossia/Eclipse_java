//Rome numbers
import java.util.*;

public class Program16_23 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();
		
		int number1 = number % 10;
		int numberTen = number % 100 / 10;

		String ten = "";
		String unite = "";
		
		if (number==100) {
		  System.out.println("C");
		} else {
			switch(numberTen) {
			case (1) : ten = "X";
			break;
			case (2) : ten = "XX";
			break;
			case (3) : ten = "XXX";
			break;
			case (4) : ten = "XL";
			break;
			case (5) : ten = "L";
			break;
			case (6) : ten = "LX";
			break;
			case (7) : ten = "LXX";
			break;
			case (8) : ten = "LXXX";
			break;
			case (9) : ten = "XC";
			break;
			}
			switch(number1) {
			case (1) : unite = "I";
			break;
			case (2) : unite = "II";
			break;
			case (3) : unite = "III";
			break;
			case (4) : unite = "IV";
			break;
			case (5) : unite = "V";
			break;
			case (6) : unite = "VI";
			break;
			case (7) : unite = "VII";
			break;
			case (8) : unite = "VIII";
			break;
			case (9) : unite = "IX";
			break;
			}	
		}

		System.out.println(ten + unite);
		
		in.close(); 
	}
}