package leafTapAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	
	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Kannan");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Murugan");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sriram");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("logesh");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("computerscience");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("how are yoy");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("kannankrish5502@gmail.com");
		
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDownBox=new Select(findElement);
		  dropDownBox.selectByVisibleText("New York");
		  
		  driver.findElement(By.name("submitButton")).click();
		  
		  driver.findElement(By.linkText("Edit")).click();
		  
		  WebElement findElement2 = driver.findElement(By.id("updateContactForm_description"));
		  findElement2.clear();
		  
		  driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("gffgdfhethethghrthgdjrj");
		  
		  driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		  
		  System.out.println(driver.getTitle());
		  
		  
		  driver.close();
		  
		  
		
		
		
		
		
	}

}
