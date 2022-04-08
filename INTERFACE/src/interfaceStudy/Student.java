package interfaceStudy;

public class Student implements computer,electrical {
	
public static void main(String[] args) {
	
	Student s=new Student();
	s.knowledge();
	s.java();
	s.clanguage();
	s.Machines();
	s.Electronics();
	computer.prize();
	electrical.prize();
}

void knowledge() 
{
	System.out.println("Student Knowledge");
}

public void clanguage() {

	System.out.println("Computer method complete ");
}

public void java() {
	System.out.println("Computer method complete ");
}

public void Machines() {
	System.out.println("electrical method complete ");
}

public void Electronics() {
	System.out.println("electrical method complete ");
}


public void Marks() {
	
	computer.super.Marks();
}

}
