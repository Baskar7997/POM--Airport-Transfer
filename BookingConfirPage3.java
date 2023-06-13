package pageObjectsAirportTransfer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BookingConfirPage3 {
    public static WebElement firstName(ChromeDriver driver) {
    	 Set<String> windowHandles1 = driver.getWindowHandles();
	     List<String> book=new ArrayList<String>(windowHandles1);
		 driver.switchTo().window(book.get(1));		 
		 return driver.findElement(By.xpath("//input[@placeholder='First Name*']"));
    }
    @FindBy(xpath = "//input[@placeholder='Last Name*']")
    public static WebElement lastName;
    
    @FindBy(xpath = "//button[@placeholder='Select*']")
    public static WebElement salutation;
    
    @FindBy(xpath = "//span[text()='Mr']")
    public static WebElement mr;
    
    @FindBy(xpath = "//input[@placeholder='Age*']")
    public static WebElement age;
    
    @FindBy(xpath = "//input[@placeholder='Select Airline*']")
    public static WebElement selectAirline;
    
    @FindBy(xpath = "//span[text()='American Airlines']")
    public static WebElement americanAirline;
    
    @FindBy(xpath = "//input[@placeholder='Flight Number*']")
    public static WebElement flightNumber;
    
    @FindBy(xpath ="(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[1]/input")
	public static WebElement address;
	   
    @FindBy(xpath ="(//button[@class='w-full flex justify-between items-center bg-transparent']/input)[2]")
    public static WebElement country;
	   
	@FindBy(xpath = "//span[text()='India']")
	public static WebElement india;
	   
	@FindBy(xpath ="//input[@placeholder='Zipcode*']") 
	public static WebElement zipcpde;
	   
	@FindBy(xpath ="(//div[@class='w-full  flex gap-4 p-0.5 rounded-xl  shrink justify-center items-center'])[2]/input")
	public static WebElement city;
	   
	@FindBy(xpath ="//input[@placeholder='Email*']")
	public static WebElement email;
	   
	@FindBy(xpath ="//input[@placeholder='Contact number']")
	public static WebElement phoneNo;
    
}
