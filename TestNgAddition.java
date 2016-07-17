package com.varaprasad;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAddition extends Addition {
	Addition a = new Addition();
	@Test()
	public void TestingAdditionClass(){
		a.add(10, 20);
		Assert.assertEquals(30, 30, "method is running correct");
		
	}
	@Test()
	public void TestingMultiplicationClass(){
		a.mul(2, 3);
		 Assert.assertEquals(6, 6, "faile");
		 Assert.assertNotNull(a, "this is passed");
	
	}
}
