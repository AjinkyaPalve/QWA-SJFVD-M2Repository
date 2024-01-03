package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetCurrentUrl
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://www.amazon.com/"));
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println();
		}
	}

}
