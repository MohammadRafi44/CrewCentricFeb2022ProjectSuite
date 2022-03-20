package net.jahez.pik.mobile.view_and_edit_profile;

import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class view_and_edit_profile extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-025",
            description = "As Customer_View Profile_Validate that user can check profile information")
    public void validateUserProfile(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.editProfile(data);
        jahez.pikApp.pages.profilePage.editProfilePage.assertProfileDetails(data);
    }
}