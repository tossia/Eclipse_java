//Change i byte on 1
import java.util.Scanner;

public class Program14_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("");
		int number = in.nextInt();
		int biteNum = in.nextInt();
		
		System.out.println(String.valueOf(number ^ 1 << biteNum));
	}
}
