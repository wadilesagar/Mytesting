package strings;

public class Reverse_String {

	public static void main(String[] args) {

	String s="sagar";
	
System.out.println("Origanal String is:"+s);	
	
   for(int i=s.length()-1;i>=0;i--) 
   {
	System.out.print(s.charAt(i));
   }
	
	}
}