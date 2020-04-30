//construction if
import java.io.PrintStream;
import java.util.*;

public class Program16_11 {
	public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();
		
		if (number >= 0 && number < 10) {
			System.out.println("DIGIT");
		} else if (number > 9 && number < 100) {
		System.out.println("NUM");
		} else {
			System.out.println("OTHER");
		} in.close();
	}
}