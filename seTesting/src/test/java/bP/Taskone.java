package bP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taskone {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		//driver.findElement(By.id("btn-make-appointment")).click();
		
		driver.findElement(By.linkText("Make Appointment")).click();
		
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		
		driver.findElement(By.id("btn-login")).click();
	}

}
