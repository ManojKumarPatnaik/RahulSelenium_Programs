
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		
		/*Logic to find individual digits
		 * 120%10=0 //last digit
		120/10=12 //remaining no
		12%10=2//2nd last digit
		12/10=1//remaining no
		1%10=1 //first digit
		1/10=0
*/		
		int d=n;
		int r;
		int rev=0;
		while(d>0){
			r=d%10;
			d=d/10;
			rev=r+rev*10;
			System.out.print(r);
			
		}
		
		System.out.println(rev);
	
	}

}
