package bP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LB {

	// main method
	public static void main(String[] args) {
		
		//Geckodriver Web driver system property creating
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\SwjQAmon\\seTesting\\drivers\\geckodriver\\geckodriver.exe");
//		// Web Driver object creation
//		WebDriver driver= new FirefoxDriver();
//		//visit url
//		driver.get("https://mvnrepository.com/");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Work\\New folder\\SwjQAmon\\seTesting\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mvnrepository.com/");
	}
}
