package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a") WebElement admin;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")WebElement userclick;
	public homepage(WebDriver driver) {
		  this.driver = driver;
	        PageFactory.initElements(driver, this);
		
	}

	public void adminnavigate()
	{
		admin.click();
		userclick.click();
		userclick.sendKeys("user");
	}

}
