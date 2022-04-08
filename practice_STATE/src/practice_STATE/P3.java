package practice_STATE;

public class P3 {
String name="sagar";
int rollno=20;
float per=80.30f;
char c='s';
String add="AMBIKA COLONY";


	public static void main(String[] args) {
   P3 p=new P3("sagar",22,20.40f,'s',"ambika colony nandurbar");
   p.studInfo();
   P3 p1=new P3("gopal",30,30.40f,'g',"akola");
   p1.studInfo();
		
	}
public P3(String name,int rollno,float per,char c,String add)
{
 
}
public void studInfo()
{
	String S1=name;
	String S2=add;
	int S3=rollno;
	float S4=per;
	char S5=c;
System.out.print(" STUDENT INFORMATION " +S1+" "+S2+ " "+S3+" "+S4  );	
}

}
