
public class MD_Array_MinMax {
	public static void main(String[] args) {
		int arr[][]={{5,10,-150},{88,4,12},{7,100,6}};
		int i,j,max=0,min=arr[0][0];
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length;j++){
				System.out.print(arr[i][j]+" ");
				if(arr[i][j]>max)
					max=arr[i][j];
				if(arr[i][j]<min)
					min=arr[i][j];
				
			}
			System.out.println();
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
