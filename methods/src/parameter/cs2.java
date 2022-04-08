package parameter;

public class cs2 {
    int a;
	int b;
	int c;
	 
  public cs2()  {
	  int a=100;
	  int b=200;
	  int c=300;
	 System.out.println("running zero parameter method ");
		
	
	}
  public cs2(int num1){
	  a=num1;
	  System.out.println("addition is "+a);
   }
  public cs2(int num1,int num2) {
	  a=num1;
	  b=num2;
	  System.out.println("addition is "+b);
  }
  public cs2 (int num1,int num2,int num3) {
	  a=num1;
	b=num2;
	c=num3;
    System.out.println("addit[on is "+c);
  }
  public cs2(int a,int b,int c,int sum) {
	int num3;
	System.out.println("addit[on is "+sum);
  }
  
  public static void main(String[] args) {
	  cs2 c2=new cs2();
	  c2.addition();
	  
	  cs2 c3=new cs2(200,300);
	  c3.addition();
	  
	   cs2 c5=new cs2(500,200,300);
	  c5.addition();
	  cs2 c6=new cs2(500,500,300);
	  c6.addition();
	  
	  
	  }
   public void addition() {
	int sum=a+b+c;
	
	
}

}


