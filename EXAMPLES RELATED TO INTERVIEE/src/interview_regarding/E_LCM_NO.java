package interview_regarding;

public class E_LCM_NO {

	public static void main(String[] args) {


		int a=12,b=9,gcd=1;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		int lcm=(a*b)/gcd;
		System.out.println("THE LCM IS :"+lcm);
	}

}
