package interview_regarding;

public class I_Prime_No {

	public static void main(String[] args) 
	{
        int no=13; int temp=0;
	
        for(int i=1;i<=no;i++) 
		{
		   if(no%i==0)
			{
              temp=temp+1;
            }
		}
		   if(temp>0) 
		{
			System.out.println("number is prime "+no);
		}
		  else
			{
				System.out.println("number is not prime"+no);
			}	
		}
		
	}


