package up_casting;

public class impliaitANDExplicit {

	public static void main(String[] args) {
		
		int a=10;
		float b=a;
		System.out.println("convert int to float "+b);
	System.out.println("===============================");	
		float c=20.56f;
		int d=(int) c;
		System.out.println("Convert float to int "+d);
		System.out.println("===============================");	
		int e=30;
		double f=e;
		System.out.println("Convert int to double "+f);
		System.out.println("===============================");	
		 double h=4000;
		 int j=(int) h;
		 System.out.println("Convert double to int "+j);
		
	}

}
