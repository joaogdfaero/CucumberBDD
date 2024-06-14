package attributes;

import org.openqa.selenium.By;

public class AttributesLogin {

    protected  By user() {
        return By.xpath("//input[@id='user-name']");
    }

    protected  By password() {
        return By.xpath("//*[@id=\"password\"]");
    }

    protected  By entrar() {
        return By.xpath("//*[@id=\"login-button\"]");
    }
}