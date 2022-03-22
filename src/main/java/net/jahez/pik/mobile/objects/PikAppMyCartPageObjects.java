package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppMyCartPageObjects {

    // Button Objects
    public static final By Button_Continue = By.xpath("//android.widget.Button[@content-desc='Continue']");

    // Card Objects
    public static By getCardShop(String shopName) {
        String xpath = "//android.widget.ImageView[contains(@content-desc,'" + shopName + "')]";
        return By.xpath(xpath);
    }
}
