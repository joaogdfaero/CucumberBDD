package pages;
import attributes.AttributesLogin;
import org.openqa.selenium.WebDriver;

public class PageLogin extends AttributesLogin {

    WebDriver driver;

    public PageLogin(WebDriver driver) {
        this.driver = driver;
    }

    public void writeName(String name) {
        driver.findElement(user()).sendKeys(name);
    }

    public void writePassword(String senha) {

        driver.findElement(password()).sendKeys(senha);
    }

    public void clickEnter() {
        driver.findElement(entrar()).click();
    }
}
