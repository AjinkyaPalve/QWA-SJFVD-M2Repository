package AssignmentQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoWebLog {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='Email']")).sendKeys("ajinkyapalve7220@gmail.com");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='Password']")).sendKeys("Ajju@123");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
	}

}
