package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSetSize
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		Dimension di=new Dimension(100,200);
		driver.manage().window().setSize(di);
		driver.get("https://www.zomato.com/india");
	}
}