package interfaceStudy;

public interface electrical {

	
	 void Machines();
	void Electronics();
	default void Marks()
	{
		System.out.println("EE method");
	}
	static void prize()
	{
		System.out.println("static method");
	}
}
