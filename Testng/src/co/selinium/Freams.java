package co.selinium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Freams {
	public static void main(String[]args){
		System.setProperty("Webdriver.chromer.driver","E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.  get("https://www.jqueryui.com");
       WebElement ele=driver.findElement(By.partialLinkText("Autocomplete"));
       ele.click();
       List<WebElement> list=driver.findElements(By.tagName("iframe"));
       list.size();
     Iterator iterator=list.iterator();
     while(iterator.hasNext()){
    WebElement ele1= (WebElement) iterator.next();
    String s=     ele1.getAttribute("id");
    Reporter.log(s);
    	 
     }
}
}