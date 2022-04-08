package interview_regarding;

public class While_loop {

	public static void main(String[] args) {
		int num=407,number,temp,Total=0;
		number=num;
		//while(;number!=0;number/=10)   
		for(;number!=0;number/=10)
		{
			temp=number%10;Total=Total+temp*temp*temp;
			number/=10;
		}	
		if(Total==num)
	System.out.println("num is an armstrong number "+num);
		else
		{
			System.out.println("num is not an armstrong number "+num);
			
		}
			
	}

}
