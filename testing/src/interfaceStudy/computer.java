package interfaceStudy;

public interface computer {

	
	void clanguage();
	void java();
	default void Marks()
	{
		System.out.println("computer");
	}
	static void prize()
	{
		System.out.println("static method");
	}
}
