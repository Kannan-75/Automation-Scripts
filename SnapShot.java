package week8day1selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SnapShot {
	public static void main(String[] args) throws IOException {
		
ChromeOptions options=new ChromeOptions();
		
		options.addArguments("start-maximized");
		
         ChromeDriver driver=new ChromeDriver(options);
		 
		 driver.get("https://www.amazon.in/");
		 
		 
		 File screenshotAs=driver.getScreenshotAs(OutputType.FILE);
		 File shot=new File("./Snap/005.jpeg");
		 FileUtils.copyFile(screenshotAs, shot);
		 
		 WebElement findElement = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));	
		 File screenAs=findElement.getScreenshotAs(OutputType.FILE);
		 File shot1=new File("./SnapShot/005.jpeg");
		 FileUtils.copyFile(shot1, screenAs);
		 
	
	
	
	
	}

}
