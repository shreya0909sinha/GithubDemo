package learnTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_library.BaseClass;

public class ElectronicsModule extends BaseClass {
	@Test
	public void camera() {
		Reporter.log("camera", true);//Assert.fail();
	}
	@Test
	public void smartPhone() {
		Reporter.log("smartPhone", true);
	}
	@Test
	public void penDrive() {
		Reporter.log("penDrive", true);
	}

}
