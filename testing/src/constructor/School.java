package constructor;

public class School {

	public static void main(String[] args) {
		
		Client s1=new Client();
		s1.Stud_grade='s';
		s1.Stud_name="sagar";
		s1.Stud_rollno=123;
		s1.Student();
		
		System.out.println("========");
		
		Client s2=new Client();
		s1.Stud_grade='g';
		s1.Stud_name="GOPAL";
		s1.Stud_rollno=345;
		s1.Student();
			
	}

}
