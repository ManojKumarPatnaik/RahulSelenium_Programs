
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrSearch[]=new int[]{10,20,30,40,50};
	    int n=20,mid=0;
	    int last=arrSearch.length-1;
	    //get mid of the array
	    int first=0;
	    //int mid=(first+last)/2;
	     System.out.println("\n"+mid);
	     while(first<=last){
	      
	       if(n>arrSearch[mid]){
	         first=mid+1;
	       }
	       else if(n==arrSearch[mid]){
	         System.out.println("No found at index= " + mid);
	         break;
	       }
	       else{
	         last=mid-1;
	       }
	        mid=(first+last)/2;
	     }
		}
	  
	}


