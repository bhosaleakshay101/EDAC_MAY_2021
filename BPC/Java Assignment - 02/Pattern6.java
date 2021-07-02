class Pattern6
{
	public static void main(String args[])
	{ 
		System.out.println(" Assignment 2 : Pattern 6 ");
	
		System.out.println(" * increasing Pattern with space triangle ");
	 
		for(int i=1;i<=5;i++)
		{		 
			System.out.println(); 
	 		
			for(int j=5;j>i;j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=i;k++)
			{	
				System.out.print("* ");	
			}
		}
	}
}	