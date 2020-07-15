import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Prime {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		System.out.println(n);
		int i=2;
		int flag=0;
		while(i<n/2){
			if(n%i==0)
				flag=1;
			
			i++;
		}
		if(flag==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
}
