package basicselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("matschie@testleaf.com");
		driver.findElementById("password").sendKeys("India@123");
		driver.findElementById("Login").click();
		
		List<WebElement> lightningSwitch = driver.findElementsByXPath("//a[@class='switch-to-lightning']");
		if(lightningSwitch.size() !=0)
		{
			driver.findElementByXPath("//a[@class='switch-to-lightning']").click();
		}
		
		driver.findElementByClassName("slds-icon-waffle").click();
		WebElement element = driver.findElementByXPath("//input[@class='slds-input']");
		element.click();
		element.clear();
		element.sendKeys("Accounts");
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("//a[@id='Account']"));
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='Account-search-input']").sendKeys("Bharath",Keys.ENTER);
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("//div[@data-aura-class='forceVirtualAction']/a"));
		Thread.sleep(2000);
		driver.findElementByXPath("//a[contains(@title, 'Edit')]").click();
		Thread.sleep(2000);
		List<WebElement> dropdownFields = driver.findElementsByXPath("//input[@class='slds-input slds-combobox__input']");
		driver.executeScript("arguments[0].click();", dropdownFields.get(3));
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("//span[contains(@title, 'Technology Partner')]"));
		driver.executeScript("arguments[0].click();", dropdownFields.get(5));
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("//span[contains(@title, 'Healthcare')]"));
     	List<WebElement> billingStreet = driver.findElementsByXPath("(//textarea[@name='street'])");
		driver.executeScript("arguments[0].click();", billingStreet.get(0));
		billingStreet.get(0).sendKeys("Raman Street");
		driver.executeScript("arguments[0].click();", billingStreet.get(1));
		billingStreet.get(1).sendKeys("Chrompet");
		driver.executeScript("arguments[0].click();", dropdownFields.get(6));
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("//span[contains(@title, 'Low')]"));
		driver.executeScript("arguments[0].click();", dropdownFields.get(7));
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("//span[contains(@title, 'Silver')]"));
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();", dropdownFields.get(9));
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("(//span[contains(@title, 'No')])[7]"));
		WebElement phoneNumber = driver.findElementByXPath("//input[@name='Phone']");
		driver.executeScript("arguments[0].click();",phoneNumber);
		phoneNumber.sendKeys("9677240399");
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();", dropdownFields.get(8));
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("//span[contains(@title, 'No')]"));
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();", driver.findElementByXPath("//button[@name='SaveEdit']"));
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
