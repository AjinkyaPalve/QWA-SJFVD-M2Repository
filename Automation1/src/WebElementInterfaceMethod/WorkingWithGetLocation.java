package WebElementInterfaceMethod;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.Selenium.ChromeDriver;

public class WorkingWithGetLocation
{

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://qspwakad/login.do");
		
		WebElement username=driver.findElement(By.name("username"));

		Point location=username.getLocation();
		
		System.out.println(location);
	}

}
