package net.jahez.pik.mobile.registration_and_login;

import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class RegistrationAndLoginTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-001",
            description = "As Customer_Customer Registration_Verify Customer can register successfully")
    public void customerRegistration(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.openSignUpPopUp();
        jahez.pikApp.pages.profilePage.fillSignUpForm(data);
        jahez.pikApp.pages.profilePage.signUp();
        jahez.pikApp.pages.profilePage.enterOTP();
        jahez.pikApp.pages.profilePage.submitOTP();
        jahez.pikApp.pages.assertBannerDisplayed(data);
        jahez.pikApp.pages.profilePage.assertProfileScreenDisplayed(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-002",
            description = "As Customer_Customer_SignIn_Verify Customer can Login successfully")
    public void customerLoginToPIK(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.assertProfileScreenDisplayed(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-003",
            description = "As Customer_Customer logout_Verify Customer can Logout successfully")
    public void customerLoginAndLogoutFromPIK(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.assertProfileScreenDisplayed(data);
        jahez.pikApp.pages.profilePage.signOut();
        jahez.pikApp.pages.homePage.assertHomePageDisplayed();
    }
}
