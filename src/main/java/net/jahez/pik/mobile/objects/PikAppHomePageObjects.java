package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppHomePageObjects {

    // Button
    public static final By BUTTON_Categories_Search = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
    public static final By BUTTON_NewIn = By.xpath("//android.widget.ImageView[@content-desc='New In']/android.widget.Button");

    // Text
    public static final By TEXT_Categories_Search = By.xpath("//android.widget.EditText[@text='Search']");
}
