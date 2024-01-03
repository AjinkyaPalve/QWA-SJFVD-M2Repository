package WebDriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSetPosition
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setPosition(new Point(400,200));
		driver.get("https://www.zomato.com/india");
	}
}