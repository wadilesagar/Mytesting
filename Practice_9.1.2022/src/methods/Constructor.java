package methods;

public class Constructor {
  
public  Constructor()
		{
	  System.out.println("main method start");
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println("addition "+c);
			System.out.println("main method is ended");
		}
 public Constructor(int a)
      {
      System.out.println("one parameter method ");
       }
 public Constructor(int a,int b)
     {
	  System.out.println("two parameter method ");
      }
 public Constructor(int a,int b,int c)
    {
	 System.out.println("three parameter method " );
    }
 public static void main(String[] args) {
	 Constructor s=new Constructor();
	 Constructor s1=new Constructor(10,20);
	 Constructor s2=new Constructor(10,20,30);
	 s.(,);
	 s2.(10,20,30);
	 
}
  }
