package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by musti on 17/06/2017.
 */
public class shoppingCart {

    WebDriver driver;
    public shoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }



}
