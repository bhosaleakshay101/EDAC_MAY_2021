// Que. 24

class BinaryToOctal
{
	public static void main(String args[])
	{			
		System.out.println();
		System.out.println("Binary to Octal");
		int num = 111;
		System.out.println("Input a Binary number = "+num);
		int decimal = ConvertBinaryToOctal(num);
		System.out.println("\n"+"Octal number is = "+decimal);
	}	
	
	public static int ConvertBinaryToOctal(int binary)
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
111             0         0           1
11              1         1           1
1               3         2           1
0               7         3
*/