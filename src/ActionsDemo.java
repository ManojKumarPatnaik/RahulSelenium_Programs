import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsDemo {
	@Test
	public void test(){
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement e=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(e);
	
		//Alert al=driver.switchTo().alert();
		
		String s=driver.findElement(By.xpath("//*[@id='draggable']/p")).getText();
		Actions a= new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		source.click();
		a.dragAndDrop(source, target).build().perform();
		int c=driver.findElements(By.tagName("iframe")).size();
		
	//Another method->	a.clickAndHold(target).moveToElement(target).release().build().perform();
		
		//Contect click-
		//a.contextClick(source).build().perform();
		a.moveToElement(source).click().build().perform();
		System.out.println(s+" "+c);
		
		driver.switchTo().defaultContent();
	
		
		//driver.close();
	}
	
	
}
