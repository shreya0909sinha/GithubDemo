package learnListeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic_library.BaseClass;
import generic_library.BaseClassForListeners;

public class Book extends BaseClassForListeners{
	@Test
	public void ramayana() {
		Reporter.log("ramayana", true);//Assert.fail();
	}
	@Test
	public void mahabharat() {
		Reporter.log("mahabharat", true);
	}
	@Test
	public void shrimadbhagvadgeeta() {
		Reporter.log("shrimadbhagvadgeeta", true);
	}
}
