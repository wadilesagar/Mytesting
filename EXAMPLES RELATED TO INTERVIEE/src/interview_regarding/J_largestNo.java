package interview_regarding;
import java.util.*;
public class J_largestNo {

	public static void main(String[] args) {
	    int a,b,c;int largest;
        System.out.println("Enter value");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
     
        if(a>b) 
        {
            if(a>c)
            {
               System.out.println("A is largest "+a); 
            } 
            else 
            {
            	  System.out.println("C is largest "+c);
            }
        } 
        else
        {
            if(b>c) 
            {
            	  System.out.println("B is largest "+b);
            } 
            else 
            {
            	System.out.println("C is largest "+c);
            }
        }
     }
}


