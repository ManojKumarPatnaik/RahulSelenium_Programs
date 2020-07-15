

public class Swap {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int temp;
		temp=a;a=b;b=temp;
		
		System.out.println(a+"-"+b);
		
		a=a+b;
		b=a-b;//10
		a=a-b;//20
		System.out.println(a+"-"+b);
	}
}
