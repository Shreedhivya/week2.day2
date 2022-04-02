package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup(); 
	
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='firstName']/a[3]")).sendKeys("GD");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
        driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x')]/a[1]")).getText();
		
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x')]/a[1]")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.xpath("//input[@name='companyName']")).clear();
		
		driver.findElement(By.xpath("//input[@name='companyName']")).sendKeys("GD Infotech");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		
	   driver.close();
		
	}

}
		