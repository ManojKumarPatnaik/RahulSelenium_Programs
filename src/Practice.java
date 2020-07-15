import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Practice {
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//To get links in footer by limiting scope
		WebElement e=driver.findElement(By.id("gf-BIG"));
		int c=e.findElements(By.tagName("a")).size();
		System.out.println(c);
		
		WebElement w=driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(w.findElements(By.tagName("a")).size());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement w1=driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul/li[4]/a"));
		/*w1.click();
		driver.navigate().back();*/
		//To open link in separate tab-
		w1.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(4000);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		System.out.println(handles.size());
		
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(child);
		System.out.println("Child"+driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println("Parent"+driver.getTitle());
		/*Actions a=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1950)", "");
		a.moveToElement(w1).contextClick().sendKeys(Keys.UP).click().build().perform();*/
		
		
	}
}
