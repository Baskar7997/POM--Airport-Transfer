package pageObjectsAirportTransfer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelPage3 {
	 
	    @FindBy(xpath = "//div[text()='Cancel the booking?']")
	    public static WebElement cancel;	
		
		@FindBy(xpath = "//button[text()='Yes']")
		public static WebElement yes;
}
