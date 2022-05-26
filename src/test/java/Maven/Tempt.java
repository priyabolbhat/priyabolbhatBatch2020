package Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {

	public static void main(String[] args) throws InterruptedException
	
	{
	 
		System.setProperty("webdriver.chrome.driver","D:\\Automation Support\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Open application
		
		driver.navigate().to("https://www.flipkart.com/");
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		//Cancel login page
		
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").click();
		
		Actions act=new Actions(driver);
		
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		act.moveToElement(driver.findElementByXPath("//*[text()='Login']")).build().perform();
		
		driver.findElementByXPath("//*[text()='My Profile']").click();
	    
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("7358348135");
		
		driver.findElementByXPath("//*[@type='password']").sendKeys("sagarpriya");
		
		driver.findElementByXPath("(//*[text()='Login'])[3]").click();
		
		Thread.sleep(6000);
		
		driver.findElementByXPath("//*[text()='Manage Addresses']").click();
		
		driver.findElementByXPath("//*[@class='_2KpZ6l _3lI646 _3dESVI']").click();
		
		driver.findElementByXPath("(//*[@class='_1w3ZZo _2mFmU7'])[1]").sendKeys("Priya Bolbhat");
		
		driver.findElementByXPath("//*[@name='phone']").sendKeys("7358348135");
		
		driver.findElementByXPath("//*[@name='pincode']").sendKeys("414003");
		
		driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("Ahmednagar");
		
		driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Nisarga,Samarth Colony,Ahmednagar");
		
		driver.findElementByXPath("(//*[@type='button'])[2]").click();
		
		
		
		
		
		
		
	
	
		
		
		
		

	}

}
