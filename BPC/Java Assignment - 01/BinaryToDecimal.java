// Que. 22

class BinaryToDecimal
{
	public static void main(String args[])
	{			
		System.out.println();
		System.out.println("Binary to Decimal");
		int num = 100;
		System.out.println("Input a Binary number = "+num);
		int decimal = ConvertBinaryToDecimal(num);
		System.out.println("\nDecimal number is = "+decimal);
	}	

	public static int ConvertBinaryToDecimal(int binary)
	{
		int n=0;
		int decimal=0;
		
		while(true)
			if(binary==0)
				break;
				
			else 
			{
				int temp = binary%10;
				decimal += temp*Math.pow(2,n);
				binary= binary/10;
				n++;
			}				
			return decimal;
	}				
}

/*
binary      decimal       n         temp
100            0          0           0
10             0          1           0
1              0          2           1
0              4          3            
*/