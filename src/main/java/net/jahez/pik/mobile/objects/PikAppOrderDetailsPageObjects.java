package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;


public class PikAppOrderDetailsPageObjects {
    // Button Objects
    public static final By BUTTON_Cancel_Order = By.xpath("//android.widget.Button[@content-desc='Cancel Order']");
    public static final By BUTTON_Cancel_Yes = By.xpath("//android.widget.Button[@content-desc='Yes']");

    // Label
    public static final By Label_WaitForOrderConfirmation = By.xpath("//android.view.View[@content-desc='Please wait for accepting your order… ']");
    public static final By Label_PurchaseSummary = By.xpath("//android.view.View[@content-desc='Purchase Summary']");

    //Label Objects
    public static final By LABEL_Order_Cancel = By.xpath("//android.view.View[contains(@content-desc,'Cancelled')]");
}
