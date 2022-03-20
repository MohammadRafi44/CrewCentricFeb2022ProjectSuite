package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppProfileChangePasswordPageObjects.*;

public class PikAppProfileChangePasswordPage {
    public void changePassword(Map<String, String> data) {
        MobileActions.takeScreenshot();
        MobileActions.click(Text_OldPassword);
        MobileActions.sleep(1);
        MobileActions.enterText(Text_OldPassword, data.get("OldPassword"),
                "Entered OldPassword : " + data.get("OldPassword"));
        MobileActions.click(Text_NewPassword);
        MobileActions.sleep(1);
        MobileActions.enterText(Text_NewPassword, data.get("NewPassword"),
                "Entered NewPassword : " + data.get("NewPassword"));
        MobileActions.click(Text_RepeatPassword);
        MobileActions.sleep(1);
        MobileActions.enterText(Text_RepeatPassword, data.get("RepeatPassword"),
                "Entered RepeatPassword : " + data.get("RepeatPassword"));
        MobileActions.click(Button_ChangePassword);
        MobileActions.sleep(5);
    }
}
