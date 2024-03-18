package mynewone;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner w = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = w.nextInt();
	
			if((year%4==0)||(year%100==0)&&(year%400==0))
				 {
			
						
			System.out.println("leap year");
		}
		else
		
			System.out.println("Not a leap year");
		}
}
