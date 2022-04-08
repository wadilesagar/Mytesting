package up_casting;

public class Brother extends Big_brother {

	public static void main(String[] args) 
	{
		Brother b=new Brother();
		b.bike();
		
		
		Big_brother b1=new Brother();
		b1.bike();
		

		Big_brother b2=new Big_brother();
		b2.bike();
	}
	
public void bike()
{
System.out.println("BROTHERS BIKE PULSER");	
}

public void scooter()
{System.out.println("Brothers scooter");}

}
