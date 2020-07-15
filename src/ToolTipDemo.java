import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp au-620tx\\Desktop\\Selenium\\SW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
				
				driver.get("https://demoqa.com/tool-tips");
				driver.manage().timeouts().implicitlyWait(65, TimeUnit.SECONDS);
				
				WebElement e=driver.findElement(By.id("toolTipButton"));
				
				Actions a=new Actions(driver);
				a.moveToElement(driver.findElement(By.id("toolTipButton"))).perform();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				System.out.println("After 30 seconds");
				String s=driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
				System.out.println("After 30 seconds");
				System.out.println(s);
			
	}

}
