package inheritance;

public class B_singleLevelStudy extends A_singleLevelStudy{

public static void main(String[] args) {
	B_singleLevelStudy b=new B_singleLevelStudy();
	b.bike();
	b.sirname();
	b.name();
}
public void name()
{System.out.println("name of B class");}

}
