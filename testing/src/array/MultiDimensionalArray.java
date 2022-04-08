package array;

public class MultiDimensionalArray {
//2 by 2 matrix
	public static void main(String[] args) {
	char grade[][]= {{'A','B'},{'C','D'}};
	for(int i=0;i<=grade.length-1;i++)
	{
		for(int j=0;j<=grade.length-1;j++)
		{
			System.out.print(grade[i][j]+" ");
		}
		System.out.println();
	}
	

	}

}
