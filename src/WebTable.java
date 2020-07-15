import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:/Users/hp au-620tx/Desktop/geckodriver-v0.19.1-win64/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td/following-sibling::td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td/following-sibling::td[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Demo Site')]")).getAttribute("title"));
		
		
		driver.close();
	}

}
