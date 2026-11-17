package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepackage.homepage;
import pagepackage.loginpage;

public class baseclass {

    public static WebDriver driver;
    public loginpage loginobj;
    public homepage homeobj;

    @BeforeTest
    public void browsersetup() {

        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void objectcreation() {

        loginobj = new loginpage(driver);
        homeobj = new homepage(driver);
    }
}