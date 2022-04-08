package constructor;

public class ex3 {

	
		public static void main(String[] args) 
		{
	     variable_call v=new variable_call();//created object of another class
		System.out.println("value of a is "+v.a);//calling not static variable fron another class
		System.out.println("value of b is "+variable_call.b);//calling static variable from another class

	}

}

