package WebElementInterfaceMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithgetTagName {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.get("https://qspwakad/login.do");
		
		WebElement username= driver.findElement(By.name("username"));
		
		System.out.println(username.getTagName());
	}

}
