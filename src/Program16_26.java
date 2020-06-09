//What kind of triangle
import java.util.*;

public class Program16_26 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int min = 0;
		int middle = 0;
		int max = 0;
		
		if (a < b && b < c) {
		 min = a;
		 middle = b;
		 max = c;
		}else if (a < c && c < b){
			min = a;
			 middle = c;
			 max = b;
		}else if (b < a && a < c) {
			min = b;
			 middle = a;
			 max = c;
		} else if (b < c && c < a){
			min = b;
			 middle = c;
			 max = a;
		} else if (c < a && a < b) {
			min = c;
			 middle = a;
			 max = b;
		}else if (c < b && b < a){
			min = c;
			 middle = b;
			 max = a;
		}else if (a == b & b == c) {
			min = middle = max = a;
		}
		int t = min * min + middle * middle - max * max;
		if (min + middle <= max) {
			System.out.println("impossible");
		} else if (t == 0) {
			System.out.println("right");
		} else if (t < 0) {
			System.out.println("obtuse");
		} else {
			System.out.println("acute");
		}
		in.close(); 
	}
}