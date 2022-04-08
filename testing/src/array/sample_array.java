package array;
import java.util.Arrays;
public class sample_array {
	public static void main(String[] args) {
		String name1="sagar";
		String name2="rajendra";
		String name3="wadile";
		
		int Salary=2000; //declaration
		String info[]=new String[3];
		
//initialization
info[0]="sagar";
info[1]="rajendra";
info[2]="wadile";
		//usage
		System.out.println(info[0]);
		System.out.println(info[1]);
	    System.out.println(info[2]);
	    
	    for(int i=0;i<3;i++)
	    {
	   	 System.out.println(info[i]);
	    }
	    
	    char grade[]=new char[8];
	    grade[0]='B';
	    grade[1]='A';
	    grade[2]='C';
	    grade[3]='E';
	    grade[4]='D';
	    
	    System.out.println(grade[0]);
	    System.out.println(grade[0]);
	    Arrays.sort(grade);
	    for(int i=0;i<=5;i++)
	    {
	    	System.out.println(grade[i]);
	    }	
	    for (int i=0;i>=grade.length-1;i++)
	    {
	    	System.out.println(grade[i]);
	    }	
	    System.out.println("========");
	    for(int i=grade.length-1;i>=0;i--)
	    {
	    	System.out.println(grade[i]);
	    }
	}
 
 
	
}
