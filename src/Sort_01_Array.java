
public class Sort_01_Array {

	public static void main(String[] args) {
		

		
				 int arr[] = new int[] {1,0,0,1,0,0,1}; //0,0,0,0,1,1,1
		    //  int index = isPresent(arr,20);
		    //  System.out.println("Index = " + index);
		    sortArray(arr);
			}
		  
		  
		  //implement the sorting of the array passed to the function.
		  //Sorted array should have 0's first and 1's later
		  private static void sortArray(int[] arr){
		    int temp,c=0;
		    for(int i = 0; i < arr.length; i++){
		      if(arr[i]==0){
		        c++;
		      }
		    }
		  

		  for(int i = 0; i < c; i++){
		      arr[i]=0;      
		  }
		  for(int i = c-1; i <arr.length ; i++){
		      arr[i]=1;      
		  }
		   for(int i = 0; i <arr.length ; i++){
		          System.out.print(arr[i]);
		  }
		  }   }

