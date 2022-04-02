package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup(); 
	
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
        driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("abc1@gmail.com.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
        Thread.sleep(3000);
		
	    String text = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x')]/a[1]")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x')]/a[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
			
		driver.close();
		
	}


}
