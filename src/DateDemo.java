import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2};
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy");
		sdf.format(d);
		System.out.println(sdf.format(d));
		try{
			//System.out.println(5/0);
			a[5]=10;
		}
		
		catch(ArrayIndexOutOfBoundsException ie){
			System.out.println("Array Exception-"+ie.getMessage());
		}
		catch(Exception e){
			System.out.println("Exception-"+e.getMessage());
		}
		Calendar cal=Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));


	}

}
