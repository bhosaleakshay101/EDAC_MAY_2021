// Que. 19

class DecimalToBinary
{
	public static void main(String args[])
	{			
		System.out.println("Decimal to Binary");
		int num = 5;
		System.out.println("Input a decimal number = "+num);
		long binary = ConvertDecimalToBinary(num);
		System.out.println("\nBinary number = " +binary);
	}	
	
	public static long ConvertDecimalToBinary(int n)
	{
		long binaryNumber = 0;
		
	    long remainder, i=1;
	
		while (n!=0)
		{
			remainder=n%2;
			 n /=2;
			binaryNumber +=remainder*i;
			i*=10;
		}
		return binaryNumber;
	}				
}

/*
binaryNumber     rem      i        	n
0                 1       1   		19
1                 1       10       	9
11                0       100      	4   
11                0       1000     	2
11                1       10000    	1
10011                     100000   	0
   
*/

/*
binaryNumber      rem      i        n
0                  1       1        1
1                          10       0
   
*/

/*
binaryNumber      rem      i        n
0                  0       1        2
0                  1       10       1
10                         100      0 
*/

/*
binaryNumber      rem      i        n
0                  1       1        3
1                  1       10       1
11                         100      0
*/

/*
binaryNumber      rem      i        n     rem
0                  0       1        4
0                  0       10       2
0                  1       100      1
100                                       0
*/

/*
n      bN          i        rem
5       0          1         1
2       1          10        0
1       1          100       1
0       101      
*/