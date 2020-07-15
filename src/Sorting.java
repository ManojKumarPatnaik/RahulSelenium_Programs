
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing");
		int a[]={10,5,2,7,1};
		int temp;
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			System.out.println();
			for(int j=i+1;j<a.length;j++){
				System.out.print(i+" "+j);
				if(a[i]>a[j]){
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
				
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
