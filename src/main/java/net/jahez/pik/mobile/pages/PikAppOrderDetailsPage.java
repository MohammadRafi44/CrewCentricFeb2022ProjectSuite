package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.utils.Helper;
import org.testng.Assert;

import static net.jahez.pik.mobile.objects.PikAppOrderDetailsPageObjects.Label_PurchaseSummary;

public class PikAppOrderDetailsPage {

    public void assertOrderDetailsPageDisplayed() {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(Label_PurchaseSummary),
                "Order details Page displayed.");
        Helper.log("Home Page displayed.");
    }
}
