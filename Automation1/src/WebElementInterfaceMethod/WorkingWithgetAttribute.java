package WebElementInterfaceMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetAttribute
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://qspwakad/login.do");
		
		WebElement username= driver.findElement(By.name("username"));
		
		String nameAV= username.getAttribute("name");
		
		System.out.println(nameAV);
	}

}
