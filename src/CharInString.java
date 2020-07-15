import java.util.Scanner;

public class CharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string:");
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		//System.out.println("Enter character to be searched:");
		char c='a';
		int counter=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c)
				counter++;
		}
		
		System.out.println("Counter -"+counter);
		
	}

}
