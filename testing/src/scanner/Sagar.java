package scanner;

import java.util.Scanner;

public class Sagar {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);  
int age;

System.out.println("enter your age  ");
age=input.nextInt();
System.out.println("ok your age is "+age);
double average=input.nextDouble();
System.out.println("ok your average is "+average);
input.close();
	}

}
