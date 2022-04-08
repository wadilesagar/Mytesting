package Contro_State;

public class nested_if {

	public static void main(String[] args) {
		String name="sagar";
		String sirname="wadile";
		String address="nandurbar";
		
		if(name=="sagar")
		{
			System.out.println("name is correct please insert sirname");
			
			if(sirname=="wadile")
			{
				System.out.println("filled information correct please insert address");
			}
			else
			{
				System.out.println("please check sirname ");
			}
			if (address=="nandurbar")
			{
				System.out.println("correct address");
			}
			else
			{
				System.out.println("please insert correct address");
			}
		}
		else
		{
			System.out.println("invalid infromation ");
		}
		}
			
	}


