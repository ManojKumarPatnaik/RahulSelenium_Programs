import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Assignment_109 {
	
	public static void main(String args[]) throws InterruptedException{
		//System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
		//S
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp au-620tx\\Desktop\\Selenium\\SW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		String ex="United Kingdom (UK)";
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String act="";
		
		driver.findElement(By.id("autocomplete")).sendKeys("Uni");
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		while(!act.equalsIgnoreCase(ex)){
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			String script="return document.getElementById(\"autocomplete\").value;";
			act=(String) js.executeScript(script);
		}
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		
	}
}
