package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppProfileWishlistPageObjects {

    // Card
    public static By getCardProduct(String productName) {
        String xpath = "//android.widget.ImageView[contains(@content-desc,'" + productName + "')]";
        return By.xpath(xpath);
    }
}
