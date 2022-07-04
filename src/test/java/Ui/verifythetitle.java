package Ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


 

@Test
public class verifythetitle {
	
	public void titleTest()
	{
		
		WebDriverManager.chromedriver().setup();
		String originaltitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		
		
		WebDriver driver = new ChromeDriver();
		
		System.out.println("chandu");
		
		driver.get("https://www.ebay.com/");
		
	String title=	driver.getTitle();
	
	Assert.assertEquals(originaltitle,title);
	
	driver.close();
		

	driver.get("https://www.ebay.com/");

	driver.get("https://www.ebay.com/");
	}

}
