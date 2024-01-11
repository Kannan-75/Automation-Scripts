package salesforceAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceEdit {

	  public static void main(String[] args) throws InterruptedException {
		   
		    ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications","start-maximized");
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			driver.get("https://qeagle-dev-ed.my.salesforce.com/");
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testleaf@1234");
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			driver.findElement(By.xpath("//button[text()='View All']")).click();
			
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
			
			WebElement findElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()",findElement);
			
			driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Salesforce Automation by Kannan");
			
			driver.findElement(By.xpath("//a[@title='Salesforce Automation by Kannan']")).click();
			Thread.sleep(3000);
			
			WebElement findElement2 = driver.findElement(By.xpath("//button[@type='button']//span[text()='Show more actions']"));
			JavascriptExecutor js1= (JavascriptExecutor) driver;
			js1.executeScript("arguments[0].click()",findElement2);
			
			
			driver.findElement(By.xpath("//div[@class='slds-dropdown__item']//span[text()='Edit']")).click();
			driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
			driver.findElement(By.xpath("//span[text()='31']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input')][1]")).click();
			driver.findElement(By.xpath("//span[@class='slds-media__body']//span[@title='Perception Analysis']")).click();
			
			
			
			
			driver.close();
	  
	  
	  
	  
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																						

			
			
}
}

