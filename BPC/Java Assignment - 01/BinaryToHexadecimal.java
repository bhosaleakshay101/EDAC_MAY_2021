// Que. 23

import java.util.Scanner;

class BinaryToHexadecimal
{
	public static void main(String[] args)
	{	
		System.out.println("Input a binary number");
		Scanner sc =new Scanner(System.in);
		int num1 = Integer.parseInt(sc.nextLine(),2);
		System.out.print("Hexadecimal value = ");
		System.out.println(Integer.toHexString(num1));
	}				
}