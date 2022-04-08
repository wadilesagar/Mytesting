package strings;
 public class String_Full_Study {
   public static void main(String[] args) {
	String s1="velocity";
	String s2="Velocity";
	String s3="velo";
	String s4="test";
	String s5="";
	String s6=" ";
	System.out.println(""+s2);
	
	String m=new String("Velocity");
	String m1=new String("velocity");
	String m2=new String("velo");
	String m3 =new String("Velo");
	
	// == operator
	System.out.println(s1==s2); //its check object location if obj diff then false containt s1 and s2 same so true
	System.out.println(s2==s3); //containt s2 and s3 diff so false but same loctation
	System.out.println(s2==m1); //s2 & m3 same containt pool change so false
	//.equals command
	System.out.println(s1.equals(m1));
	System.out.println(s1.equals(m3));//its check containt if containt diff value are false
	System.out.println(s4.equals(m));	
	 //ignorecase 
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s1.equalsIgnoreCase(m));
	//ignoreuppercase----touppercase/tolowercase
	System.out.println(s3.toUpperCase()); //if lower case letter its convert into upper case letter
	System.out.println(s2.toLowerCase());//its convert upper case letter into lower case letter
	//length
	System.out.println(s1.length());
	System.out.println(s3.length());//TO FIND STRING LENGTH
	//charAt
	System.out.println(s3.charAt(3));
	System.out.println(s4.charAt(2));
	//empty
	System.out.println(s5.isEmpty());// string is empty not
	System.out.println(s6.isEmpty());
	//blank
	System.out.println(s5.isBlank());
	System.out.println(s4.isBlank());
	//endwithchar
	System.out.println(m.endsWith("ty")); //end with last char or not
	//startwith char
	System.out.println(s3.startsWith("v"));
	System.out.println(s4.startsWith("v"));
	//substring
	System.out.println(s1.substring(5));//to count last digit of string except input value
	System.out.println(s1.substring(1,5));//to show middle of input values
	
	
	}
}
