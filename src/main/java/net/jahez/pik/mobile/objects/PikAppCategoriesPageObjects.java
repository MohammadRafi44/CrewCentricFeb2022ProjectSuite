package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppCategoriesPageObjects {

    // Element Objects
    public static final By Element_CartQuantity = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View" +
            "/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[6]");

    // Icon Objects
    public static final By Icon_BackToShop = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View[1]");

    public static final By Icon_WishlistHeart = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View[2]");

    public static By getIconBackToCategories(String shopName) {
        String xpath = "//android.view.View[contains(@content-desc,'" + shopName + "')]/android.widget.Button";
        return By.xpath(xpath);
    }

    // Link Objects
    public static final By Link_Shops = By.xpath("//android.view.View[@content-desc='Shops']");
    public static final By Link_Products = By.xpath("//android.view.View[@content-desc='Products']");

    // Card Objects
    public static By getCardShop(String shopName) {
        String xpath = "//android.widget.ImageView[contains(@content-desc,'" + shopName + "')]/android.widget.Button";
        return By.xpath(xpath);
    }

    public static By getCardProduct(String productName) {
        String xpath = "//android.widget.ImageView[contains(@content-desc,'" + productName + "')]";
        return By.xpath(xpath);
    }
}
