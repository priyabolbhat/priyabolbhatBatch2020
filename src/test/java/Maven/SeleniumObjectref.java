package Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumObjectref 

{
	 private static final SeleniumObjectref SeleniumObjref = null;
	public static ChromeDriver driver=null;
		
	 public static void browserLaunch(Object[]inputParameters)
	 
	 {
		 String strKey= (String)inputParameters[0];
		 String strvalue=(String)inputParameters[1];
		 
		 System.setProperty(strKey, strvalue);	
		 
			 driver=new ChromeDriver();	
			 driver.manage().window().maximize();
	 }
	 
	 
	 public static void openApplication(Object[]inputParameters)
		 
	 {
		 String URL=(String) inputParameters[0];
		 
		 driver.get(URL);	
		 
	 }
	 
	 public static void clickOnElement(Object[]inputParameters) throws InterruptedException 
	 
	 {
		
		 String XPATH=(String)inputParameters[0];
		 
		 
		 driver.findElementByXPath(XPATH).click();	       
		
		 Thread.sleep(5000);
	 }
	 
	 public static void mouseOver(Object[]inputParameters)
	 
	 {
		 String XPATH=(String) inputParameters[0];
		 
		 Actions act=new Actions(driver);	
			WebElement a=driver.findElementByXPath(XPATH);
			act.moveToElement(a).build().perform();
			
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);      
		 
	 }
	
	 public static void sendkey(Object[]inputParameters)
	 
	 {
		 String ABCKEY=(String) inputParameters[0];  
		 String ABCVALUE=(String) inputParameters[1]; 
		 
		 driver.findElementByXPath(ABCKEY).sendKeys(ABCVALUE);
		 
	 }
	
	public static void main (String[]args) throws InterruptedException
	
	{
		//BrowserLaunch
		Object[] input=new Object[2];
		         input[0]="webdriver.chrome.driver";
		         input[1]="D:\\Automation Support\\chromedriver.exe";
		         
		         SeleniumObjectref.browserLaunch(input);         
		
		//OpenApplication
		         
		Object[] input1=new Object[1];
		         input1[0]="https://www.flipkart.com/";
		         
		         SeleniumObjectref.openApplication(input1);    
		
		// Click on element-Login button
		         
		Object[] input2=new Object[1];
		         input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		         
		         SeleniumObjectref.clickOnElement(input2);
		         
		//Mouse over         
		        		
		Object[] input3=new Object[1];
		         input3[0]="//*[text()='Login']";
		         
		         SeleniumObjectref.mouseOver(input3);
		         
		//click on my profile
		         
		Object[] input4=new Object[1];
		         input4[0]="//*[text()='My Profile']";
		         
		         SeleniumObjectref.clickOnElement(input4);
		         
		//Sendkeys
		         
		 Object[] input5=new Object[2];
		         input5[0]=	"//*[@class='_2IX_2- VJZDxU']";
		         input5[1]=	"7358348135";	 
		        		 
		         SeleniumObjectref.sendkey(input5);        
		         
		         
		         
		 Object[] input6=new Object[2];
		          input6[0]="//*[@type='password']";	
		          input6[1]="sagarpriya";	 
				        		 
		         SeleniumObjectref.sendkey(input6);        
		         
		       
	     //click on Login
		         
		Object[] input7=new Object[1];
	         input7[0]="(//*[text()='Login'])[3]";
		 		         
		        SeleniumObjectref.clickOnElement(input7);
		        
        //Manage Address
		        
		  Thread.sleep(6000);       
		  
		Object[] input8=new Object[1];
			     input8[0]="//*[text()='Manage Addresses']";
				 		         
			   SeleniumObjectref.clickOnElement(input8);   
			   
		//Click on new address	   
		        
  	   Object[] input9=new Object[1];
			     input9[0]="//*[@class='_1QhEVk']";
				 		         
			   SeleniumObjectref.clickOnElement(input9);
			   
		//Sendkeys
			   
	   Object[] input10=new Object[2];
		        input10[0]="//*[@name='name']";	
		        input10[1]="Priya Bolbhat";	 
				        		 
		         SeleniumObjectref.sendkey(input10);	   
			   
	   Object[] input11=new Object[2];
			    input11[0]="//*[@name='phone']";	
		        input11[1]="7358348135";	 
					        		 
			      SeleniumObjectref.sendkey(input11);			   
			   
       Object[] input12=new Object[2];
                input12[0]="//*[@name='pincode']";	
		        input12[1]="414003";	 
						        		 
		         SeleniumObjectref.sendkey(input12);	
				        
	   Object[] input13=new Object[2];
			    input13[0]="//*[@name='addressLine2']";	
    	        input13[1]="Ahmednagar";	 
							        		 
		        SeleniumObjectref.sendkey(input13);		         
			   
	   Object[] input14=new Object[2];
			    input14[0]="//*[@name='addressLine1']";	
    	        input14[1]="Nisarga,Samarth colony,Balikashram road,Bhutkarwadi ,Savedi";	 
							        		 
		        SeleniumObjectref.sendkey(input14);		   			   
	 
            
	  //Address Save
		        
	   Object[] input15=new Object[1];
			    input15[0]="(//*[@type='button'])[2]";	
    	       							        		 
		        SeleniumObjectref.clickOnElement(input15);
	            
	    }
	
	
}
