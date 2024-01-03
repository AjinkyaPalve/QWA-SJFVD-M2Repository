package AssignmentQuestion;

import org.openqa.selenium.WebDriver;

import Com.Selenium.ChromeDriver;

public class WorkingWithDemoApps2912
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");			
	}

}
