package mynewone;

public class fibbonaci {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next ;
				
		for(int i=0;i<11;i++) 
		{
			System.out.println(first);
			next = first+second;  
			first =second;
			second= next;
			
		}
	}

}
