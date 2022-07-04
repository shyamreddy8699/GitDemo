package Ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class softassetandhardassert {
	
	@Test	
	public void titleTest()
	{
		
		SoftAssert soft = new SoftAssert();
		
		//with softassert to continue even when assertion failed and user softassert.assertall() to report error;
		String exceptedtext = "search";
		String originaltitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
	String title=	driver.getTitle();
	String acutual = driver.findElement(By.xpath("//*[@id=\'gh-btn\']")).getAttribute("value");
	Assert.assertEquals(originaltitle,title);
	Assert.assertEquals(acutual, exceptedtext,"oh no bro");
	
	
	
	driver.close();
	
		
		
	}

}
