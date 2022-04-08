package polymorphism;

public class Bicycle {
	
	    void run()
	    {
		   System.out.println("bicycle is running");
		 }
	    
}

 class HondaShine extends Bicycle
          {
		 void run()
		   {
		     System.out.println("shine is running safely with 70km");
		   }
		 
		   public static void main(String args[]){
			   HondaShine   b = new HondaShine();//upcasting
		     b.run();
		     
		     
		   }
		 }

