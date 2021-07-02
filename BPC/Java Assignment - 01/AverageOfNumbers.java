//  Que. 12

import java.util.*;

class AverageOfNumbers
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 nos");
	
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		int average = (i+j+k)/3;
		
		System.out.println("Average of 3 nos = "+average );	
	}
}