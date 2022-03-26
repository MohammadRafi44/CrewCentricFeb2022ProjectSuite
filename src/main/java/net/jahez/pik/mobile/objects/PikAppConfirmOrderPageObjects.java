package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;


public class PikAppConfirmOrderPageObjects {

    // Button
    public static final By Button_PaymentMethod_CashOnDelivery = By.xpath("//android.widget.ImageView[@content-desc='Cash On Delivery']");
    public static final By Button_PlaceOrder = By.xpath("//android.widget.Button[@content-desc='Place Order']");

    public static By getButtonPaymentMethod_Card(String cardPartialDetails) {
        String xpath = "//android.widget.ImageView[contains(@content-desc,'" + cardPartialDetails + "')]";
        return By.xpath(xpath);
    }

}
