package siva.automation.freamwork.objectRepostory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdata {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fip=new FileInputStream("E:\\Eclipse_Neon\\Testng\\src\\siva\\automation\\freamwork\\objectRepostory\\OR.properties");
		Properties pro=new Properties();
		String username=pro.getProperty("un_xpath");
		String next=pro.getProperty("next_xpath");
		String ped=pro.getProperty("signin_xpath");
		
		System.out.println("the username is:"+username);
		System.out.println("the username is:"+next);
		System.out.println("the username is:"+ped);

		
		System.setProperty("webdriver,chrome.driver", "E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("username")).sendKeys("sivakrishna");;
		driver.findElement(By.xpath("next")).click();
		driver.findElement(By.xpath("ped"));
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
