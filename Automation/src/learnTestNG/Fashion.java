package learnTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_library.BaseClass;

public class Fashion extends BaseClass{
	@Test
	public void kurta() {
		//Assert.fail();
		Reporter.log("kurta", true);
	}
	@Test
	public void jewellery() {
		Reporter.log("jewellery", true);
	}
	@Test
	public void jeans() {
		Reporter.log("jeans", true);
	}
}
