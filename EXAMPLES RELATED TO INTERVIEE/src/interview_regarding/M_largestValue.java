package interview_regarding;

import java.util.*;

public class M_largestValue {

	public static void main(String[] args) {

		
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A");
        a=sc.nextInt();
		System.out.println("Enter value of B");
		b=sc.nextInt();
		System.out.println("Enter value of C");
	    c=sc.nextInt();
		System.out.println("Enter value of D");
		d=sc.nextInt();
		if(a>b)
		{
		  if(a>c) 
	       {
			  if(a>d)
			  {
				System.out.println("A is largest No"+d);
			  }
			 else
			  {
				System.out.println("B is largest no"+b);
		 	  }
		   }
		  else if(b>c)
		  {
			  if(b>d)
			  {
				  System.out.println("B is largest "+b);
			  }
			  else
			  {
				  System.out.println("D is largest no"+d);
			  }
		  }
		  if(c>d)
		  {
			  System.out.println("c is largest no"+c);
		  }
		}
		else
		{
			System.out.println("INVALID DATA");
			
		}
	}

}
