package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;

public class Base {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        homePage=new HomePage(driver);

    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
