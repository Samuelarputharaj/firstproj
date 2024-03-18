package mynewone;

import java.util.Scanner;

public class Positiveif {
public static void main(String[] args) {
	Scanner myRed = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int num = myRed.nextInt();
	if(num>0)
	{
		System.out.println("Positive num"); 
	}
	else {
		System.out.println("Negative Num");
	}
}
}
