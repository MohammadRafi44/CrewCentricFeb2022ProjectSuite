package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppProfileEditPageObjects {

    // Button
    public static final By BUTTON_update = By.xpath("//android.widget.Button[@content-desc='Update']");
    public static final By BUTTON_BackFromEditProfile = By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.widget.Button[1]");

    // Radio Objects
    public static final By RADIO_Gender_Male = By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.widget.ScrollView/android.widget.RadioButton[1]");
    public static final By RADIO_Gender_Female = By.xpath("/hierarchy/android.widget.FrameLayout" +
            "/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.widget.ScrollView/android.widget.RadioButton[2]");

    // Text Objects
    public static final By TEXT_First_Name = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.widget.ScrollView/android.widget.EditText[1]");
    public static final By TEXT_Email_Address = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.widget.ScrollView/android.widget.EditText[2]");
    public static final By TEXT_Contact_No = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.widget.ScrollView/android.widget.EditText[3]");
    public static final By TEXT_Date_of_birth = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.widget.ScrollView/android.widget.EditText[4]");
}
