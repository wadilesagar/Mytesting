package inheritance;

public class B_Hyrachical extends A_Hyrachical{
public void son_bike()
{System.out.println("sons bike");}
public void son_car()
{System.out.println("sons car");}
public static void main(String[] args) {
	B_Hyrachical b=new B_Hyrachical();
	b.father();
	b.father_car();
	b.fathers_bike();
}
}
