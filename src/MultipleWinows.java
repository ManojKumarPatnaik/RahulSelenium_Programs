import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWinows {
	@Test
	public void test() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://the-internet.herokuapp.com/");
	
	/*driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
	driver.findElement(By.xpath("//div[@class='example']/a")).click();
	
	Set<String> h=driver.getWindowHandles();
	Iterator<String> i=h.iterator();
	System.out.println(h.size());
	String parentw=i.next();
	//String childw=i.next();
	Thread.sleep(5000);
	
	//Child window text
	driver.switchTo().window(i.next());
	System.out.println("Child Window text-"+driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	
	//Parent window text
	driver.switchTo().window(parentw);
	System.out.println("Parent window text="+driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	
	driver.close();
	*/
	
	
	driver.findElement(By.linkText("Multiple Windows")).click();
	
	driver.findElement(By.cssSelector("a[href*='windows']")).click();
	Thread.sleep(5000);
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	/*while(it.hasNext()){
        String handle1 = it.next();
        System.out.println(handle1);
      }*/


	String parentWindow=it.next();



	driver.switchTo().window(it.next());



	System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

	driver.switchTo().window(parentWindow);



	System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());





	
	}
}
