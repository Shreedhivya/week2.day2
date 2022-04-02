package week2.day2;                                                                                     
                                                                                                        
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;                                                       
                                                                                                        
public class FaceBook {                                                                                 
                                                                                                        
	public static void main(String[] args) {                                                            
		                                                                                                
			
			WebDriverManager.chromedriver().setup(); 
			
			ChromeDriver driver = new ChromeDriver();
		
			driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			
	        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
	        
	        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("def");
	        
	        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("email");
			
		    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Testleaf");
			
			// Select source
			WebElement daySource = driver.findElement(By.xpath("//select[@id='day']"));
			
			Select day = new Select(daySource);
			
			day.selectByVisibleText("26");
			
		    WebElement monthSource = driver.findElement(By.xpath("//select[@id='month']"));
			
			Select month = new Select(monthSource);
			
			month.selectByVisibleText("Aug");
			
	       WebElement yearSource = driver.findElement(By.xpath("//select[@id='year']"));
			
			Select year = new Select(yearSource);
			
			year.selectByVisibleText("1997");
			
			driver.findElement(By.xpath("//label[text()='Female']")).click();
			

		}                                                                     
                                                                                                        
	                                                                                             
                                                                                                        
}                                                                                                   
                                                                                                        