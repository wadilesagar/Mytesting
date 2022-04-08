package interview_regarding;

public class B_Factorial_No {

	public static void main(String[] args) {
	
		int n=7;
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print("fact is "+fact);
	}

}

