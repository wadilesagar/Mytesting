package array;

import java.util.Scanner;

public class DemoArray1 {

public static void main(String[] args) {
int size,i;
Scanner r=new Scanner(System.in);
System.out.println("Enter size of array");
size=r.nextInt();
int a[]= new int[size];
for(i=0;i<size;i++)
{
a[i]=r.nextInt();	
}
System.out.println(a[i]+" ");


	}

}
