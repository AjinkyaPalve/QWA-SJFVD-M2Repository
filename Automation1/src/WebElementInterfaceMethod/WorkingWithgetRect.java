package WebElementInterfaceMethod;

import java.awt.Rectangle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.Selenium.ChromeDriver;

public class WorkingWithgetRect
{

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://qspwakad/login.do");
		
		WebElement username = driver.findElement(By.name("username"));
		
		Rectangle rect = username.getRect();

		int height rect.getHeight();

		int with rect.getwidth();

		int xrect.getX();

		intyrect.gety();

		System.out.println(height);

		System.out.println(width);

		System.out.println(x);

		System.out.println(y);
		
	}

}
