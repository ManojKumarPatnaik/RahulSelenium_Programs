import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Spinner {
	@Test
	public void test(){
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//div[@id='content']/a[2]")).click();
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
		String str=driver.findElement(By.id("results")).getText();
		String s="Process completed! This response has been loaded via the Ajax request directly from the web server, without reoading this page.";
		System.out.println("Expected"+str);
				
		Assert.assertEquals(str.trim(), s.trim());
		
	}
}
