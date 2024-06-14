package pages;

import attributes.AttributesHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHome extends AttributesHome {

    WebDriver driver;

    public PageHome(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoggedIn(){
        try {
            WebDriverWait wait = new WebDriverWait(driver,5);
            WebElement element = driver.findElement(lblproducts());
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}
