package Assingment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.tamilmatrimony.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement findElement = driver.findElement(By.id("REGISTERED_BY"));
	Select dropDown=new Select(findElement);
	dropDown.selectByVisibleText("Myself");
	
	driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("Manoj");
	driver.findElement(By.xpath("//input[@class='hp-gender']")).click();
	driver.findElement(By.xpath("(//select[@id='DOBDAY']/option)[3]")).click();
	driver.findElement(By.xpath("(//select[@id='DOBMONTH']/option)[6]")).click();
	driver.findElement(By.xpath("(//select[@id='DOBYEAR']/option)[8]")).click();
	driver.findElement(By.xpath("(//select[@id='RELIGION']/option)[2]")).click();
	
	WebElement findElement2 = driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']"));
	Select dropDown1=new Select(findElement2);
	dropDown1.selectByVisibleText("Tamil");
	
	driver.findElement(By.xpath("(//select[@id='COUNTRY']/option)[2]")).click();
	
	WebElement findElement3 = driver.findElement(By.xpath("//select[@id='M_COUNTRYCODE']"));
	Select dropDown2=new Select(findElement3);
	dropDown2.selectByVisibleText("+91");
	
	driver.findElement(By.id("MOBILENO")).sendKeys("9345873563");
	driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("raju5670@gmail.com");
	
	driver.close();
	
	
}
}
