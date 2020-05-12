//multiple without multiple
import java.util.*;

public class Program17_11_while2 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int numberOne = in.nextInt();
		int numberTwo = in.nextInt();
		int i = 0;
		int result = 0;
		while (i < Math.abs(numberOne)) {
			result = result + Math.abs(numberTwo);
			 i++;
		}
		System.out.println(numberOne * numberTwo <0 ? "-"+result : result );
		in.close();
	}
}