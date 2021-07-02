class Pattern13
{
	public static void main(String args[])
	{ 
		int alpha=64;

		System.out.println(" Assignment 2 : Pattern 13 ");
	 
		for(int i=1;i<=5;i++)
		{		 
			System.out.println(); 

	 		for(int j=5;j>i;j--)
			{
			System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
			System.out.print((char)(alpha+i)+" ");
			}
		}
	}
}