import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp au-620tx\\Desktop\\Selenium\\SW\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://html.com/input-type-file/");
		Thread.sleep(3000);
		//WebDriverWait wait=new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'pm-cta pm-cancel-btn')]")));
		driver.findElement(By.xpath("//a[contains(@class,'pm-cta pm-cancel-btn')]")).click();
		System.out.println("Pop up closed");	
		/*WebDriverWait wait = new WebDriverWait(driver, 10 timeout in seconds);
		wait.until(ExpectedConditions.alertIsPresent());
		if(wait.until(ExpectedConditions.alertIsPresent())==null)
		    System.out.println("alert was not present");
		else
		    System.out.println("alert was present");
		*/
		/* boolean foundAlert = false;
		    WebDriverWait wait = new WebDriverWait(driver, 0 timeout in seconds);
		    try {
		        wait.until(ExpectedConditions.alertIsPresent());
		        foundAlert = true;
		    } catch (TimeoutException eTO) {
		        foundAlert = false;
		    }
		    return foundAlert;*/
		
		WebElement e=driver.findElement(By.xpath("//input[@type='file']"));
		e.sendKeys("F:\\Veena\\APIAutomation\\Documents\\jiraLinks.txt");
	}

}
