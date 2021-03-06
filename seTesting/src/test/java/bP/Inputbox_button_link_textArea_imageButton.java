package bP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inputbox_button_link_textArea_imageButton {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		// URL visit
		driver.get("https://nexchar.com/signin");
		
		//-- Input box testing --
		
		//1. Id: Edit user name input box 1 using id locator
		
		//driver.findElement(By.id("Email")).sendKeys("hamidsaymon9@gmail.com");
		
		WebElement emailbox=driver.findElement(By.id("Email"));
		emailbox.sendKeys("abc");
		emailbox.clear();
		emailbox.sendKeys("hamidsaymon9@gmail.com");
		
		//2. Name: Edit password input box 2 using name locator
		
		driver.findElement(By.name("Password")).sendKeys("Abc12345");
		

		//-- button testing --
		
		//3. XPath: Show password button click using XPath locator
		
		driver.findElement(By.xpath("//a[@id='show-password']")).click();
		
		//4. CssSelector: Sign in button click using cssSelector
		
		driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) div.flex-fill.d-flex.flex-column.justify-content-center.py-4 div.container-tight.py-6 form.card.card-md.sm-borderless div.card-body:nth-child(1) div.form-footer:nth-child(5) > button.btn.btn-primary.w-100")).click();
		
		// navigate back
		driver.navigate().back();
		
		// -- Link Testing--
		
		//5. LinkText: Go to contact us page using LinkText locator
		driver.findElement(By.linkText("Contact")).click();
		
		Thread.sleep(3000);
	
		//6. Partial LinkText: Go to demo page using partial link text
		
		driver.findElement(By.partialLinkText("De")).click();
		Thread.sleep(2000);
		
		// Image button testing--
		
		//7. ClassName: Home page visit using classname locator
		driver.findElement(By.className("navbar-brand-image")).click();
		
		driver.get("https://www.nexchar.com/contactus");
		
		// -- Text area testing -- 
		
		// Message box
		driver.findElement(By.id("Message")).sendKeys("Abc");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
