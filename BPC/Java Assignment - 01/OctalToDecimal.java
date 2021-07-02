// Que. 25

class OctalToDecimal
{
	public static void main(String args[])
	{			
		System.out.println();
		System.out.println("Octal To Decimal");
		int num = 10;
		System.out.println("Input a Octal number = "+num);
		int decimal = ConvertOctalToDecimal(num);
		System.out.println("\n"+"Deciaml number is = "+decimal);
	}	

	public static int ConvertOctalToDecimal(int octal)
	{
		int n=0;
		int decimal=0;
			
		while(true)
			if(octal==0)
			{
				break;
			}
			else 
			{
				int temp = octal%10;
				decimal += temp*Math.pow(8,n);
				octal= octal/10;
				n++;
			}				
			return decimal;
	}				
}