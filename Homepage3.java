package pageObjectsAirportTransfer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage3 {
    
	@FindBy(xpath = "//div[text()='Airport Transfer']")
	public static WebElement transfer;
	

	public static WebElement airportName(ChromeDriver driver) throws InterruptedException {
	   Thread.sleep(500);
	   WebElement airport = driver.findElement(By.xpath("//input[@placeholder='Search for Airport']/parent::div/parent::div"));
	   Actions action = new Actions(driver);
	   Thread.sleep(500);
	   action.moveToElement(airport).sendKeys("JFK").perform();
	   return airport;
	}
	
	@FindBy(xpath = "//span[contains(text(),'New york, ')]")
	public static WebElement selectAirport;
	
	public static WebElement hotelName(ChromeDriver driver) throws InterruptedException {
		 WebElement hotel = driver.findElement(By.xpath("//input[@placeholder='Search for hotel']/parent::div/parent::div"));
		 Thread.sleep(1000);
		 Actions action = new Actions(driver);
		 action.moveToElement(hotel).sendKeys("The Manhattan Club").perform();
		 return hotel;
	}
	
	@FindBy(xpath = "//span[text()='the manhattan club']")
	public static WebElement selectHotel;
	
	 public static WebElement clickCalendar(ChromeDriver driver) throws InterruptedException {
	 WebElement calendar = driver.findElement(By.xpath("//span[text()='Arrival Date']"));
	 Actions action = new Actions(driver);
	 action.moveToElement(calendar).click().perform();
	 Thread.sleep(500);
	 return calendar;
	 }
	 
	 public static WebElement month(ChromeDriver driver) throws InterruptedException {
	 WebElement next = driver.findElement(By.xpath("//div[@class='DayPickerNavigation_button DayPickerNavigation_button_1 DayPickerNavigation_button__default DayPickerNavigation_button__default_2 DayPickerNavigation_button__horizontal DayPickerNavigation_button__horizontal_3 DayPickerNavigation_button__horizontalDefault DayPickerNavigation_button__horizontalDefault_4 DayPickerNavigation_rightButton__horizontalDefault DayPickerNavigation_rightButton__horizontalDefault_5']"));
	 next.click();
	 Thread.sleep(500);
    next.click();
	 Thread.sleep(500);
    next.click();
	 Thread.sleep(500);
    next.click();
     Thread.sleep(500);
    return next;
	 }  
	 
	 public static WebElement selectDate(ChromeDriver driver) throws InterruptedException { 
     WebElement date = driver.findElement(By.xpath("//table[@class='CalendarMonth_table CalendarMonth_table_1']/tbody/tr[2]/td[3]"));
     Actions action = new Actions(driver);
     action.moveToElement(date).click().perform();
	 Thread.sleep(500);
	 return date;
	 }
	 
	 @FindBy(xpath = "//span[text()='Done']")
	 public static WebElement done;
	 
	 @FindBy(xpath = "//div[@class='relative']/button")
	 public static WebElement clock;
	 
	 public static WebElement selectTime(ChromeDriver driver) throws InterruptedException {
		 WebElement time = driver.findElement(By.xpath("//p[text()='10:00']"));
		 Thread.sleep(500);
		 Actions action = new Actions(driver);
		 action.moveToElement(time).click().perform();
		 return time;
	 }
	 
	 @FindBy(xpath = "//span[text()='Search for transfers']/parent::a")
	 public static WebElement search;
}
