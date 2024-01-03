package AssignmentQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithInstagram
{
	public static void main(String[] args) throws InterruptedException
	{
		//To launch the browser
		WebDriver driver=new ChromeDriver();
		
		//To maximize the browser
		driver.manage().window().maximize();
		
		//To launch the web application
		driver.get("https://www.instagram.com/");
		
		//Identify username
		Thread.sleep(800);
		driver.findElement(By.name("username")).sendKeys("ajinkyapalve7220@gmail.com");
		
		//Identify password
		Thread.sleep(800);
		driver.findElement(By.name("password")).sendKeys("ajinkya@9090");
		
		driver.findElement(By.className("_acap")).click();
		
		String instaT = driver.getTitle();
		System.out.println(instaT);
		 
		//driver.quit();
	}
}
