package strings;

public class StringStudy {

	public static void main(String[] args) {
		//String literal string is immutable 
		//s1 and s5 is reffer same object "sagar" in constant pool area
		String s1="sagar";
		String s2="sarika";
		String s3="gopal";
		String s4="nitin";
		String s5="sagar";
		
		s1.concat(s4);
		System.out.println(s1.charAt(2));
		System.out.println(s2.codePointAt(2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.contentEquals(s4));
	}

}
