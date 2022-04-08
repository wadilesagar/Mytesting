package interview_regarding;

public class C_Fibonacci_Series {

	public static void main(String[] args) {
		
		
		int n=10,s=0,k=1;
		System.out.println("fibonacci series");
		for(int i=1;i<n;i++)
		{
		System.out.print(" , "+s);
		int NextT=s+k;
		s=k;
		k=NextT;
		}


//		int n=5,SK=0,DW=1;
//		System.out.println("Fibonacci Series"+n);
//		for(int i=1;i<n;i++)
//		{
//			System.out.print(SK+", ");
//			int NextT=SK+DW;
//			SK=DW;
//			DW=NextT;
//		}
		
	}

}


//int n=5,s=0,k=1;
//System.out.println("fibonacci series")
//for(int i=1;i<n;i++)
//{
//System.out.println(""+s);
//int NextT=s+k;
//s=k;
//k=NextT;
//}
