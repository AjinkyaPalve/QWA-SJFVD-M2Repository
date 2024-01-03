package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigate
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		driver.navigate().to("https://www.swiggy.com/");
		
		Thread.sleep(800);
		driver.navigate().back();
		
		Thread.sleep(800);
		driver.navigate().forward();
		
		Thread.sleep(800);
		driver.navigate().refresh();
		
		driver.quit();
	}
}
