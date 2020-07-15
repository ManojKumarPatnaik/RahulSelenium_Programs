import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueNoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,1,6,6,6,7,1,0,0};
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		ArrayList<Integer> x=new ArrayList<Integer>();
		ArrayList<Integer> y=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			if(!x.contains(arr[i]))
				x.add(arr[i]);
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					if(!y.contains(arr[i]))
					System.out.println(y.add(arr[i]));
					
				}
			}
		}
		System.out.println();
		System.out.print("Uniquie -");
		for(int i=0;i<x.size();i++)
			System.out.print(x.get(i)+" ");
		System.out.print("Duplicaes -");
		for(int i=0;i<y.size();i++)
			System.out.print(y.get(i)+" ");
		
		
		
		
		
	}

}
