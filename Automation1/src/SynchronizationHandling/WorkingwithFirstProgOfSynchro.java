package SynchronizationHandling;

import java.util.Random;

import org.openqa.selenium.WebDriver;

import Com.Selenium.ChromeDriver;

public class WorkingwithFirstProgOfSynchro
{

	public static void main(String[] args)
	{
		Random r= new Random();
		
		int no = r.nextInt(10000);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(null)
		
	}
}
