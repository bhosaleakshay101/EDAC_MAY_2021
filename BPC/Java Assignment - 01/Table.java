// Que. 7

import java.util.Scanner;

class Table
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" Input Number");
	int i = sc.nextInt();
	
	for(int n=1; n<=10; n++)
		{
		System.out.println(i+" x "+n+" = "+(i*n));
		}
	
	}
	
}