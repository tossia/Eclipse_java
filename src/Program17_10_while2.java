//Where the bus will have a crash
import java.util.*;

public class Program17_10_while2 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int numberBridge = in.nextInt();
		int heightBus = 437;
		int i = 1;
		int result = 0;
		do {System.out.print("");
			int heightBridge = in.nextInt();
			if (heightBridge <= heightBus) {
				result = i;
				break;
			} 
			i++;
		} 
		while (i <= numberBridge);
		System.out.println(result > 0 ? "Crash " + result : "No crash");
		in.close();
	}
}