package attributes;

import org.openqa.selenium.By;

public class AttributesHome {
    protected By leftbutton() {
        return By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
    }

    protected By logoutbutton() {
        return By.xpath("//*[@id=\"logout_sidebar_link\"]");
    }

    public By lblproducts() {
        return By.xpath("//*[@id=\"inventory_filter_container\"]/div");
    }

    protected By produto() {
        return By.xpath("//*[@id=\"item_4_title_link\"]/div");
    }
}