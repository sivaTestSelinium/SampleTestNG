package com.Automation.Supporters;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReadTest {


	private static WebElement Electronics;

	public static void main(String[]args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse_Neon\\Testng\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("7799492234");	
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("sowmya535");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		driver.findElement(By.xpath("//*[@text()='Electronics']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(Electronics).build().perform();
		String eletext=Electronics.getText();
		File file=new File("E:\\Eclipse_Neon\\Testng\\src\\com\\Automation\\Supporters\\test.txt");
		boolean b=file.createNewFile();
		if(b){
			System.out.println("created");
		}
		else{
			System.out.println("exit");
		}
		FileWriter fw=new FileWriter(file);	
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(eletext);
        bw.flush();
	}
}
