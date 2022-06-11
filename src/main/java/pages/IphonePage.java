package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class IphonePage {
    private WebDriver driver;
    private By clickIphoneCart = By.xpath("//button[text()='Add to Cart']");
    private By clickItem = By.cssSelector("span#cart-total");
    private By clickViewCart = By.xpath("//strong[text()=' View Cart']");


    public IphonePage (WebDriver driver) {

        this.driver=driver;
    }
    public void iphoneCart(){
        driver.findElement(clickIphoneCart).click();
    }
    public void clickItem(){
        driver.findElement(clickItem).click();
    }

    public CartPage viewCart(){
        driver.findElement(clickViewCart).click();
        return new CartPage(driver);
    }


}
