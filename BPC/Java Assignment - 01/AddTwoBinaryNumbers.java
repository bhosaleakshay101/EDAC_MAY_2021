// Que. 17

import java.util.Scanner;

class AddTwoBinaryNumbers
{
	public static void main(String args[])
		{	
			long b1, b2;
			int carry=0,i=0;
			
			int[] sum= new int[10];
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first binary number");
			b1 = sc.nextLong();
			
			System.out.println("Enter second binary number");
			b2 = sc.nextLong();

			while(b1 != 0 || b2 != 0)			
			{
				sum[i++] = (int)((b1 % 10 + b2 % 10 + carry) % 2);
				carry = (int)((b1 % 10 + b2 % 10 +carry) / 2);
				b1 = b1 / 10;
				b2 = b2 / 10;
			}
			
			if(carry != 0)
			{
				sum [i++]=carry;
			}
			--i;
			
			System.out.print("Output : ");
	
			while(i >= 0)
			{
				System.out.print(sum[i--]);
			}
			System.out.print("\n");
	}				
}