package com.selinium.hrm;

import java.io.IOException;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HRMscript extends MAIN {
	
/*@Test(priority=0)
public void hrm() throws IOException{
	
		Reporter.log("Step 1:- Browser Lunched Sucessfully");
	
		getdriver().get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		Reporter.log("Step 2:- URL Entered Sucessfully");
		
		String atitle = getdriver().getTitle();
		Reporter.log("Step 3:-page title: "+atitle+ "is Displayed");    
   
		Assert.assertTrue(getdriver().findElement(By.xpath("//input[@id='txtUsername']")).isDisplayed(),"username textbox is dispalyed");
		Reporter.log("Step 4:-Username text field box is displayed sucessfully");    
		  
		Assert.assertTrue(getdriver().findElement(By.xpath("//input[@name='txtPassword']")).isDisplayed(),"password textbox is dispalyed");
		Reporter.log("Step 5:-Password text field is displayed sucessfully"); 

		Assert.assertTrue(getdriver().findElement(By.xpath("//input[@value='LOGIN']")).isDisplayed(),"Login textbox is dispalyed");
		Reporter.log("Step 6:-login button is displayed sucessfully"); 
		
		getdriver().findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
		getdriver().findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
		getdriver().findElement(By.xpath("//input[@value='LOGIN']")).click();
		Reporter.log("Step 7:-Entered the user name and password then clicked on the login button sucessfully");
	    
		String welcome =getdriver().findElement(By.xpath("//a[@id='welcome']")).getText();
		Reporter.log("Step 8:-" + welcome+ "Displayed sucessfully");
		Assert.assertTrue(welcome.equals("Welcome y"));
}

  @Test(priority=0)
  public void info() throws InterruptedException{
	   Reporter.log("Step 1:- Broeser Lunched Sucessfully");
	  
	   getdriver().get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
	   Reporter.log("Step 2:- URL Lunched Sucessfully");
	   
	  
	   getdriver().findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
	   getdriver().findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
	   getdriver().findElement(By.xpath("//input[@value='LOGIN']")).click();
	   Reporter.log("Step 3:-Entered the user name and password then clicked on the login button sucessfully");
       Thread.sleep(1000);
	
       getdriver().findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
	   getdriver().findElement(By.xpath("//input[@value='Edit']")).click();
	
       Assert.assertTrue(getdriver().findElement(By.xpath("//label[text()='Full Name']")).isDisplayed(),"FullName text field is displayed");
	   Reporter.log("Step 4:- fullname text field is displayed");
	
	   Assert.assertTrue(getdriver().findElement(By.xpath("//label[text()='Other Id']")).isDisplayed(),"otherid field is displayed");
	   Reporter.log("Step 5:-other id field is displayed");

       Assert.assertTrue(getdriver().findElement(By.xpath("//label[text()='License Expiry Date']")).isDisplayed());
       Reporter.log("Step 6:-License Expiry Date field displayed");

	
       Assert.assertTrue(getdriver().findElement(By.xpath("//label[text()='Gender']")).isEnabled());
	   Reporter.log("Step 7:-Gender Radio button is Enabled");

	
	   Assert.assertTrue(getdriver().findElement(By.xpath("//label[text()='Date of Birth']")).isDisplayed());
	   Reporter.log("Step 8:-Date of Birth field is displayed");

	
	   Assert.assertTrue(getdriver().findElement(By.xpath("//label[text()='Marital Status']")).isDisplayed());
	   Reporter.log("Step 9:-Marital status field is displayed");	  
	
	   getdriver().findElement(By.xpath("//input[@title='First Name']")).clear();
	   getdriver().findElement(By.xpath("//input[@title='First Name']")).sendKeys("y");
	   getdriver().findElement(By.xpath("//input[@title='Middle Name']")).clear();
	   getdriver().findElement(By.xpath("//input[@title='Middle Name']")).sendKeys("siva");
	   getdriver().findElement(By.xpath("//input[@title='Last Name']")).clear();
	   getdriver().findElement(By.xpath("//input[@title='Last Name']")).sendKeys("krishna");
	
	   getdriver().findElement(By.xpath("//input[@id='personal_txtOtherID']")).clear();	
	   getdriver().findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys("7799032234");
	
	   getdriver().findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).clear();
	   getdriver().findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).sendKeys("2022-05-22");
	
	   getdriver().findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
	
	   getdriver().findElement(By.xpath("//select[@id='personal_cmbMarital']/option[3]")).click();
	
	   getdriver().findElement(By.xpath("//input[@id='btnSave']")).click();
	
	
}*/
	@Test(priority=1)
	public void leftsideinfo() throws InterruptedException{
		getdriver().get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		Reporter.log("Step 1:-browser lunched sucessfully");
		
		getdriver().findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("user02");
		getdriver().findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("TM1234");
		getdriver().findElement(By.xpath("//input[@value='LOGIN']")).click();
	    Thread.sleep(1000);
		
	     getdriver().findElement(By.linkText("My Info")).click();
	  
	     Assert.assertTrue(getdriver().findElement(By.linkText("Personal Details")).isDisplayed());
	     Reporter.log("Step 2:-perPersonal Details text is displayed");
		
		 Assert.assertTrue(getdriver().findElement(By.linkText("Emergency Contacts")).isDisplayed());
		 Reporter.log("Step 3:- Emergency Contacts text is displayed");
		
		 Assert.assertTrue(getdriver().findElement(By.linkText("Dependents")).isDisplayed());
		 Reporter.log("Step 4:- Dependents text is displayed");
		 
		 Assert.assertTrue( getdriver().findElement(By.linkText("Immigration")).isDisplayed());
		 Reporter.log("Step 5:- Immigration text is displayed");
		
		 Assert.assertTrue(getdriver().findElement(By.linkText("Job")).isDisplayed());
		 Reporter.log("Step 6:- job text displayed");
		 
		 Assert.assertTrue(getdriver().findElement(By.linkText("Salary")).isDisplayed());
		 Reporter.log("Step 7:- salary text is displayed");
		  
		 Assert.assertTrue(getdriver().findElement(By.linkText("Report-to")).isDisplayed());
		 Reporter.log("Step 8:- Report-to text is displayed");
		  
		 Assert.assertTrue(getdriver().findElement(By.linkText("Qualifications")).isDisplayed());
		 Reporter.log("Step 9:- Qualifications text is displayed");
		 
		 Assert.assertTrue(getdriver().findElement(By.linkText("Memberships")).isDisplayed());
		 Reporter.log("Step 10:- Memberships text is displayed");
		 
		 getdriver().findElement(By.xpath("//a[text()='Personal Details']")).click();
		 String personaldetails= getdriver().findElement(By.xpath("//div[@class='head']/h1")).getText();
		 Reporter.log("Step 11:-" + personaldetails +"Personal Details sucessfully displayed");
		 Assert.assertTrue(personaldetails.equals("Personal Details"));;
		 
		 getdriver().findElement(By.xpath("//a[text()='Contact Details']")).click();
		 String Contact= getdriver().findElement(By.xpath("//div[@class='head']/h1")).getText();
		 Reporter.log("Step 12:-" + Contact +"Contact Details sucessfully displayed");
		 Assert.assertTrue(Contact.equals("Contact Details"));
		 
		/* getdriver().findElement(By.linkText("Emergency Contacts")).click();
		 String Emergency= getdriver().findElement(By.xpath("//div[@class='head']/h1")).getText();
		 Reporter.log("Step 13:-" + Emergency +"Emergency Details sucessfully displayed");
		 Assert.assertTrue(Emergency.equals("Assigned Emergency Contacts"));*/
		 
		 getdriver().findElement(By.xpath("//a[text()='Dependents']")).click();
		 String Dependents= getdriver().findElement(By.xpath("//h1[text()='Assigned Dependents']")).getText();
		 Reporter.log("Step 14:-" + Dependents +"Dependents Details sucessfully displayed");
		 Assert.assertTrue(Dependents.equals("Assigned Dependents"));
		 
		 getdriver().findElement(By.xpath("//a[text()='Immigration']")).click();
		 String Immigration= getdriver().findElement(By.xpath("//div[@id='immidrationList']/div/h1")).getText();
		 Reporter.log("Step 15:-" + Immigration +"Immigration Details sucessfully displayed");
		 Assert.assertTrue(Immigration.equals("Assigned Immigration Records"));
		 
		 getdriver().findElement(By.linkText("Job")).click();
		 String Job= getdriver().findElement(By.xpath("//h1[text()='Job']")).getText();
		 Reporter.log("Step 16:-" + Job +"Job Details sucessfully displayed");
		 Assert.assertTrue(Job.equals("Job"));
		 
		 getdriver().findElement(By.xpath("//a[text()='Salary']")).click();
		 String Salary= getdriver().findElement(By.xpath("//h1[text()='Assigned Salary Components']")).getText();
		 Reporter.log("Step 17:-" + Salary +"Salary Details sucessfully displayed");
		 Assert.assertTrue(Salary.equals("Assigned Salary Components"));
		 
		 getdriver().findElement(By.xpath("//a[text()='Report-to']")).click();
		 String Report= getdriver().findElement(By.xpath("//h1[text()='Assigned Supervisors']")).getText();
		 Reporter.log("Step 18:-" + Report +"Report Details sucessfully displayed");
		 Assert.assertTrue(Report.equals("Assigned Supervisors"));
		 
		 getdriver().findElement(By.xpath("//a[text()='Qualifications']")).click();
		 String Qualifications= getdriver().findElement(By.xpath("//h1[text()='Work Experience']")).getText();
		 Reporter.log("Step 19:-" + Qualifications +"Qualifications Details sucessfully displayed");
		 Assert.assertTrue(Qualifications.equals("Work Experience"));
		 
		 getdriver().findElement(By.xpath("//a[text()='Memberships']")).click();
		 String Memberships= getdriver().findElement(By.xpath("//h1[text()='Assigned Memberships']")).getText();
		 Reporter.log("Step 20:-" + Memberships +" Memberships sucessfully displayed");
		 Assert.assertTrue(Memberships.equals("Assigned Memberships"));
		 
		 
		 
	}
	
	
}