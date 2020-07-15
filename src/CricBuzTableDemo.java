import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CricBuzTableDemo {
	
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		//WebElement table=driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		//
		int c=driver.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-right text-bold']")).size();
		
		List<WebElement> l=driver.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-right text-bold']"));
		System.out.println(c);
		int sum=0;
		for(int i=0;i<c;i++){
			sum=sum+Integer.parseInt(l.get(i).getText());
		}
		//List<WebElement> l2=driver.findElements(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[text()='Extras'] //following-sibling::div[1]"));
		WebElement l2=driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[text()='Extras'] //following-sibling::div[1]"));
		WebElement atotal=driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[text()='Total'] //following-sibling::div[1]"));
		
		/*for(int i=0;i<l2.size();i++){
			sum=sum+Integer.parseInt(l2.get(i).getText());
			
		}*/
		sum=sum+Integer.parseInt(l2.getText());
		System.out.println("Total-"+sum);
		if(sum==Integer.parseInt(atotal.getText())){
			System.out.println("Actual total matches");
		}
		else
			System.out.println("Actual total does not match");
		driver.close();
	}
}
