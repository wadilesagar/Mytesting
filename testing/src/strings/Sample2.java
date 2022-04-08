package strings;

public class Sample2 {

	public static void main(String[] args) {
	String s="Velocity";
	String s1="Velocity";
    String s2="vel";
    String S3="Test";
	//Non constant pool area
	String m=new String("Velocity");
	String m1=new String("Velocity");
	String m2=new String("VELOCITY");
	
    System.out.println(m==m1);
    
	System.out.println(s.equals(s1));
	System.out.println();
	
	
	
	
	
	}

}
