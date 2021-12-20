package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
     //Property set
		
   	System.setProperty("webdriver.chrome.driver","/Users/jakichowdhury/Downloads/chromedriver");
		
	
  //Object driver
		
      ChromeDriver driver = new ChromeDriver();
      
      //Load URL
		
      //driver.get("http://leaftaps.com/opentaps/control/main");
      driver.get("http://leaftaps.com/opentaps/control/main");
      
      
      
      //Browser maximize
      
      driver.manage().window().maximize();
		
      
      //Get Title
      
      driver.getTitle();
      
      //Title printout
      
       System.out.println(driver.getTitle());
       
       
       //implicitlyWait
      
     //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           
      //Thread.sleep(5000);
      
      //Find username
      
      driver.findElementById("username").sendKeys("DemoSalesManager"); 
     
      
      //Find password
      
      driver.findElementById("password").sendKeys("crmsfa");
      
      //Click login
      
      driver.findElementByClassName("decorativeSubmit").click();
      
      //Click CRM/SFA link
      
      driver.findElementByLinkText("CRM/SFA").click();
      
      //Click create lead link
      
      /*driver.findElementByLinkText("Create Lead").click();
      
      //Enter company name
      
      driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
      
      //Enter first name
      
      driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
      
      //Enter last name
      
      driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
      
      //Enter title
      
      driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
      
      //Enter description
      
      driver.findElementById("createLeadForm_description").sendKeys("TCS");
      
      //Enter country code
      
      driver.findElementById("createLeadForm_description").sendKeys("1");
      
      //Enter department
      
      driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
      
      //Enter employee no
      
      driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
      
      //Enter web url
      
      driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
      
      //Enter zip code
      
      driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
      
      //Enter ph no
      
      driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456");
      
      //Enter mail address
      
      driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
      
      //Click creat lead button
      
      
      //Print Title
      
     System.out.println(driver.getTitle());     
      
      Thread.sleep(5000);
      
      driver.close();
      
      WebElement src = driver.findElementById("createLeadForm_dataSourceId");
      
      Select dd = new Select(src);
      
      dd.selectByValue("LEAD_EMPLOYEE");
      
      WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
      
      Select dd1 = new Select(ind);
      
      dd1.deselectByVisibleText("E-tailer");
      
      WebElement own = driver.findElementById("createLeadForm_ownershipEnumId");

      Select dd2 = new Select(own);
      
      dd2.deselectByIndex(4);
      
      WebElement src = driver.findElementById("createLeadForm_dataSourceId");
  	
		//create object of Select class and pass the src variable into it.
		Select dd = new Select(src);
		
		
		//dd.selectByVisibleText("Employee"); //way-1
		//dd.selectByValue("LEAD_PARTNER"); //way-2
		dd.selectByIndex(11); //way-3
		
		//Select Industry
		WebElement Ind = driver.findElementById("createLeadForm_industryEnumId");
		Select  dd1 = new Select(Ind);
		dd1.selectByVisibleText("Finance");
		
		
		//Select Marketing
		WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd2 = new Select(mkt);
		dd2.selectByIndex(2); //way-3rd
		
		Thread.sleep(5000, 0);*/
      
      driver.findElementByLinkText("Create Account").click();
      
      driver.findElementById("accountName").sendKeys("Hima Mali");
      
      WebElement ind = driver.findElementByName("industryEnumId");
      Select dd3 = new Select(ind);
      dd3.selectByValue("IND_HEALTH_CARE");
      
      WebElement own = driver.findElementByName("ownershipEnumId");
      Select dd4 = new Select(own);
      dd4.selectByIndex(3);
      
      WebElement srcs = driver.findElementById("dataSourceId");
      Select dd5 = new Select(srcs);
      dd5.selectByVisibleText("Direct Mail");
      
      WebElement intl = driver.findElementById("initialTeamPartyId");
      Select dd6 = new Select(intl);
      dd6.selectByValue("DemoSalesTeam1");
      
     WebElement  mak = driver.findElementById("marketingCampaignId");   
     Select dd7 = new Select (mak);
      dd7.selectByVisibleText("Automobile");
      
      
      
      
      
      
      
		
      
      
				
				
		//driver.findElementByName("submitButton").click();	
		//driver.close();
				
				
				
				
		
				

		
		
				
	}

}
