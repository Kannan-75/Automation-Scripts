package leafTapAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		

		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 
		   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 driver.findElement(By.linkText("Leads")).click();
		 
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 
		 driver.findElement(By.name("emailAddress")).sendKeys("kannankrish5502@gmail.com");
		 
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		 
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		 
		 
		 
		 
		 //driver.close();
		 

	}
}
