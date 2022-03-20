package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppProfilePaymentsPageObjects {

    // Button Objects
    public static final By BUTTON_Add_Card = By.xpath("(//android.view.View[@content-desc=\"Add Card\"])[2]");
    public static final By BUTTON_BackFromAddCard = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.widget.Button");
    public static final By BUTTON_CashOnDelivery = By.xpath("//android.widget.ImageView[@content-desc='Cash On Delivery']");

    // Element Object
    public static By getElementCards(String cardPartialDetails) {
        String xpath = "//android.widget.ImageView[contains(@content-desc,'" + cardPartialDetails + "')]";
        return By.xpath(xpath);
    }

    public static final By Element_WalletBalance = By.xpath("//android.view.View[@content-desc='Wallet Amount']" +
            "/following-sibling::android.view.View");

    // Link Objects
    public static final By LINK_Add_Card = By.xpath(("//android.view.View[@content-desc='+ Add New Card']"));

    // Text Objects
    public static final By TEXT_Card_Number = By.xpath(("//android.widget.EditText[@text='Card number']"));
    public static final By TEXT_Holder_Name = By.xpath(("//android.widget.EditText[@text='Holder name']"));
    public static final By TEXT_CVV = By.xpath(("//android.widget.EditText[@text='CVV']"));
    public static final By TEXT_Month_Year = By.xpath(("//android.widget.EditText[@text='Month/Year']"));

}
