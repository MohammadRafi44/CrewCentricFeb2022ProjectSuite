package net.jahez.pik.mobile.registration_and_login;

import com.example.utils.Helper;
import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class RegistrationAndLoginTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", testName = "TC001", description = "As Customer_Customer Registration_Verify Customer can register successfully")
    public void registrationAndLoginTC001(Map<String, String> data) {
        Helper.log("Yet to Implement");
    }

    @Test(dataProvider = "testDataProvider", testName = "TC002", description = "As Customer_Customer Registration_Verify system behavior when user enter wrong mobile number format")
    public void registrationAndLoginTC002(Map<String, String> data) throws Exception {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.openSignUpPopUp();
        jahez.pikApp.pages.profilePage.fillSignUpForm(data);
        jahez.pikApp.pages.profilePage.signUp();
        jahez.pikApp.pages.assertBannerDisplayed(data);
    }

    @Test(dataProvider = "testDataProvider", testName = "TC003", description = "As Customer_Customer Registration_Check the mandatory fields for user registration")
    public void registrationAndLoginTC003(Map<String, String> data) {
        Helper.log("Yet to Implement");
    }

    @Test(dataProvider = "testDataProvider", testName = "TC004", description = "As Customer_Customer_SignIn_Verify Customer can Login successfully")
    public void registrationAndLoginTC004(Map<String, String> data) {
        Helper.log("Yet to Implement");
    }

    @Test(dataProvider = "testDataProvider", testName = "TC006", description = "As Customer_Customer logout_Verify Customer can Logout successfully")
    public void registrationAndLoginTC006(Map<String, String> data) {
        Helper.log("Yet to Implement");
    }
}