//If the number is the stepen' of 2
import java.util.Scanner;
import java.util.Random;

public class Program14_6 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		    System.out.print("");
		    int n = in.nextInt();
		 
		    if((n > 0) && ((n & (n - 1)) == 0)) {
		    	System.out.println(0);
		    } else {
		    	System.out.println(getRandomNumberInRange(1, 999));
		    } 
	}
 int min = 1;
 int max = 999;
	private static int getRandomNumberInRange(int min, int max) {
		Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
	}
}