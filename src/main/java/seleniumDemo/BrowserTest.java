package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","/Users/jakichowdhury/Downloads/chromedriver");
		
		//ChromeDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		
		
		
		// load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		// Enter Username - (Element level)
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	      
	      Select dd = new Select(src);
	      
	      dd.deselectByValue("LEAD_EXISTCUST");
	      
	      WebElement ind = driver.findElementById("import org.openqa.selenium.chrome.ChromeDriver");
	      
	      Select dd1 = new Select(ind);
	      
	      dd1.deselectByVisibleText("E-tailer");
	      
	      WebElement own = driver.findElementById("createLeadForm_ownershipEnumId");

	      Select dd2 = new Select(own);
	      
	      dd2.deselectByIndex(4);

	}

}
