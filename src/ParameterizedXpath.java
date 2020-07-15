import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ParameterizedXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp au-620tx\\Desktop\\Selenium\\SW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String user_name="Admin";
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement e=driver.findElement(By.xpath("//a[@id='welcome'][text()='Welcome "+user_name+"']"));
		System.out.println(e.getText());
		
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='menu__Performance']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[text()='Manage Reviews']"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id='menu_performance_searchPerformancReview']"))).click().build().perform();
		//driver.close();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("performanceReview360SearchForm_employeeName")).sendKeys(user_name);
		
		
	}

}
