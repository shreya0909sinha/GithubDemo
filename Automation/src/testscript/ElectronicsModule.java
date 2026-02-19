package testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElectronicsModule {
	@BeforeTest
	public void login() {
		Reporter.log("login", true);
	}
	@Test
	public void camera() {
		Reporter.log("camera", true);
	}
	@AfterClass
	public void logout() {
		Reporter.log("logout", true);
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
