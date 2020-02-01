package co.selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Gmailtest {
	
	public static void main(String[]args) throws InterruptedException{
		System.setProperty("Webdriver.chromer.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS  );
		driver.get("https://www.facebook.com");
		WebElement ele=driver.findElement(By.xpath("//input[@id='u_0_m' and @type='text']"));
	ele.click();
	ele.sendKeys("siva");
	WebElement ele1=driver.findElement(By.xpath("//input[@id='u_0_o' and @type='text']"));
	ele1.click();
	ele1.sendKeys("krtishna");
	WebElement ele2=driver.findElement(By.xpath("//input[@id='u_0_r']"));
	ele2.click();
	ele2.sendKeys("7799032234");
	
	WebElement ele3=driver.findElement(By.id("day"));
	Select select=new Select(ele3);
	select.selectByIndex(20);
	Thread.sleep(2000);
	WebElement ele4=driver.findElement(By.xpath("//select[@id='month']/option[6]"));
	ele4.click();
	//Select select1=new Select(ele4);
	//select1.deselectByVisibleText("may");
	Thread.sleep(1000);
	
	WebElement ele5=driver.findElement(By.xpath("//select[@id='year']"));
	ele5.click();
	Select select2=new Select(ele5);
	select2.selectByValue("1992");
	Thread.sleep(1000);
	
	WebElement radio=driver.findElement(By.xpath("//input[@id='u_0_7']"));
	if( radio.isDisplayed()&& radio.isEnabled()){
		 radio.click();
	}
	else{
		Reporter.log("unable to click");
	}
	if(radio.isSelected()){
		Reporter.log("redio button select");
	}
	else{
		radio.click();
		Reporter.log("second time click");
		driver.quit();
	}
	
	
	
}

}
