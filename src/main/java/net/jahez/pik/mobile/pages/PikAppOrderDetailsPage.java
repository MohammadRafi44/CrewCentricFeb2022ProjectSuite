package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppOrderDetailsPageObjects.*;

public class PikAppOrderDetailsPage {

    public void assertOrderDetailsPageDisplayed() {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(Label_PurchaseSummary),
                "Order details Page displayed.");
        Helper.log("Order details Page displayed.");
    }

    public void cancelOrder(Map<String, String> data) {
        MobileActions.click(BUTTON_Cancel_Order, "clicked on Cancel Order");
        MobileActions.sleep(2);
        MobileActions.click(BUTTON_Cancel_Yes, "clicked on Cancel Yes");
        MobileActions.sleep(2);
        Helper.log("Order Cancelled Successfully! " + MobileActions.getText(LABEL_Order_Cancel));
        MobileActions.sleep(2);
    }

    public void assertOrderCancelled(Map<String, String> data) {
        MobileActions.takeScreenshot();
        // TODO implement
//        Assert.assertTrue(MobileActions.checkIfWebElementExists(),
//                "Payment details - Cart details displayed.");
//        Helper.log("Payment details - Cart details displayed.");
    }
}
