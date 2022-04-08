package statement;

public class Else_if {

	public static void main(String[] args) {
		int marks=51;
		
		if (marks>20 & marks<30)
		{
			System.out.println("i am 2nd class");
		}
		else if (marks>=35 & marks<=40)
		{
			System.out.println("i am 1st class");
		}
		else if (marks>=45 & marks<=50)
		{
			System.out.println("i am distinction");
		}
		else 
		{
			System.out.println("fail");
		}
	}

}
