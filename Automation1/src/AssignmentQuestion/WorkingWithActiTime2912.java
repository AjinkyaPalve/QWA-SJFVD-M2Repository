package AssignmentQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithActiTime2912
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=3fah6vkhjs88");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.name("remember")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("Tasks")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("customerId")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("customerName")).sendKeys("ajinkya");
		Thread.sleep(2000);
		
		driver.findElement(By.name("projectName")).sendKeys("login");
		Thread.sleep(2000);
		
		driver.findElement(By.name("task[0].name")).sendKeys("do login in the page");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

}
