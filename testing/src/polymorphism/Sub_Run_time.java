package polymorphism;

public class Sub_Run_time extends Run_time {

	public static void main(String[] args) {
		Run_time P=new Run_time();
		   P.Features(1234, "samsung",200000);
		   
		   Sub_Run_time s=new Sub_Run_time();
		   s.Features(7890, "NOKIA", 500000);
	}
	public void Features(int model_no,String mo_name,int price)
	{
		System.out.println("The Mobile Features "+model_no+ " "+mo_name+ " "+price);
		
	
	}
}
