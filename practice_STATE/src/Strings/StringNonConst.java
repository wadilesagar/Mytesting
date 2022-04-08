package Strings;

public class StringNonConst {

	public static void main(String[] args) {
		String s=new String("sagar");
		String w=new String("wadile");
		String r=new String("raj");
		String s1=new String("sagar");
		
		System.out.println(s.equals(r));
		System.out.println(s.equals(s1));
		System.out.println(s.codePointBefore(3));
		System.out.println(s.compareToIgnoreCase(r));
		System.out.println(r.concat(s));
		System.out.println(s.contains(s1));
		System.out.println(s.endsWith(s1));
	}

}
