import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutosuggestiveDropD {
	
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("Bang");
		Boolean a=true;
		//while(a){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			
			String s="";
			while(!s.contains("BANGALORE INTERNATION AIRPORT")){
				driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
				JavascriptExecutor js=(JavascriptExecutor) driver;
				String script="return document.getElementById(\"fromPlaceName\").value;";
				s=(String) js.executeScript(script);
				
			}
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
			//driver.findElement(By.id("toPlaceName")).click();
			//driver.switchTo().alert().accept();
			driver.findElement(By.id("toPlaceName")).sendKeys("ana");
			//driver.findElement(By.id("toPlaceName")).sendKeys(Keys.DOWN);
			driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
	}
}
