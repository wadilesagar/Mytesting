package up_casting;

public class J2 extends J1 {

	public static void main(String[] args) {
		J2 j=new J2();
		j.bike();
		j.home();
		j.money();
		j.Money();
		j.phone();
		j.Phone();
				
	}
	public void money()
	{
		System.out.println("Sons money");
	}
    public void phone()
    {
    	System.out.println("sons phone");
    }
    public void bike()
    {
    	
    }
}
