//How many days up to New Year
import java.util.*;

public class Program16_22 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int month = in.nextInt();
		int day = in.nextInt();
		int daysMonth = 0;
		int totalDays = 0;
		int i = 1;
		int fault = 0;
		
		if (day < 1 || month < 1 || month > 12 || day >31 || (month == 2 & day > 28)) {
			System.out.println(-1);
		} else {
			if (month == 1) {
				System.out.println(365 - day);
			}else {
			
			while (i <= month) {
			switch (i) {
			case (2):
				daysMonth = 28;
				break;
			case (4):
			case (6):
			case (9):
			case (11):
				daysMonth = 30;
				break;
			case (1):
			case (3):
			case (5):
			case (7):
			case (8):
			case (10):
			case (12):
				daysMonth = 31;
				break;
			default:
				daysMonth = 0;
			}
			if (i == month  & (day > daysMonth)) {
				fault = -1;
			}
			totalDays = totalDays + daysMonth;
			i = i + 1;
			}
			
			if (fault == -1) {
				System.out.println(-1);
			} else {
				System.out.println(365 - totalDays - day + daysMonth);
			} in.close(); 
			}
		}
	}
}