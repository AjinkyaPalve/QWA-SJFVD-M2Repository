package WebElementInterfaceMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.Selenium.ChromeDriver;

public class WorkingWithisEnable {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://qspwakad/login.do");
		
		WebElement username = driver.findElement(By.name("username"));
		
		if(username.isEnabled())
		{
			System.out.println("username textbox is enable");
		}
		else
		{
			System.out.println("username textbox is not enable");
		}
	}

}
