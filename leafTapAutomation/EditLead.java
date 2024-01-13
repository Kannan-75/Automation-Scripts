package leafTapAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws Exception {
		
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
		 
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("kannan");
		
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.linkText("Kannan")).click();
		 
		 System.out.println(driver.getTitle());
		 
		 driver.findElement(By.linkText("Edit")).click();
		 
		 WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
		 findElement.clear();
		 
		 findElement.sendKeys("Mahi");
		 
		 driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		 
		 driver.findElement(By.xpath("//span[text()='Mahi (10804)']")).getText();
		 
		 driver.close();
		 
		 
		 
		 
		 

		 
		 
		 
		 

	}

}

