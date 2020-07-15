import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Windows_AutoIT_Demo {
	//WebDriver driver;
	WebDriverWait wait;
	@Test
	public void demo() throws InterruptedException, IOException{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp au-620tx\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//Set chrome options pref to set download folder
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		//chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", path);
		ChromeOptions ch=new ChromeOptions();
		ch.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(ch);
		
		
		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.xpath("//button[@class='button']")).click();
		driver.findElement(By.id("dropzoneInput-label")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\hp au-620tx\\Desktop\\fileupload.exe");
		
		//Thread.sleep(8000);
		 wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button[class*='medium']")));

		driver.findElement(By.cssSelector("button[class*='medium']")).click();
		 wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

		driver.findElement(By.linkText("Download Now")).click();
		 wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='review-sites-popup__close']")));
		driver.findElement(By.xpath("//button[@class='review-sites-popup__close']")).click();
		Thread.sleep(4000);
		File f=new File(path+"//Converted.jpg");
		if(f.exists())
			System.out.println("File exists");
		else
			System.out.println("File not exists");
		
		
	}
}
