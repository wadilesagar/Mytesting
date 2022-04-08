package polymorphism;

public class User_data {

	public static void main(String[] args) {
	User_data d=new User_data();
    d.name();
	d.name("RAJ", "WADILE",3456);

	}
	public void name()
	{
		String Owner_name="SAGAR WADILE";
		String Car_Name="CRETA";
		int Car_no=1234;
		System.out.println("CRETA OWNER DATA "+Owner_name+ " "+Car_Name+ " "+Car_no+ "");
	}
	
    public void name(String Owner_name ,String Car_name,int Car_no) 
     {
    	
    System.out.println("OWNER DATA "+Owner_name+" "+ Car_name+ " " + Car_no);	 
     
     }
}
