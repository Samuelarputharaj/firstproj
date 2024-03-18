package mynewone;

import java.util.Scanner;

public class currentbill {
public static void main(String[] args) {
	Scanner f =new Scanner(System.in);
	System.out.println("Enter the Current bill unit");
	int unit =f.nextInt();
	System.out.println("Enter one unit price");
	int oneunitprice =f.nextInt();
	int rs =unit*oneunitprice;
	if(rs>300) {
		System.out.println("current bill pay : "+rs);
	}
	else
		System.out.println("Not pay current bill :" +rs);
}
}
