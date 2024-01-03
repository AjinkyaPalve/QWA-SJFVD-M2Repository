package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTitile
{

	public static void main(String[] args)
	{
		//to launch the browser
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
		//to open the web application
		driver.get("https://www.flipkart.com");
		
		String actualtitle=driver.getTitle();
		if(actualtitle.equals("Online shopping site for mobile,electronic,furniture"))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail");
		}
	}

}
