package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppProfileMyAddressesPageObjects {


    // Button Objects
    public static final By Button_ConfirmLocation = By.xpath("//android.widget.Button[@content-desc='Confirm location']");
    public static final By Button_Save = By.xpath("//android.widget.Button[@content-desc='Save']");
    public static final By Button_Yes = By.xpath("//android.widget.Button[@content-desc='Yes']");
    public static final By Button_No = By.xpath("//android.widget.Button[@content-desc='No']");

    // Link Objects
    public static final By Link_AddNew = By.xpath("//android.view.View[@content-desc='+ Add New']");

    // Text Objects
    public static final By Text_Address = By.xpath("//android.widget.Button[@content-desc='Confirm location']");
    public static final By Text_NameOfAddress = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout" +
            "/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View" +
            "/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText");

    // Card Objects
    public static By getCardAddress(String address) {
        String xpath = "//android.view.View[contains(@content-desc,'" + address + "')]";
        return By.xpath(xpath);
    }
}
