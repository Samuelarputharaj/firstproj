package mynewone;

import java.util.Scanner;

public class Ifstatement {
	public static void main(String args[])
	{
		Scanner mySam = new Scanner(System.in);
		
		System.out.println("Voting age is :");
		int age =mySam.nextInt();
		if(age>=18)
		{
			System.out.println("eligigible");
		
		}
		else {
			System.out.println("not eligible");
		}
	}

}
