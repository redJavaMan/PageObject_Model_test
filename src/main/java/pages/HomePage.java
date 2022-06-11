package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
private WebDriver driver;
private By clickPhonesMenu =By.linkText("Phones & PDAs");

public HomePage(WebDriver driver){

    this.driver=driver;
}
public PhonesListPage clickPhonesMenu(){
    driver.findElement(clickPhonesMenu).click();
    return new PhonesListPage(driver);

}
}
