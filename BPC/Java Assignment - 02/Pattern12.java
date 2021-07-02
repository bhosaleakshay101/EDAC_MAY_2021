class Pattern12
{
	public static void main(String args[])
	{ 
		System.out.println(" Assignment 2 : Pattern 12 ");
	 
		for(int i=1;i<=5;i++)
		{	
	 		for(int j=5;j>i;j--)
			{
			System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{	
				System.out.print(i+" ");
			}
			System.out.println();
		}	
	}
}	