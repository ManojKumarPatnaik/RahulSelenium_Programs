import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RedBusCalendar {
	@Test
	public void test() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	
	driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
	while(!driver.findElement(By.xpath("//td[@class='monthTitle']")).getText().equals("Aug 2020")){
		driver.findElement(By.xpath("//td[@class='next']/button")).click();
	}
	
	String month=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	System.out.println(month);
	
	//Date selection
	
	/*List<WebElement> dd=driver.findElements(By.xpath("//td[@class='wd day']"));
	////table[@class='rb-monthTable first last']/tbody/tr/td
	for(int i=0;i<=dd.size();i++){
		if(dd.get(i).getText().contains("2")){
			dd.get(i).click();
			break;
		}
	}*/
	List<WebElement> dd=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));
	////
	for(int i=0;i<=dd.size();i++){
		if(dd.get(i).getText().contains("16")){
			dd.get(i).click();
			break;
		}
	}
	
	}
	
}
