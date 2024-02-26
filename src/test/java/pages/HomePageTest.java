package pages;

import static common.CommonAction.*;

import org.testng.annotations.Test;

import baseUtil.BaseClass;
import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class HomePageTest extends BaseClass {

	@Test(enabled = false)
	public void clickSearchFieldTest() {
		homePage.clickProductField();

	}

	@Test(enabled = false)
	public void logoField() {
		homePage.logoField();
	}
	@Test(enabled = false)
	public void clickZipCodeField() {
		homePage.clickZipCodeField();
	}
	@Test(enabled = true)
	public void inputTextInZipCodeField() {
		homePage.inputTextInZipCodeField();
	}
	
}
