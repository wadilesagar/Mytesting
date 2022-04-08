package up_casting;

public class Son extends Mom{

	public static void main(String[] args) {
		
	Mom m=new Son();
	m.look();
	m.money();

	
	}
public void pen()
{
System.out.println("sons pen");	
}
public void bat() 
{
System.out.println("sons bat");	
}
}
