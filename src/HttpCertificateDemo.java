import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;

import bsh.Capabilities;

public class HttpCertificateDemo {
	public static void main(String args[]) throws InterruptedException, IOException{
		//Step1 - Set DesiredCapabilities object
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Step2 - Set ChromeOptions class
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		co.merge(dc);
		
		//Step3-Pass CO object to driver		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp au-620tx\\Desktop\\Selenium\\SW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Taking Screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Next step is to copy file to local file
		FileUtils.copyFile(src,new File("F:\\SeleniumScreenshot\\demo1.png"));
		System.out.println("Test Case Passed");
		
		
		
		
		
	}
}
