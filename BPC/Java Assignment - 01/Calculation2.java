// Que. 6

import java.util.Scanner;

class Calculation2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Input First Number");
		int i = sc.nextInt();
		
		System.out.println(" Input Second Number");
		int j = sc.nextInt();
		
		System.out.println(i+ " + " +j + " = " +(i+j));
		System.out.println(i+ " - " +j + " = " +(i-j));
		System.out.println(i+ " x " +j + " = " +(i*j));
		System.out.println(i+ " / " +j + " = " +(i/j));
		System.out.println(i+ " mod " +j + " = " +(i%j));
	}	
}