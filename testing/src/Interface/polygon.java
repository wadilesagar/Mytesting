package Interface;

public interface polygon {
void area();
}

class triangle implements polygon
{
	

	@Override
	public void area() {
		System.out.println("area of rectangle is ");
	}
}