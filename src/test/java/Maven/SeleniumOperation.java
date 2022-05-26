package Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation 

{
	  public static ChromeDriver driver=null;
	
	 public static void browserLaunch(String key , String value)
	 {
		 String strKey=key;
		 String strvalue=value;
		 
		 System.setProperty(strKey, strvalue);	
		 
			 driver=new ChromeDriver();	
			 driver.manage().window().maximize();
	 }
	
	 public static void openApplication(String url)
	 {
		 String URL=url;
		 
		 driver.get(URL);	
		 
	 }
	 
	 public static void clickOnElement(String xpath) 
	 {
		
		 String XPATH=xpath;
		 
		 
		 driver.findElementByXPath(XPATH).click();	       
		
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	 }
	 
	 
	 public static void mouseOver(String xpath)
	 {
		 String XPATH=xpath;
		 
		 Actions act=new Actions(driver);	
			WebElement a=driver.findElementByXPath(XPATH);
			act.moveToElement(a).build().perform();
			       
		 
	 }
	
	public static void sendKey(String key,String value)
	 
	 {
		 String ABCKEY=key;
		 
		 String ABCVALUE=value;
		 
		driver.findElementByXPath(ABCKEY).sendKeys(ABCVALUE);
		 	 
	 }
	
	 
	public static void main(String[] args) throws InterruptedException 
	
	{
		
		SeleniumOperation.browserLaunch("webdriver.chrome.driver", "D:\\Automation Support\\chromedriver.exe");
		
		SeleniumOperation.openApplication("https://www.flipkart.com/");
		
		SeleniumOperation.clickOnElement("//*[@class='_2KpZ6l _2doB4z']");
		
		SeleniumOperation.mouseOver("//*[text()='Login']");
		
		SeleniumOperation.clickOnElement("//*[text()='My Profile']");			

		SeleniumOperation.sendKey("//*[@class='_2IX_2- VJZDxU']","7358348135");
		
		SeleniumOperation.sendKey("//*[@type='password']","sagarpriya");
		
		SeleniumOperation.clickOnElement("(//*[text()='Login'])[3]");
		
		Thread.sleep(6000);
		
		SeleniumOperation.clickOnElement("//*[text()='Manage Addresses']");
		
		SeleniumOperation.clickOnElement("//*[@class='_1QhEVk']");
		
		SeleniumOperation.sendKey("//*[@name='name']","Priya Bolbhat");
		
		SeleniumOperation.sendKey("//*[@name='phone']","7358348135");
		
		SeleniumOperation.sendKey("//*[@name='pincode']","414003");
		
		SeleniumOperation.sendKey("//*[@name='addressLine2']","Ahmednagar");
				
		SeleniumOperation.sendKey("//*[@name='addressLine1']","Nisarga,Samarth colony,Balikashram road ,Savedi");
		
		SeleniumOperation.clickOnElement("(//*[@type='button'])[2]");
		
		
		
		
		
		
		
	
	
	}
	
	
	
	
	
}