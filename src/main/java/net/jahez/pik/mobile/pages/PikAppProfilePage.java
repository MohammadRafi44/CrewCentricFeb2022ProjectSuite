package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppProfilePageObjects.*;


public class PikAppProfilePage {

    public final PikAppProfileMyAddressesPage myAddressesPage;
    public final PikAppProfileChangePasswordPage changePasswordPage;
    public final PikAppProfilePaymentsPage paymentsPage;
    public final PikAppProfileWishlistPage wishlistPage;
    public final PikAppProfileEditPage editProfilePage;

    public PikAppProfilePage() {
        myAddressesPage = new PikAppProfileMyAddressesPage();
        changePasswordPage = new PikAppProfileChangePasswordPage();
        paymentsPage = new PikAppProfilePaymentsPage();
        wishlistPage = new PikAppProfileWishlistPage();
        editProfilePage = new PikAppProfileEditPage();
    }

    public void openSignInPopUp() {
        MobileActions.waitForElementAtIntervals(LINK_Sign_In, 1, 1);
        TouchAction action = new TouchAction(MobileDriverManager.getDriver());
        action.tap(PointOption.point(355, 408)).release().perform();
    }

    public void openSignUpPopUp() {
        MobileActions.waitForElementAtIntervals(LINK_Sign_Up, 1, 1);
        MobileActions.click(LINK_Sign_Up);
    }

    public void fillSignUpForm(Map<String, String> data) {
        MobileActions.waitForElementAtIntervals(TEXT_First_Name, 1, 1);
        MobileActions.click(TEXT_First_Name);
        MobileActions.sleep(5);
        MobileActions.enterText(TEXT_First_Name, data.get("FirstName"), "Entered FirstName : " + data.get("FirstName"));
        MobileActions.click(TEXT_Email_Address);
        MobileActions.enterText(TEXT_Email_Address, data.get("EmailAddress"), "Entered EmailAddress : " + data.get("EmailAddress"));
        MobileActions.click(TEXT_Contact_No);
        MobileActions.enterText(TEXT_Contact_No, data.get("ContactNo"), "Entered ContactNo : " + data.get("ContactNo"));
        if (data.get("Gender").equalsIgnoreCase("male")) {
            MobileActions.click(RADIO_Gender_Male);
        } else if (data.get("Gender").equalsIgnoreCase("female")) {
            MobileActions.click(RADIO_Gender_Female);
        }
        // TODO Implement Date of Birth
        MobileActions.scroll(-700);
        MobileActions.click(TEXT_Password);
        MobileActions.enterText(TEXT_Password, data.get("Password"), "Entered Password : " + data.get("Password"));
        MobileActions.click(TEXT_Repeat_Password);
        MobileActions.enterText(TEXT_Repeat_Password, data.get("RepeatPassword"), "Entered RepeatPassword : " + data.get("RepeatPassword"));
    }

    public void signUp() {
        MobileActions.click(BUTTON_Sign_up);
    }

    public void fillSignInForm(Map<String, String> data) {
        MobileActions.waitForElementAtIntervals(TEXT_Mobile, 1, 1);
        MobileActions.click(TEXT_Mobile);
        MobileActions.sleep(2);
        MobileActions.enterText(TEXT_Mobile, data.get("MobileNumber"), "Entered Mobile Number");
        MobileActions.click(TEXT_Password);
        MobileActions.sleep(2);
        MobileActions.enterText(TEXT_Password, data.get("Password"), "Entered Password");
        MobileActions.sleep(2);
    }

    public void signIn() {
        MobileActions.click(BUTTON_Sign_In);
        MobileActions.sleep(5);
    }

    public void signOut() {
        MobileActions.waitForElementAtIntervals(BUTTON_Sign_Out, 1, 1);
        MobileActions.click(BUTTON_Sign_Out, "Clicked on Sign out");
        MobileActions.sleep(1);
        MobileActions.waitForElementAtIntervals(BUTTON_Sign_Out_Confirm, 1, 1);
        MobileActions.click(BUTTON_Sign_Out_Confirm, "User logged out successfully!");
    }

    // Profile - Account Section Menus
    public void openAccountMyAddressesPage() {
        MobileActions.waitForElementAtIntervals(Link_Account_MyAddresses, 1, 1);
        MobileActions.click(Link_Account_MyAddresses, "clicked on Account My Addresses");
    }

    public void openAccountChangePasswordPage() {
        MobileActions.waitForElementAtIntervals(Link_Account_ChangePassword, 1, 1);
        MobileActions.click(Link_Account_ChangePassword, "clicked on Account Change Password");
    }

    public void openAccountPaymentsPage() {
        MobileActions.waitForElementAtIntervals(Link_Account_Payments, 1, 1);
        MobileActions.click(Link_Account_Payments, "clicked on Account Payments");
    }

    public void openAccountWishlistPage() {
        MobileActions.waitForElementAtIntervals(Link_Account_Wishlist, 1, 1);
        MobileActions.click(Link_Account_Wishlist, "clicked on Account Wishlist");
    }

    public void enterOTP() {
        MobileActions.sleep(10);
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        MobileActions.sleep(2);
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        MobileActions.sleep(2);
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        MobileActions.sleep(2);
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
    }

    public void submitOTP() {
        MobileActions.click(BUTTON_Next, "clicked on Next");
    }

    public void editProfile(Map<String, String> data) {
        MobileActions.waitForElementAtIntervals(getElementProfile(data.get("ProfileName")), 1, 1);
        TouchAction action = new TouchAction(MobileDriverManager.getDriver());
        action.tap(PointOption.point(970, 380)).release().perform();
        // TODO Need to Handle in a generic way.
        MobileActions.sleep(2);
    }

    // Assert Methods
    public void assertProfileScreenDisplayed(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(getElementProfile(data.get("ProfileName"))),
                "Profile Screen displayed.");
        Helper.log("Profile Screen displayed.");
    }

}
