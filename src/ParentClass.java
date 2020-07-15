import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParentClass {
	int a;
	protected ParentClass(){
		a=10;
	}
	 
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		WebElement e=driver.findElement(By.name("name"));
		//e.sendKeys("Veena");
		/*
		driver.findElement(By.linkText("Shop")).click();
		driver.findElement(By.linkText("Home")).click();
		WebElement e1=driver.findElement(By.name("name"));*/
		
		//e.sendKeys(Keys.SHIFT,"veena");
		//To send key without usin senkeys
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value=arguments[1];", e,"VeenaRagaji");
		Thread.sleep(5000);
		System.out.println(e.getAttribute("value"));
		
		driver.get("https://intellipaat.com/blog/interview-question/selenium-interview-questions/");
		//driver.close();
	}
		
}
