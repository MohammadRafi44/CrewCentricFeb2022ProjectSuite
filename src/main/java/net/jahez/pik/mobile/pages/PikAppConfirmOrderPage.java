package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppConfirmOrderPageObjects.*;

public class PikAppConfirmOrderPage {
    public final PikAppOrderDetailsPage orderDetailsPage;

    public PikAppConfirmOrderPage() {
        orderDetailsPage = new PikAppOrderDetailsPage();
    }

    public void selectPaymentMethods(Map<String, String> data) {
        if (data.get("CardType").equalsIgnoreCase("cash on delivery")) {
            MobileActions.click(Button_PaymentMethod_CashOnDelivery);
        } else {
            MobileActions.click(getButtonPaymentMethod_Card(data.get("CardPartialDetails")));
        }
        MobileActions.sleep(10);
    }

    public void placeOrder() {
        MobileActions.click(Button_PlaceOrder);
        MobileActions.sleep(10);
    }

    public void assertPaymentDetails(Map<String, String> data) {
        MobileActions.takeScreenshot();
        // TODO implement
//        Assert.assertTrue(MobileActions.checkIfWebElementExists(),
//                "Payment details - Cart details displayed.");
//        Helper.log("Payment details - Cart details displayed.");
    }

    public void assertOrderDetails(Map<String, String> data) {
        MobileActions.takeScreenshot();
        // TODO implement
//        Assert.assertTrue(MobileActions.checkIfWebElementExists(),
//                "Payment details - Cart details displayed.");
//        Helper.log("Payment details - Cart details displayed.");
    }
}
