package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppProfileEditPageObjects.*;

public class PikAppProfileEditPage {

    public void assertProfileDetails(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.getText(TEXT_First_Name).contains(data.get("FirstName")),
                "FirstName matches");
        Helper.log(data.get("FirstName") + " FirstName matches");

        Assert.assertTrue(MobileActions.getText(TEXT_Email_Address).contains(data.get("EmailAddress")),
                "EmailAddress matches");
        Helper.log(data.get("EmailAddress") + " EmailAddress matches");

        Assert.assertTrue(MobileActions.getText(TEXT_Contact_No).contains(data.get("ContactNo")), "ContactNo matches");
        Helper.log(data.get("ContactNo") + " ContactNo matches");

        Assert.assertTrue(MobileActions.getText(TEXT_Date_of_birth).contains(data.get("DOB")), "DOB matches");
        Helper.log(data.get("DOB") + " DOB matches");

        if (data.get("Gender").equalsIgnoreCase("male")) {
            Assert.assertTrue(MobileActions.getAttribute(RADIO_Gender_Male, "checked").contains("true"),
                    "Male Gender Selected.");
            Helper.log("Male Gender Selected");
        } else if (data.get("Gender").equalsIgnoreCase("female")) {
            Assert.assertTrue(MobileActions.getAttribute(RADIO_Gender_Female, "checked").contains("true"),
                    "Male Gender Selected.");
            Helper.log("Female Gender Selected");
        }
    }
}
