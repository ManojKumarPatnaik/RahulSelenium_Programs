import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp au-620tx\\Desktop\\Selenium\\SW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://learn-automation.com/");
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		System.out.println("pagel loaded");
		
		String s="Veena";
		
		s.length();
		String array1[]={"Veena"};
			int l=array1.length;
		
		
	}

}
