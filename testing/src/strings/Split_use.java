package strings;

public class Split_use {

	public static void main(String[] args) {
		String s="I : LOVE : MY  : INDIA";
		String sp=" : ";
		String[] required=s.split(sp);
//		
//		System.out.println(required[0]);
//		System.out.println(required[2]);
//		System.out.println(required[1]);
		
		
		for(int i=0;i>0;i++)
		{
			System.out.println(required[i]);
		}
		for(int i=3;i<0;i--)
		{
			System.out.println(required[i]);
		}
		String mystring="GOOD MORNING";
		String sp2=" ";
		String[]output=mystring.split(s);
		System.out.println(output[0]);
		System.out.println(output[1]);
		
	}

}
