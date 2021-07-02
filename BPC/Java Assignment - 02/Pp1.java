class Pp1
{
	public static void main(String args[])
	{ 
		System.out.println("Assignment 2 : Pyramid Pattern 1 ");
	 
		for(int i=1;i<=9;i++)
		{
		 	for(int j=9;j>i;j--)
			{
				System.out.print(" ");
			}	
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();	
		}	
	}
}