package interfaceStudy;

public class MyICclass implements  New{

	public static void main(String[] args)
	{
		MyICclass n=new MyICclass();
		n.a1();n.a2();n.add();n.sub();n.mul();n.div();
	}

	public void add() 
	{
		System.out.println("implement method ADD");
	}
   public void sub() 
   {
		System.out.println("implement method SUB");
	}
	public void mul() 
	{
		System.out.println("implement method MUL");
	}

	public void div()
   {
		System.out.println("implement method DIV");
	}
   public void a1() 
   {
		System.out.println("implement method A1");
	}
   public void a2() {
		System.out.println("implement method A2");
		
	}

}
