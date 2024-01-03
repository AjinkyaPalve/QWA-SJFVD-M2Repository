package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithManage
{

	public static void main(String[] args)
	{
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		//option opt=driver.manage();
		//window win=opt.window();
		//win maximize();
		
		driver.manage().window().maximize();
		
		//to open the web application
		driver.get("https://www.flipkart.com");
		
	}
}
