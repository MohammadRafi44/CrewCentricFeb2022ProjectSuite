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
    public static final By Near_By_Shops= By.xpath("//android.view.View[@content-desc='Nearby Shops 0.0 Open Spring rose 0.0 Open Automation shop 0.0 Open Zara 0.0 Open Order test shop 0.0 Open Donetella 0.0 Open Ruff boutique 0.0 Open Bushoron 0.0 Open Test 0.0 Open Abdulaziz test 0.0 Open Fatimah shop 0.0 Open Abeer test 0.0 Open Kodo 0.0 Open Ordershop 0.0 Open Amazon 0.0 Open Alsalman oud 0.0 Open Toy house 0.0 Close Test11 0.0 Close Kfc 0.0 Close Saco 0.0 Close Saco 2 0.0 Close American eagle']");
    public static final By HomePage_section= By.xpath("//android.view.View[@content-desc='test variant deal']");


}
