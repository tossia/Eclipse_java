// Find Prime number
import java.util.*;

public class Program17_21_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();

		int primeNumber = 0;
		
		if (number< 1000) {
            for (int i = number+1; i < 1010; i++) {
                if (check(i)) {
                	primeNumber = i;
                    break;
                }
            }
            System.out.println(primeNumber);
        }
    }
 
    public static boolean check(int primeNumber) {
        for (int i = 2; i < primeNumber; i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}