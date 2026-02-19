package learnListeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_library.BaseClass;
import generic_library.BaseClassForListeners;

public class Fashion extends BaseClassForListeners{
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
