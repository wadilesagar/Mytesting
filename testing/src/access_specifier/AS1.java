package access_specifier;
public class AS1 {
	int a=10; //default global variable within package
	public int b=20;//public global variable throughout the project
	private int c=30;//private global variable within class
    protected int d=40;//protected global variable within package but using inheritance throughout the project
	
    public static void main(String[] args) {
    	AS1 a1=new AS1();
    	a1.test1();
    	a1.test2();
    	a1.test3();
    	a1.test4();
    	 }
	  public void test1() 
	   {
		System.out.println("public void test from AS1");   
	   }
		void test2() {
			System.out.println("default test form AS1");
		}
		protected void test3() {
			System.out.println("protected test form method AS1");
		}
		private void test4() {
			System.out.println("private test method for AS1");
		}
	 }


