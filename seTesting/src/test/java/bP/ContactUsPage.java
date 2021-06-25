package bP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUsPage {
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//WebDriver driver= new ChromeDriver();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.nexchar.com/contactus");
		
		//name box
		driver.findElement(By.id("FullName")).sendKeys("Abc");
		
		//email box
		driver.findElement(By.id("Email")).sendKeys("hamidsaymon9@gmail.com");
		
		// Message Box
		driver.findElement(By.id("Message")).sendKeys("Random");
		
		// submit button
		driver.findElement(By.className("btn btn-primary ms-auto")).click();
	}

}
