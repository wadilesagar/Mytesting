package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayList_Vector {

	public static void main(String[] args) {
		Vector v=new Vector<>();
		v.add("velocity");
		v.add("sarika");
		v.add("gopal");
		v.add("sagar");
		v.add("nitin");
		System.out.println("Array list Vector"+v);
		System.out.println(v.size());
	    v.add("RAJ");
	    v.add(4, "om");
	    v.remove(3);
	    System.out.println(v.contains("sagar"));
	    System.out.println(v.contains("sarika"));
		System.out.println("------using for loop-------");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		
		}
		System.out.println("----------using iterator------");
		
		Iterator it = v.iterator();
		while(it .hasNext())		
		{
			System.out.println(it.next());
		}
		
		System.out.println("-----using for each loop------");
		for(Object o:v)
		{
			System.out.println(o);
		}
		
		System.out.println("-----using Enumeration concept----");
		
	    Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement());
			System.out.print(" ");
		}
			
		
	}
}
