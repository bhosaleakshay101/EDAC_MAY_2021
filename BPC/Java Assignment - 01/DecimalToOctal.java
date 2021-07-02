// Que. 21

class DecimalToOctal
{
	public static void main(String args[])
	{			
		System.out.println();
		System.out.println("Decimal to Octal");
		int num = 15;
		System.out.println("Input a decimal number = "+num);
		String octal = ConvertDecimalToOctal(num);
		System.out.println("\nOctal number is = "+octal);
	}	
	
	public static String ConvertDecimalToOctal(int n)
	{
		int remainder;
		
		String octal= "";
		
		char octalchars[] = {'0','1','2','3','4','5','6','7'}; 

		while (n>0)
		{
			remainder=n%8;
			octal = octalchars[remainder]+octal;
			n /=8;
		}
		return octal;
	}				
}

/*
n      rem        octal      
15      7           7
1       1          17
0             
*/