class Pp4
{
	public static void main(String args[])
	{ 
		System.out.println("Assignment 2 : Pyramid Pattern 4");
		
		int k=1;
	 
		for(int i=9;i>=1;i--)
		{
		 	for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}	
			
			k=1;
			for(int j=9;j>=i;j--)
			{
				System.out.print(k+" ");
				k++;
			}
			
			for(int l=9-i;l>=1;l--)
			{
				System.out.print(l+" ");
			}
			System.out.println();	
		}
	}
}