class Sp16
{
	public static void main(String args[])
	{ 
		System.out.println("Assignment 2 : Star Pattern 16 ");
	 
		for(int i=1;i<=5;i++)
		{
		 	for(int j=1;j<=5;j++)
			{
				if(j==5||i+j==6||i==5)	
			 	{ 
					System.out.print("*");	 
				}
				
				else
				{
					System.out.print(" ");
				}				 
			}
			System.out.println();
		}	
	}
}