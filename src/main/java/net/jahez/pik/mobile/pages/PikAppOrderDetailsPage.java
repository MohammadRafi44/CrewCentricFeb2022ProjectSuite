package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppOrderDetailsPageObjects.*;

public class PikAppOrderDetailsPage {

    public void assertOrderDetailsPageDisplayed() {
        MobileActions.takeScreenshot();
        MobileActions.waitForElementAtIntervals(Label_PurchaseSummary, 1, 1);
        Assert.assertTrue(MobileActions.checkIfWebElementExists(Label_PurchaseSummary),
                "Order details Page displayed.");
        Helper.log("Order details Page displayed.");
    }

    public void cancelOrder(Map<String, String> data) {
        MobileActions.scrollUp(200);
        MobileActions.click(BUTTON_Cancel_Order, "clicked on Cancel Order");
        MobileActions.sleep(2);
        MobileActions.click(BUTTON_Cancel_Yes, "clicked on Cancel Yes");
        MobileActions.sleep(2);
        Helper.log("Order Cancelled Successfully! " + MobileActions.getText(LABEL_Order_Cancel));
        MobileActions.sleep(2);
    }

    public void assertOrderCancelled(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(LABEL_Order_Cancel),
                "Order Cancelled Successfully.");
        Helper.log("Order Cancelled Successfully.");
    }
}
