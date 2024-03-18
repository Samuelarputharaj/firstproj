package mynewone;

import java.util.Scanner;

public class curr {
public static void main(String[] args) {
	Scanner u =new Scanner(System.in);
	System.out.println("Enter your unit ");
	int unit=u.nextInt();
	System.out.println("Enter one unit cost");
	int cost =u.nextInt();
	if(unit>300)
	{
		System.out.println("your current bill is  : "+unit*cost);
	}
	else
	{
		System.out.println("Jolly no current bill :" +unit*cost);
	}
}
}
