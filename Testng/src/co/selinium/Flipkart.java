package co.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class Flipkart {
	public static void main(String[]aggs) throws InterruptedException{
		System.setProperty("Webdriver.chromer.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement ele1=driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		ele1.click();
		ele1.sendKeys("7799492234");
		WebElement ele2=driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		ele2.click();
		ele2.sendKeys("sowmya535");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Actions action=new Actions(driver);	
   WebElement eltronic=driver.findElement(By.xpath("//span[text()='Electronics']"));
   action.moveToElement(eltronic).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
		WebElement s=driver.findElement(By.xpath("//*[text()='Samsung']"));
		s.click();
		//action.sendKeys(Keys.chord(Keys.ENTER));
		if(s.isDisplayed()&&s.isEnabled()){
			Reporter.log("sucessfull");
		}else{
			Reporter.log("exceptiuon");
		}
		
	
	}

}
