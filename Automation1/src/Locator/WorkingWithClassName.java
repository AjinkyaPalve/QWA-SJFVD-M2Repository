package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassName
{
	public static void main(String[] args)
	{
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To launch the web application
		driver.get("https://www.google.com/");
		
		//active element
		driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);
		
		//identifier the guitar
		driver.findElement(By.className("lNPNe")).click();
	}
}
