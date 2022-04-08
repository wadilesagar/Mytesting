package statement;

public class Nested_if_1 {

	public static void main(String[] args) {
  
		String username="velocity";//if pass is correct
		String pass="123";
		String email="wadilesagar";
if (username=="velocity")		
    {
	System.out.println("enter pass ");
    } 
if (pass=="234")
{
	System.out.println("pass is correct");}
	 if(pass=="234")
	 {
		System.out.println("wrong pass");
		System.out.println("forget pass  ");
	}

 
if(email=="wadilesagar")
    {
	System.out.println("login successful");
	}

else {
	System.out.println("Wrong pass please check the pass");
}
		
	}

}
