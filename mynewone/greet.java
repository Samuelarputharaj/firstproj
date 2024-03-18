package mynewone;

import java.util.Scanner;

public class greet {
	public static void main(String[] args) {
		Scanner n =new Scanner(System.in);
		System.out.println("What is time");
		int time =n.nextInt();
		if(time>=3&&time<=11)
		{
			System.out.println("Good morning");
		}
		else if(time>=12&&time<=15)
		{
			System.out.println("Good Afternoon");
		}
		else if(time>=15&&time<=19)
		{
			System.out.println("Good Evening");
		}
		else if(time>=20&&time<=24)
		{
			System.out.println("Good Night");
		}
	}
				
	}
	
	


