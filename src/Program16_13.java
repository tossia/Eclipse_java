//Торт, торта, тортов4
import java.util.*;

public class Program16_13 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int a = in.nextInt();
		int tort10 = a % 10;
		int tort100 = a % 100;
		
		if (a < 21 || tort100 < 21) {
			if (a == 1 || tort100 == 1) {
			System.out.println(a + " TOPT");
			} else if (tort100 > 1 && tort100 < 5 || a > 1 && a < 5){
				System.out.println(a + " TOPTA");
			}else {
				System.out.println(a + " TOPTOB");
			}
		}else {
			if (tort10 == 1 && tort100 > 20) {
				System.out.println(a + " TOPT");
			} else if (tort10 > 1 && tort10 < 5){
			System.out.println(a + " TOPTA");
			}else {
				System.out.println(a + " TOPTOB");
			}
		}in.close();
	}
}