package learngroupexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_library.BaseClassForGroupExecution;

public class ElectronicsModule extends BaseClassForGroupExecution{
	@Test(groups = "SmokeTesting")
	public void camera() {
		Reporter.log("camera", true);//Assert.fail();
	}
	@Test(groups = "RegressionTesting")
	public void smartPhone() {
		Reporter.log("smartPhone", true);
	}
	@Test(groups = "RegressionTesting")
	public void penDrive() {
		Reporter.log("penDrive", true);
	}
}
