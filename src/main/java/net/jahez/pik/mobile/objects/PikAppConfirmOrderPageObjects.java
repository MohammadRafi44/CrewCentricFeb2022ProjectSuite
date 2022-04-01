package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;


public class PikAppConfirmOrderPageObjects {

    // Button
    public static final By Button_PaymentMethod_CashOnDelivery = By.xpath("//android.widget.ImageView[@content-desc='Cash On Delivery']");
    public static final By Button_PlaceOrder = By.xpath("//android.widget.Button[@content-desc='Place Order']");
    public static final By Button_Back = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/" +
            "android.view.View/android.view.View/android.widget.Button");

    // Link Object
    public static final By Link_AddCard = By.xpath("//android.view.View[@content-desc='Add Card +']");

    public static By getButtonPaymentMethod_Card(String cardPartialDetails) {
        String xpath = "//android.widget.ImageView[contains(@content-desc,'" + cardPartialDetails + "')]";
        return By.xpath(xpath);
    }


    // Checkbox Objects
    public static final By CheckBox_UseWalletAmount = By.xpath("//android.view.View[@content-desc='Confirm Order']/" +
            "android.widget.ScrollView/android.widget.CheckBox");

    // Element Objects
    public static final By Element_DeliveryAddress = By.xpath("//android.view.View[@content-desc='Delivery Address']" +
            "/following-sibling::android.view.View[1]");
    public static final By Element_PaymentMethod = By.xpath("//android.view.View[@content-desc='Payment Method']" +
            "/following-sibling::android.widget.ImageView[1]");
    public static final By Element_WalletAmount = By.xpath("//android.view.View[@content-desc='Use Wallet Amount']" +
            "/following-sibling::android.view.View[1]");
    public static final By Element_CartTotalAmount = By.xpath("//android.view.View[@content-desc='Cart Total']" +
            "/following-sibling::android.view.View[1]");
    public static final By Element_DueWalletAmount = By.xpath("//android.view.View[@content-desc='Due wallet Amount']" +
            "/following-sibling::android.view.View[1]");
    public static final By Element_DeliveryCharges = By.xpath("//android.view.View[@content-desc='Delivery Charges']" +
            "/following-sibling::android.view.View[1]");
    public static final By Element_VAT = By.xpath("//android.view.View[@content-desc='VAT']" +
            "/following-sibling::android.view.View[1]");
    public static final By Element_TotalAmount = By.xpath("//android.view.View[@content-desc='Total Amount']" +
            "/following-sibling::android.view.View[1]");

    public static By getElementProduct(String productName) {
        String xpath = "//android.widget.ImageView[contains(@content-desc,'" + productName + "')]";
        return By.xpath(xpath);
    }
}
