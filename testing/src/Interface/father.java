package Interface;

public interface father {

	void money();
	void rules();
	void look();
	default void love()
	{
		System.out.println("Fathers Love:");
	}
	
	static void nature()
	{
		System.out.println();
	}
	
}