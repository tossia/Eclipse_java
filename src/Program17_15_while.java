//Nb of chiffre in byte presentation
import java.util.*;

public class Program17_15_while {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int number = in.nextInt();
		int nbByte = 0;
		
		while (number > 0) {
			number /= 2;
			nbByte++;
		}
		System.out.println(nbByte);		
		in.close(); 
	}
}