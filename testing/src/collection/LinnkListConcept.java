package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinnkListConcept {

	public static void main(String[] args) {
		
		  LinkedList ll = new LinkedList();
		{
			ll.add("sagar");
			ll.add("gopal");
			ll.add("sarika");
			ll.add("120");
			ll.add(null);
			ll.add(200);
			ll.add(null);
			ll.add("sarika");
			System.out.println(ll);
			System.out.println(ll.size());
			System.out.println(ll.indexOf("sarika"));
			System.out.println(ll.lastIndexOf("sarika"));
			System.out.println(ll.contains("sagar"));//only show available contains
			System.out.println(ll.isEmpty());
			System.out.println(ll.get(3));//show index value of string
	       	ll.remove(7);
			System.out.println(ll);
		}
			
        System.out.println("--------using for loop-----------");
		for(int i=0;i<=ll.size()-1;i++)
     	{
     		System.out.println(ll.get(i));
     	}
		
		System.out.println("---------using iterator-------------");
		 Iterator it = ll.iterator();
		 while(it.hasNext())
		 {
		 System.out.println(it.next());
		 }
		 
		 System.out.println("---------using listIterator------------");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
	    System.out.println("---------using for each------------");
			for(Object o:ll)
			{
				System.out.println(o);
			}
	}
	

}
