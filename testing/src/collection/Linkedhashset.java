package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
      
	 LinkedHashSet lh = new LinkedHashSet<>();
	 lh.add("sagar");
	 lh.add("raj");
	 lh.add("tanu");
	 lh.add("sonu");
	 lh.add("gopal");
	 lh.add("vishal");
	 lh.add("vishawas");
	 lh.add("golu");
	 
	 System.out.println(lh);
//	 System.out.println(lh.contains("sagar"));
//	 System.out.println(lh.remove("gopal"));
//	 System.out.println(lh.addAll(lh));
	 
	 System.out.println("========using for each loop======");
	 
	
	 for(Object o:lh)
	 {
		System.out.println(o); 
	 }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 Iterator it= lh.iterator();
	 
	
	 
	 
	 
	 
	
    
	 
	 
	
	    
	}

}
