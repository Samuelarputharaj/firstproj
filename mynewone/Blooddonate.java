package mynewone;

import java.util.Scanner;

public class Blooddonate {
	public static void main(String[] args) {
		Scanner h = new Scanner(System.in);
		System.out.println("Blood donator kg");
		int kg = h.nextInt();
		if(kg>=50)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}
