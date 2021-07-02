// Que. 5

import java.util.Scanner;

class ProductOfTwoNumbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Input First Number");
		int i = sc.nextInt();
		
		
		System.out.println(" Input Second Number");
		int j = sc.nextInt();
		
		int k = i*j;
		System.out.println(i+" * "+j+" = " +k);
	}	
}