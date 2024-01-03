package AssignmentQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoWebReg {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[class='ico-register']")).click();
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[id='gender-male']")).click();
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='FirstName']")).sendKeys("Ajinkya");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='LastName']")).sendKeys("Palve");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='Email']")).sendKeys("ajinkyapalve7220@gmail.com");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='Password']")).sendKeys("Ajju@123");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='ConfirmPassword']")).sendKeys("Ajju@123");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='register-button']")).click();
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[class='ico-login']")).click();
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='Email']")).sendKeys("ajinkyapalve7220@gmail.com");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[name='Password']")).sendKeys("Ajju@123");
		
		Thread.sleep(800);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
	}

}
