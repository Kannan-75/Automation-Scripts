package Assingment1;
	
	
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Facebook1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("manoj");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("priyadarshan");	
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9344112609");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("darsHan@19");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		driver.findElement(By.xpath("//option[@value='19']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		driver.findElement(By.xpath("(//option[@value='11'])[2]")).click();
		driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		driver.findElement(By.xpath("//option[@value='2000']")).click();
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.close();
	}
	}


