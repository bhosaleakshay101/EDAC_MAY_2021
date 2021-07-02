class Pattern11
{
	public static void main(String args[])
	{ 
		System.out.println(" Assignment 2 : Pattern 11 ");
	 
		for(int i=1;i<=5;i++)
		{		 
			System.out.println(); 

	 		for(int j=5;j>i;j--)
			{
			System.out.print(" ");
			}
			
			for(int k=0;k<=i+(i-2);k++)
			{
			System.out.print("*");
			}
		}
	}
}	
