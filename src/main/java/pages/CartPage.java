package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By clickCheckOut = By.xpath("//a[text()='Checkout']");
    private By getTxtChkOut = By.xpath("//div[@id='checkout-cart']/child::div/child::i");

    public CartPage(WebDriver driver) {

        this.driver=driver;
    }
    public String getTxtChkOut(){
        return driver.findElement(getTxtChkOut).getText();
    }

    public CheckOutPage clickCheckOut(){
        driver.findElement(clickCheckOut).click();
        return new CheckOutPage(driver);
    }
}
