package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.IphonePage;

public class PhonesListPage {
    private WebDriver driver;
    private By clickIphone = By.xpath("//a[text()='iPhone']");

    public PhonesListPage(WebDriver driver) {

        this.driver =driver;
    }
    public IphonePage clickPhone(){
        driver.findElement(clickIphone).click();
        return new IphonePage(driver);
    }
}
