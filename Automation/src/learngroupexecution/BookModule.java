package learngroupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_library.BaseClassForGroupExecution;

public class BookModule extends BaseClassForGroupExecution{
	@Test(groups = "SmokeTesting")
	public void ramayana() {
		Reporter.log("ramayana", true);
	}
	@Test(groups = "RegressionTesting")
	public void mahabharat() {
		Reporter.log("mahabharat", true);
	}
	@Test(groups = "RegressionTesting")
	public void shrimadbhagvadgeeta() {
		Reporter.log("shrimadbhagvadgeeta", true);
	}
}
