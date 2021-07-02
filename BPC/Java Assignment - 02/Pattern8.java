class Pattern8
{
	public static void main(String args[])
	{ 
		System.out.println(" Assignment 2 : Pattern 8 ");
	 
		for(int i=5;i>=1;i--)
		{		 
			System.out.println(); 
	 		
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			int k =i;
				while(k<=5)
				{
					System.out.print(k+" ");
					k++;
				}	
		}
	}
}	