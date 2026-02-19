package learnTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {//Test class
	@Test
public void demoA()
{
		Assert.fail();
	Reporter.log("hello world", true);
}
	@Test
public void demoB()
{
	Reporter.log("hi world");
}
	@Test
public void demoC()
{
System.out.println("hello world");
}

}
