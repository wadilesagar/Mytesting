package Interface;

public class son implements father,mother {

public static void main(String[] args) {
		
		son s= new son();
		s.money();
		s.love();
		s.rules();
		father.nature();// calling static complete method from interface
		mother.nature();//calling static complete method from interface
		
	}

	

	@Override
	public void love() 
	{
		//to call specific default method from super interface follow syntax
		// interfacename.super.methodname
		System.out.println("Son's love:");
		father.super.love();// calling default Love method form father
		mother.super.love();// calling default Love method form Mother
	}

	@Override
	public void money() {
		System.out.println("Fathers money completed in Son's Class:");
		
	}

	@Override
	public void rules() {
       System.out.println("Fathers rules completed in Son's Class:");
		
	}



	@Override
	public void look() {
		System.out.println("Son Method");
	}
}