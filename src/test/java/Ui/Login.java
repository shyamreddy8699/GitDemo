package Ui;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeTest
	public void loginsucess()
	{
		System.out.println("logged in");
	}
	//beforemethod and //aftermethod helps to excuete be a method and after method
	@AfterTest
	public void logoutsucess()
	{
		System.out.println("logged out");
	}
	
	@Test(priority = 2)
	public void login()
	{
		System.out.println("oh");
	}
	@Test(priority = 1)
	public void bslogin()
	{
		System.out.println("oh");
	}
	
	

}
