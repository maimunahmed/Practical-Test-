package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tour {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.phptravels.net");
		driver.findElement(By.id("tours-tab")).sendKeys("Tours");
		driver.findElement(By.id("select2-tours_city-container")).sendKeys("Johor Bahru,Malaysia");
		driver.findElement(By.id("date")).sendKeys("15-11-2021");
		driver.findElement(By.className("guest_tours")).sendKeys("2");
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div[3]/form/div/div/div[4]/div/button").click();
		driver.close();
		
		
		
		
		
	}

}
