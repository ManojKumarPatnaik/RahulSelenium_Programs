import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GreenMart {
	@SuppressWarnings("deprecation")
	@Test
	public void test() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");

		List<String> veg=new ArrayList<String>();
		veg.add("Cucumber");veg.add("Carrot");veg.add("Beans");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//Thread.sleep(3000);
		//WebDriverWait w1=new WebDriverWait(driver, 5);
		//w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='product']/h4")));
		
		List<WebElement> l=driver.findElements(By.xpath("//div[@class='product']/h4"));
		int s=l.size();
		///html/body/div/div/div[1]/div/div[3]/h4
		
		int cntr=0;
		for(int i=0;i<s;i++){
			if(cntr==s)
				break;
			
			for(int j=0;j<veg.size();j++){
				String str=l.get(i).getText();
				Thread.sleep(100);
				if(str.contains(veg.get(j))){
					//driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					if(str.contains("Cucumber")){
						driver.findElements(By.xpath("//div[@class='stepper-input']/a[2]")).get(i).click();
						
					}
					WebElement w=driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i);
					w.click();
					cntr=cntr+1;
				}	
					
			}
				////*[@id="root"]/div/div[1]/div/div[3]/div[2]/a[2]
		}
		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		driver.findElement(By.xpath("//div[@class='cart-preview active']/div[2]/button")).click();
		
		driver.findElement(By.xpath("//div[@class='promoWrapper']//input")).sendKeys("test");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
				
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		String promo=driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		Assert.assertEquals("Invalid code ..!",promo);
		
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		
		Select dd=new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")));
		dd.selectByValue("India");
		
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		
		
		
				
		//driver.close();
	}
}