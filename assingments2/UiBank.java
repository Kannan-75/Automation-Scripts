package assingments2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UiBank {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("raju7502@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("kannan@767");
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("ManojMaddy");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Maddy");
		
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("S");
		
		driver.findElement(By.xpath("(//select[@id='title']/option)[4]")).click();
		
		driver.findElement(By.xpath("(//select[@id='sex']/option)[2]")).click();
		
		WebElement findElement = driver.findElement(By.xpath("(//select[@id='employmentStatus'])"));
		Select dropdown=new Select(findElement);
		dropdown.selectByVisibleText(" Full-time");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Maddy");
		
		driver.close();
		
		
		
	}

}
