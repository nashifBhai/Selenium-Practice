package bP;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LbEasyway {
	public static void main(String[] args) throws InterruptedException {
		
		// WebdriverManager setup
		WebDriverManager.chromedriver().setup();
		
		// WebDriver object create for chrome browser
		WebDriver driver= new ChromeDriver();
		
		// visit url
		driver.get("http://sheradambd.com/home");
		
		// 1. Page title capture
		
		//System.out.println("The title is: "+driver.getTitle());
		
		// 2. Current url capture
		
		//System.out.println("The current url is: "+driver.getCurrentUrl());
		
		// 3. Capture page source code
		
		//System.out.println("The page  is: "+driver.getPageSource());
		
		// 4. Maximize the window
		//driver.manage().window().maximize();
		
		// 5. Full screen the window
		//driver.manage().window().fullscreen();
		
		// 6. Minimize the window
		//driver.manage().window().minimize();
			
		// 7. Navigate to another url
		//driver.navigate().to("https://youtube.com/");
		
		// 8. Navigate back
		//driver.navigate().back();
		
		// 9. Navigate forward
		//driver.navigate().forward();
		
		// 10. Delay for 2 second
		//Thread.sleep(2000);
		
		// 11. Refresh the page
		//driver.navigate().refresh();
		
		// 12. Open the new tab
//		driver.switchTo().newWindow(WindowType.TAB);
		
//		Thread.sleep(2000);
		
		//13. visit url in the new tab
		//driver.get("https://nexchar.com/");
		
		// 14. Close the browser
		//driver.close();
		
		
		
			
		
	}

}
