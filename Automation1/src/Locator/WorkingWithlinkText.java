package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithlinkText {

	public static void main(String[] args)
	{
		//To launch the browser
		WebDriver driver=new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To launch the web application
		driver.get("https://demowebshop.tricentis.com/");
		
		//To fetch the location of web element
		driver.findElement(By.linkText("Register")).click();
		
	}

}
