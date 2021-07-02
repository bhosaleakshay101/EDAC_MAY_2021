// Que. 20

class DecimalToHexadecimal
{
	public static void main(String args[])
	{			
		System.out.println();
		System.out.println("Decimal to Hexadecimal");
		int num = 16;
		System.out.println("Input a decimal number = "+num);
		String hex = ConvertDecimalToHexadecimal(num);
		System.out.println("\n"+"Hexadecimal number is = "+hex);
	}	
	
	public static String ConvertDecimalToHexadecimal(int n)
	{
		int remainder;
		
		String hex= "";
	
		char hexchars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
		
		while (n>0)
		{
			remainder=n%16;
			hex = hexchars[remainder]+hex;
			n /=16;
		}
		return hex;
	}				
}

/*
n      rem        hex      
15      15         F
0
0             
*/

/*
n      rem        hex      
16      0         0
1       1         10
0 
*/