// Que. 15

import java.util.*;

class Swap
{
	public static void main(String args[])
	{	
		System.out.println();
		System.out.println("Swap Numbers");
		
		System.out.println(" Enter 2 nos");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int temp = 0;
		
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println();
		System.out.println("after swapping");
		System.out.println("a ="+a);
		System.out.println("b ="+b);	
	}	
}