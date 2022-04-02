package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Shree");
		driver.findElement(By.id("lastNameField")).sendKeys("Dhivya");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("G");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("D");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Hello Create Contact !");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("@gmail.com");
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select obj=new Select(findElement);
		obj.selectByValue("NY");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is important text");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
	}
}
