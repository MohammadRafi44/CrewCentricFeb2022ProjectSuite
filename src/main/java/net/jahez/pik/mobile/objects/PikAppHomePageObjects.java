package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppHomePageObjects {

    // Button
    public static final By BUTTON_Categories_Search = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
    public static final By BUTTON_NewIn = By.xpath("//android.widget.ImageView[@content-desc='New In']/android.widget.Button");

    // Text
    public static final By TEXT_Categories_Search = By.xpath("//android.widget.EditText[@text='Search']");

    //section
    public static final By Promotional_Filter = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[2]/android.view.View");
    public static final By Banner_Section = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[1]/android.view.View/android.view.View/android.widget.ImageView");
    public static final By Near_By_Shops= By.xpath("//android.view.View[contains(@content-desc,'Nearby Shops')]");
    public static final By HomePage_section= By.xpath("//android.view.View[@content-desc='test variant deal']");


}
