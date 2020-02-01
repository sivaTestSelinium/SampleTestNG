package co.selinium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing {
	public static void main(String[]args){
		System.setProperty("Webdriver.chromer.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.  get("https://www.bing.com");
		
		System.out.println("the fist window:"+driver.getWindowHandle());
	
	WebElement ele=driver.findElement(By.partialLinkText("Videos"));
	ele.click();
	System.out.println("the second window:"+driver.getWindowHandle());
	Set<String>window=driver.getWindowHandles();
	Iterator<String> iterator=window.iterator();
	boolean first=iterator.hasNext();
	  String win=iterator.next();
	driver.switchTo().window(win);
	driver.quit();
		
		
	}

}
