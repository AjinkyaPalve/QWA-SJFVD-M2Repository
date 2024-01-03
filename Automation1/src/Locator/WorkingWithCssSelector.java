package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector
{
	public static void main(String[] args) throws InterruptedException
	{
		//To launch the browser
		WebDriver driver=new ChromeDriver();
						
		//To maximize the browser
		driver.manage().window().maximize();
						
		//To launch the web application
		driver.get("https://www.orangehrm.com/");
		
		Thread.sleep(800);
		
		//Identify username with css selector
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("admin");
		
	}

}
