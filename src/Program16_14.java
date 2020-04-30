//find x
import java.text.DecimalFormat;
import java.util.*;

public class Program16_14 {
	public static Scanner in = new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.print("");
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		if (b == 0 || a<=0 && b<0) {
			System.out.println("no such x");
		} else if (a>=0 && b>0){
			System.out.println("any x");
		} else {
			Double cTemp =(double) Math.abs(b / a);
			String c = new DecimalFormat("#0.0").format(cTemp);
			if (a < 0 && b >0) {
				System.out.println("-"+c +"<x<"+ c);
			}else {
				System.out.println("x<-"+c+" or x>"+ c);
			}
		}in.close();
	}
}