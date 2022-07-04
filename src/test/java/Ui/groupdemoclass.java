package Ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class groupdemoclass {
	
	
	@Test(priority = 2,groups ="regression")
	public void login()
	{
		System.out.println("oh");
	}
	
	@Test(priority = 1,groups="regression")
	public void bslogin()
	{
		System.out.println("oh");
	}
	
	@Test(priority = 3,groups="bvt")
	public void aslogin()
	{
		System.out.println("oh");
	}
	
		
		
	}


