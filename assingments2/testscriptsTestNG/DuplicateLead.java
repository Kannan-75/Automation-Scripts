package testscriptsTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class DuplicateLead extends Base{
	@Test

	public void runDuplicateLead() throws InterruptedException {
		
				
         driver.findElement(By.linkText("Find Leads")).click();
		 
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 
		 driver.findElement(By.name("emailAddress")).sendKeys("kannankrish5502@gmail.com");
		 
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.name("submitButton")).click();
		
}
}






