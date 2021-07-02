// Que. 11

import java.util.*;

class Circle
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius of Circle");
	
		Double r = sc.nextDouble();
		
		Double perimeter= (Math.PI*2*r);
		System.out.println("Perimeter of circle = "+perimeter );
		
		Double area= (Math.PI*r*r);
		System.out.println("Area of circle = "+area );	
	}
}