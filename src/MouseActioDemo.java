import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseActioDemo {
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Actions a=new Actions(driver);
		//WebElement w=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//a.moveToElement(w).build().perform();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("mask").build().perform();
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.SHIFT,"veena");
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/input")).click();
		//a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a[1]/span"))).click().build().perform();
		//driver.close();
		driver.findElement(By.xpath("//*[text()='Today's Deals']")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	}
}
