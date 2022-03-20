package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppProfileChangePasswordPageObjects {

    // Button Objects
    public static final By Button_ChangePassword = By.xpath("//android.widget.Button[@content-desc='Change Password']");

    // Text Objects
    public static final By Text_OldPassword = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.widget.EditText[1]");
    public static final By Text_NewPassword =By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.widget.EditText[2]");
    public static final By Text_RepeatPassword = By.xpath("/hierarchy/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/" +
            "android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/" +
            "android.view.View/android.widget.EditText[3]");
}
