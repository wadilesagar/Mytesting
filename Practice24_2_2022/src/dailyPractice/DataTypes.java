package dailyPractice;

public class DataTypes {
static int c=50;
static int d=60; //global static

 public static void main(String[] args) {
		
int a=10; //local non static
int b=40;

int f=a+b;//global non static
int h=c+d;
System.out.println("addition is "+f);
System.out.println("addition is "+h);
	}

}
