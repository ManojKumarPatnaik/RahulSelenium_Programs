import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string:");
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		int c=ch.length;
		char[] ch2=new char[c];
		int j=0;
		/*for(int i=c-1;i>=0;i--){
			//s2.concat(ch[i]);
			ch2[j]=ch[i];
			j++;
			
		}
		int flag=0;
		for(int i=0;i<ch2.length;i++){
			//System.out.print(ch2[i]);
			if(ch[i]!=ch2[i])
				flag=1;
		}
		
		
		if(flag==0)
			System.out.println("Palindrom");
		else
			System.out.println("Not a Plindrome");
		*/
		
		//Simple logic
		String t="";
		for(int i=c-1;i>=0;i--){
			//s2.concat(ch[i]);
			t=t+str.charAt(i);
			
		}
		System.out.println(t);
		if(str.equals(t)){
			System.out.println("Palindorm");
		}
		else
			System.out.println("Not a Plindrome");
		
	}

}
