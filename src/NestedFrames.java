import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NestedFrames {
	@Test
	public void test(){
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
		String s=driver.findElement(By.xpath("//div[@id='content']")).getText();
		
		System.out.println(s);
		driver.close();
	}
}
