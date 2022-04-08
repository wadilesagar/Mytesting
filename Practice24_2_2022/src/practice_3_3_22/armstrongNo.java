package practice_3_3_22;

public class armstrongNo {

	public static void main(String[] args) {

   int no=370,reminder,result=0,originalno;
   
	originalno=no;
	while(originalno!=0)
	{
		reminder=originalno%10;
		result+=Math.pow(reminder, 3);
		originalno/=10;
	}
	if(result==no)
	{
		System.out.println("this is armstrong no "+no);
	}
	else
	{
		System.out.println("this is not armstrong no "+no);
	}
	}

}

