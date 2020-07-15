
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp au-620tx\\Desktop\\Selenium\\SW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("Veena");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='sbtc']//descendant::div//span"));
		System.out.println(list.size());
		for(WebElement e:list){
			System.out.println(e.getText());
			if(e.getText().contains("World")){
				e.click();
				break;
			}
		}
		
		driver.close();
	}

}
