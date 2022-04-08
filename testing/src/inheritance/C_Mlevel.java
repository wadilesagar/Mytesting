package inheritance;

public class C_Mlevel extends B_Mlevel {

	public static void main(String[] args) {
		C_Mlevel c=new C_Mlevel();
		c.father_property();
		c.fathers_bike();
		c.fathers_money();
		c.mother();
		c.mother_salary();
		c.mothers_bike();
		c.son_car();
	}
public void son()
{System.out.println("sons bike");}
public void son_car()
{System.out.println("sons car");}
}
