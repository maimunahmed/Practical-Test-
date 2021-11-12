package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectAutomation {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.phptravels.net");

	}

}
