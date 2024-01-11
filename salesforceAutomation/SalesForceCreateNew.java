package salesforceAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceCreateNew {
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
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		Thread.sleep(3000);
		
		
		String name="Salesforce Automation by Kannan";
	
		
		
		WebElement findElement1= driver.findElement(By.xpath("//input[@name='Name']"));
		findElement1.sendKeys("Salesforce Automation by Kannan");
		findElement1.getText();
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='29']")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input')][1]")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		Thread.sleep(3000);
		
		String title=driver.getTitle();
		if(title==name) {
			System.out.println("The Title is verified");
		}
		else {
			System.out.println("The Title is not verified");
		}
		
		driver.close();
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			

}

}
