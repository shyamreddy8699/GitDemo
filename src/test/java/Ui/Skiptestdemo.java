package Ui;

import org.testng.annotations.Test;

public class Skiptestdemo {

@Test(enabled = false)
	public void test1()
	{
		System.out.println("skipping this test");
	}

}
