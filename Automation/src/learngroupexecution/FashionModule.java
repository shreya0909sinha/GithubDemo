package learngroupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_library.BaseClassForGroupExecution;

public class FashionModule extends BaseClassForGroupExecution {
	@Test(groups = "SmokeTesting")
	public void kurta() {
		//Assert.fail();
		Reporter.log("kurta", true);
	}
	@Test(groups = "RegressionTesting")
	public void jewellery() {
		Reporter.log("jewellery", true);
	}
	@Test(groups = "RegressionTesting")
	public void jeans() {
		Reporter.log("jeans", true);
	}

}
