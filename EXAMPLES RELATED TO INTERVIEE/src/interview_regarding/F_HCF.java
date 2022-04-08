package interview_regarding;

public class F_HCF 
{
  public static void main(String[] args) 
	{
	
	int n1=40,n2=20,h=1;
   for(int i=1;i<=n1;i++)
   {
     if(n1%i==0 && n2%i==0)  
     {
	h=i;
	System.out.println("HCF IS"+h);
	 }
   }
	
   }
}

