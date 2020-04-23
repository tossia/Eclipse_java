//Watch
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.print("");
		int a = in.nextInt();
		
		int hour = a / 3600 % 24;
		int min1 = a / 60 % 60;
		int sec1 = a % 60;
		String zero = "0";
		String min2;
		String sec2;
		
		if(min1<10) {
			 min2 = zero + String.valueOf(min1);
			 
		} else {
			min2 = String.valueOf(min1);
		}
		
		if(sec1<10) {
			sec2 = zero + String.valueOf(sec1);
		}else{
			sec2 = String.valueOf(sec1);
		}
		
		System.out.print(String.valueOf(hour)+":"+min2+":"+sec2);
		in.close();
	}
}