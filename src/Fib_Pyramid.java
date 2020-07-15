
public class Fib_Pyramid {
	public static void main(String[] args) {
		int k;
		int max=5;
		//Pyramid structure with *
		char c='*';
		for(int i=1;i<=max;i++){  
			k=i;
			while(k<max){
				System.out.print(" ");
				k++;
			}//no of rows
			for(int j=1;j<=i;j++){
				
				System.out.print(c+" ");
			}
			System.out.print("\n");
		}
		
		//Fibonacci series
		// 1 1 2 3 5 8
		int a=0,b=1;
		int z=1,i=1;
		System.out.print(a+" "+b);
		while(i<=5){
			
			z=a+b;
			a=b;
			b=z;
			i++;
			System.out.print(" "+z);
		}
	}
	
}
