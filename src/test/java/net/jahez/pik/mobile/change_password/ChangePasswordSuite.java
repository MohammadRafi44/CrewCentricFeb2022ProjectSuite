package net.jahez.pik.mobile.change_password;

import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class ChangePasswordSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-021", description = "As Customer_Change Password_Validate that user can change password")
    public void changePassword(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.openAccountChangePasswordPage();
    }
}