package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppProfilePageObjects.*;

public class PikAppProfilePage {

    public void openSignInPopUp() {
        MobileActions.waitForElementAtIntervals(LINK_Sign_In, 1, 5);
        TouchAction action = new TouchAction(MobileDriverManager.getDriver());
        action.tap(PointOption.point(355, 408)).release().perform();
        // TODO Need to Handle in a generic way.
    }

    public void openSignUpPopUp() {
        MobileActions.waitForElementAtIntervals(LINK_Sign_Up, 1, 5);
        MobileActions.click(LINK_Sign_Up);
    }

    public void fillSignUpForm(Map<String, String> data) {
        MobileActions.waitForElementAtIntervals(TEXT_First_Name, 1, 10);
        MobileActions.click(TEXT_First_Name);
        MobileActions.sleep(20);
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
        MobileActions.waitForElementAtIntervals(TEXT_Mobile, 1, 10);
        MobileActions.click(TEXT_Mobile);
        MobileActions.sleep(20);
        MobileActions.enterText(TEXT_Mobile, data.get("MobileNumber"), "Entered FirstName : " + data.get("FirstName"));
        MobileActions.click(TEXT_Password);
        MobileActions.enterText(TEXT_Password, data.get("Password"), "Entered Password : " + data.get("Password"));
    }

    public void signIn() {
        MobileActions.click(BUTTON_Sign_In);
    }
}
