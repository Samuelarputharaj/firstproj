package mynewone;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) 
	{
	Scanner di = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = di.nextInt();
	int count= 0;
	if(num<=1)
	{
	System.out.println("This is not prime");
	}
	else
	{
    for(int i=2;i<=num/2;i++)
    {
    	if(num%i==0) {
    		count++;
    		break;
    	}
    }
    	if(count==0)
    	{
    		System.out.println("this is a prime num");
    	
    	}
    	else 
    	{
    		System.out.println("This is not prime");
    	}
    }
	}

}