package mynewone;

import java.util.Scanner;

public class Marksheet {
public static void main(String[] args) {
	Scanner l =new Scanner (System.in);
	System.out.println("Enter your Mark");
	int mark = l.nextInt();
	if(mark>=90&&mark<100){
		System.out.println("grade A");
	}
 	else if(mark>=80&&mark<=90) {
		
	System.out.println("grade B");
	}
	else if(mark>=70&&mark<=80) {
		
		System.out.println("grade C");
	}
	else
	{
		System.out.println("Fail");
	}
	
	}
}


