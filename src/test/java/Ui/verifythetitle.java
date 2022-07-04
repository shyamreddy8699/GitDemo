package Ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class verifythetitle {
	
	@Test	
	public void titleTest()
	{
		
		String originaltitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.ebay.com/");
		
	String title=	driver.getTitle();
	
	Assert.assertEquals(originaltitle,title);
	
	driver.close();
		
		
	}

}
