package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();//default array list
		al.add("SAGAR");
		al.add(11.12);
		al.add("RAJ");
		al.add('S');
		al.add("RAJ");
		al.add(null);
		al.add('S');
		al.add(null);
		System.out.println(al.size());//provide array size in integer value
		//simple method to add index value
		System.out.println(al);
		al.add("SAGAR");//add in last 
		System.out.println(al);
		al.add(5, "gopal");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.remove(5);//REMOVE VALUE FROM INDEX AND ADD NEXT CONTAION ON REMOVE PLACE
		System.out.println(al);
		System.out.println(al.contains('B'));//SHOW VALUE PRSENT IN ARRAYLIST OR NOT BOOLEAN VALUE RETURN
        System.out.println(al.contains('S'));
	    System.out.println(al.isEmpty());//provide boolean value arraylist empty or not
	    
	    System.out.println("--------using for loop method---------");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("--------using iterator--------------");
		Iterator it= al.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
	
		System.out.println("--------using for each loop---------");
		for(Object o:al)
		{
			System.out.println(o);
		}
			
	}

}
