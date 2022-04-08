package statement;

public class Nested_if {
	
	
		String UserName="Velocity";
		String Password="Velocity@123";

		if (UserName == "Velocity") 
           {
         System.out.println("UserName is correct, Please enter password");

		if (Password=="Velocity@1234")

		{

		System.out.println("Correct password, Login Success");

		}

		else
		{

		System.out.println("Please check your password");
		}

		}
}}
