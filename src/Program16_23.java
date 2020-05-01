//Rome numbers
import java.util.*;

public class Program16_23 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();
		int number1 = number % 10;
		int number10 = number % 100;
		int numberTen = number10 / 10;
		int sto = number % 1000;
		String ten = "X";
		String numberRome;
		
		System.out.println("number1 = "+number1);
		System.out.println("number10 = "+number10);
		System.out.println("numberTen = "+numberTen);
		System.out.println("sto = " +sto);

		if (number==100) {
		  System.out.println("C");
		} else {
			if (numberTen == 0) {
				numberRome = ten * numberTen;
			}
		}
		

		in.close(); 
	}
}