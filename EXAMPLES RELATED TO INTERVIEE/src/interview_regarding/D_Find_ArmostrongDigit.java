package interview_regarding;
//USING WHILE LOOP
public class D_Find_ArmostrongDigit {
//DECLARE VALUE,IS EQUAL TO RESULT IS SAME VALUE,IT'S CALLED ARMSTRONG NO

	// SUPPOSE VALUE IS 371=3^3+7^3+1^3=371    373=27+343+27=397
	                     
    //SUPPOSE VALUE IS 1634=1^4+6^4+3^4+4^4=1634
	public static void main(String[] args) {
	int no=371,originalno,remainder,result=0;
	originalno=no;
 while(originalno!=0)
      {
	remainder=originalno%10;
	result+=Math.pow(remainder,3);
	originalno/=10;
	 }
if(result==no)
	System.out.println(" Is an Armstrong "+no);
else
	System.out.println("Is not an Armstrong "+no);
	}

}

//123=1^3+2^3+3^3=1+8+27=36
//
//371=3^3+7^3+3^=27+343+1=371