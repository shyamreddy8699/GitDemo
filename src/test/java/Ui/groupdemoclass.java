package Ui;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class groupdemoclass {
	
	
	@Test(priority = 2,groups ="regression")
	public void login()
	{
		System.out.println("oh");
		
		System.out.println("shyam prasad reddy");
		System.out.println("shyam prasad reddy");
		System.out.println("shyam prasad reddy");
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


