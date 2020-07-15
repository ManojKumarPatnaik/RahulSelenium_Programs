import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {

	@Test
	public void soft(){
		
			SoftAssert softAssert = new SoftAssert();
			System.out.println("*** soft test case execution started***");
			softAssert.assertEquals("Hello", "Hello", "First soft assert failed");
			System.out.println("Soft assert success....");
			softAssert.assertTrue("Hello".equals("hello"), "Second soft assert failed");
			System.out.println("Soft assert failure....");
			softAssert.assertTrue("Welcome".equals("welcomeeee"), "Third soft assert failed");
			System.out.println("Soft assert failure....");
			System.out.println("*** test case one executed successfully ***");
			softAssert.assertAll();
		
	}
	@Test
	public void hard(){
		
			System.out.println("*** Hard Asset case  started ***");
			Assert.assertEquals("Hello", "Hello", "First hard assert failed");
			System.out.println("hard assert success....");
			Assert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
			System.out.println("hard assert failure....");
			Assert.assertTrue("Welcome".equals("welcomeeee"), "Third hard assert failed");
			System.out.println("*** test case Hard case executed successfully ***");
			
		
	}

}
