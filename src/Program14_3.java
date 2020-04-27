//Change i byte on 1
import java.util.Scanner;

public class Program14_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("");
		int number = in.nextInt();
		int biteNum = in.nextInt();
	
		int maska = 1 << biteNum;
		
		int result = number | maska;

		System.out.println(String.valueOf(result));
	}
}
