package pages;

import org.testng.annotations.Test;
import baseUtil.BaseClass;

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
	@Test(enabled = false)
	public void inputTextInZipCodeField() {
		homePage.inputTextInZipCodeField();
	}
	@Test(enabled = false)
	public void use_of_isDisplayed_in_zipcode_field_01() {
		homePage.use_of_isDisplayed_in_zipcode_field_01();
	}
	@Test(enabled = false)
	public void use_of_isDisplayed_in_zipcode_field_02_test() {
		homePage.use_of_isDisplayed_in_zipcode_field_02();
	}
	@Test(enabled = false)
	public void use_of_isEnabled_in_zipcode_field() {
		homePage.use_of_isEnabled_in_zipcode_field();
	}
	@Test(enabled = true)
	public void use_of_isSelected_in_zipcode_field() {
		homePage.use_of_isSelected_in_zipcode_field();
	}
	
}
