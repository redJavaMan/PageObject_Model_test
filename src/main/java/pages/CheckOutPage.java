package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;
    private By getAlertMessage = By.xpath("//div[@id='checkout-cart']/child::div");
    public CheckOutPage(WebDriver driver) {
        this.driver=driver;
    }
    public String getAlertMessage(){
        return driver.findElement(getAlertMessage).getText();
    }
}
