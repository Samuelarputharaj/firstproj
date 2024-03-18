package mynewone;

import java.util.Scanner;

public class Ifageweight {
	
		public static void main(String[] args) {
			Scanner h = new Scanner(System.in);
			System.out.println("Enter u r age");
			int age = h.nextInt();
			System.out.println("Enter u r kg");
			int kg = h.nextInt();
			
			if(age>18)
			{
				if(kg<50)
				{
					System.out.println("U r not eligible because weight is "+kg);
								
				}
				else
				{
					System.out.println("u r eligible");
				}
			}
			
			else
			{
				System.out.println("u r not eligible because age is"+age);
			}
		
			}
		
		}

			

