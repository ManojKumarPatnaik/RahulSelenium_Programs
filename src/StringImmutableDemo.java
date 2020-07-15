import java.util.ArrayList;

public class StringImmutableDemo {
	public static void main(String args[]){
		/*String a="Veena";
		String b="Veena";
		
		String c="Ananya";
	
		System.out.println(a.concat(b)+"-"+a);//Immutable
		
		StringBuffer s1=new StringBuffer("Trupti");
		StringBuffer s2=new StringBuffer("Trupti");*/
		/*System.out.println(s1.append(s2)+"-"+s1);//Mutable
		s1.insert(0, "Vee");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		5 multiplication table without multitply
		int sum=0,n=5;
		for(int i=0;i<10;i++){
			sum=sum+n;
			System.out.println(sum);
		}
		*/
		//Max difference between 2 adjacent array indexes
		/*int arr[]={1,5,6,15,15};
		int max=0; 
		for(int i=0;i<arr.length-1;i++){
			if((arr[i+1]-arr[i])>max)
				max=arr[i+1]-arr[i];

			
		}
		System.out.println(max);*/
		
		
		//Print array of matches for 2 diff arrays
		int x[]={1,2,3,4,5};
		int y[]={1,21,31,41,5};
		ArrayList<Integer> z=new ArrayList<>();
		
		
		for(int i=0;i<x.length;i++){
			//System.out.println(y[i]-x[i]);
			if(y[i]==x[i]){
				z.add(x[i]);
			
			}
		}
		/*for(int i=0;i<z.size();i++){
			System.out.println(z.get(i));
		}*/
		Object[] o=z.toArray();
		for(int i=0;i<o.length;i++){
			System.out.println(o[i]);
		}
		
	}
}
