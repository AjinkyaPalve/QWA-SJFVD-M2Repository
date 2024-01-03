package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocator
{
	public static void main(String[] args)
	{
		//to launch the browser
		WebDriver driver=new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To launch the web application
		driver.get("http://ajinkya/login.do");
		
		//Identify username
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//Identify password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//
		driver.findElement(By.name("remember")).click();	
		
		//
		driver.findElement(By.id("loginButton")).click();
	}
}
