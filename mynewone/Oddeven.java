package mynewone;

import java.util.Scanner;

public class Oddeven {
	public static void main(String[] args) {
		Scanner kd =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = kd.nextInt();
		if(num %2==0){
			System.out.println("Even");
	}
		else
		{
			System.out.println("Odd");
		}
	}

}
