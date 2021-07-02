// Que. 18

import java.util.Scanner;

class MultiplyTwoBinaryNumbers
{
	public static void main (String [] args)
	{
	   int num1,num2;
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter first binary number");
	   num1= Integer.parseInt(sc.nextLine(),2);
	   
	   System.out.println("Enter second binary number");
	   num2= Integer.parseInt(sc.nextLine(),2);
	   
	   System.out.print("Product of two binary number = ");
	   System.out.println(Integer.toBinaryString(num1*num2));
	}
}