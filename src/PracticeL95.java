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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class PracticeL95 {
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ch=driver.findElement(By.id("checkBoxOption1"));
		ch.click();
		String ch_t=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println(ch_t);
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(ch_t);
		
		driver.findElement(By.id("name")).sendKeys(ch_t);
		driver.findElement(By.id("alertbtn")).click();
		
		String act=driver.switchTo().alert().getText();
		if(act.contains(ch_t))
			System.out.println("Text in alert matching");
		driver.switchTo().alert().accept();
		
		
		
		
		
	}
}
