package cucumbermap;

import Maven.SeleniumObjectref;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 

{
	@When ("^user open \"([^\"]*)\" browser with exe \"([^\"]*)\"$")
	
	 public void browserLaunch(String bname , String exe)throws Throwable 
	 {
		Object[] input=new Object[2];
        input[0]=bname;
        input[1]=exe;
        
        SeleniumObjectref.browserLaunch(input);         

	 }
	
	@When ("^user open url \"([^\"]*)\"$")
	
	public void openApplication(String url)throws Throwable 
	{
		Object[] input1=new Object[1];
        input1[0]=url;
        
        SeleniumObjectref.openApplication(input1); 	
		
		
	}
	
	@When ("^user cancel initial Login window$")
	
	public void cancelLoginW() throws Throwable 
	{
			
		Object[] input2=new Object[1];
        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
        
        SeleniumObjectref.clickOnElement(input2);
        
	}
	
	@When ("^user navigate on Login button$")
	
	public void navigateLogin()
	{
		Object[] input3=new Object[1];
        input3[0]="//*[text()='Login']";
        
        SeleniumObjectref.mouseOver(input3);
		
	}
	
	@When ("^user clicked on My Profile$")
	
	public void myProfile() throws Throwable
	{
		
		Object[] input4=new Object[1];
        input4[0]="//*[text()='My Profile']";
        
        SeleniumObjectref.clickOnElement(input4);
        
	}
	
	@When ("^user enter \"([^\"]*)\" as username$")
	
	public void userName(String value12)
	{
		Object[] input5=new Object[1];
        input5[0]=value12;
         
       		 
        SeleniumObjectref.sendkey(input5);
		
	}
	
	@When ("^user enter \"([^\"]*)\" as password$")
	
	public void password (String value12)
	{
		Object[] input6=new Object[1];
        input6[0]=value12;	
         
		        		 
       SeleniumObjectref.sendkey(input6);
	
	}
	
	@When ("^user click on Login button$")
	
	public void login () throws Throwable
	
	{
		Object[] input7=new Object[1];
        input7[0]="(//*[@type='submit'])[2]";
	 		         
	        SeleniumObjectref.clickOnElement(input7);
		
	}
	
	@Then ("^application shows user profile to user$")
	
	public void userProfile() throws InterruptedException
	
	{
		Thread.sleep(5000);
		Object[] input8=new Object[2];
        input8[0]="//*[@class='_1ruvv2']";
        input8[1]="Priya Bolbhat";	         
	        SeleniumObjectref.clickOnElement(input8);
			
	}
	
	
	
	
}

