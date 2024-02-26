package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonAction.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='zipCode'and @id='quote-main-zip-code-input']")
	WebElement zipCodeField;

	@FindBy(xpath = "//select[@id='popDropdown']")
	WebElement ProductField;

	@FindBy(xpath = "//img[@id='oneX-sf-logo']")
	WebElement logoField;

	
	
	
	public void clickProductField()  {
		clickElement(ProductField);;
		pause(4);
	}

	
	public void logoField() {
		logoField.click();
		pause(4);
		
		
	}
	public void clickZipCodeField() {
		clickElement(zipCodeField);
		pause(4);
	}
	public void inputTextInZipCodeField() {
		zipCodeField.sendKeys("11372");
		pause(4);
	}
	

}
