package leafTapAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
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
		 
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 
		 driver.findElement(By.name("phoneNumber")).sendKeys("9384535224");
		 
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 // System.out.println(leadId);
		 
		 Thread.sleep(5000);
		 
	     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		 
		 
		 
		 driver.findElement(By.linkText("Delete")).click();
		 
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 driver.findElement(By.name("id")).sendKeys("12508");
		 
     	 System.out.println( driver.findElement(By.xpath("//div[text()='No records to display']")).getText());
	     
//	     driver.close();
//		 
//		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}


