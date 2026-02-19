package learnListeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic_library.BaseClass;
import generic_library.BaseClassForListeners;
@Listeners(generic_library.ListenerImplementation.class)
public class ElectronicsModule extends BaseClassForListeners {
	@Test(groups = "SmokeTesting")
	public void camera() {
		Assert.fail();
		Reporter.log("camera", true);
	}
	@Test(groups = "RegressionTesting")
	public void smartPhone() {
		Reporter.log("smartPhone", true);
	}
	@Test(groups = "RegressionTesting" , dependsOnMethods = "camera")
	public void penDrive() {
		Reporter.log("penDrive", true);
	}

}
