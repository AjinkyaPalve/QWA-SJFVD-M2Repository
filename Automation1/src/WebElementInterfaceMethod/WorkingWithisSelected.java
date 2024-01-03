package WebElementInterfaceMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Com.Selenium.ChromeDriver;

public class WorkingWithisSelected {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://qspwakad/login.do");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@name='remeber']"));
		
		checkbox.click();
		
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
		
		
	}

}
