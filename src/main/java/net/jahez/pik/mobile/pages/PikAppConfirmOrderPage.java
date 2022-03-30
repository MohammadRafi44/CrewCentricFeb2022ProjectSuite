package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppConfirmOrderPageObjects.*;

public class PikAppConfirmOrderPage {
    public final PikAppOrderDetailsPage orderDetailsPage;

    public PikAppConfirmOrderPage() {
        orderDetailsPage = new PikAppOrderDetailsPage();
    }

    public void selectPaymentMethods(Map<String, String> data) {
        MobileActions.waitForElementAtIntervals(Button_PaymentMethod_CashOnDelivery, 1, 5);
        MobileActions.sleep(10);
        int i = 1;
        if (data.get("CardType").equalsIgnoreCase("cash on delivery")) {
//            MobileActions.click(Button_PaymentMethod_CashOnDelivery);
            // TODO Need to Handle in a generic way.
            TouchAction action = new TouchAction(MobileDriverManager.getDriver());
            action.tap(PointOption.point(500, 1150)).release().perform();
            MobileActions.sleep(2);
        } else {
            MobileActions.click(getButtonPaymentMethod_Card(data.get("CardPartialDetails")));
        }
        MobileActions.sleep(10);
    }

    public void placeOrder() {
        MobileActions.click(Button_PlaceOrder);
        MobileActions.sleep(30);
    }

    public void assertProductDetails(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(getElementProduct(data.get("ProductName"))),
                data.get("ProductName") + " Product displayed.");
        Helper.log(data.get("ProductName") + " Product displayed.");
    }

    public void assertDeliveryAddress(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.getAttribute(Element_DeliveryAddress, "content-desc").contains(
                data.get("DeliveryAddress")), "Delivery Type - is " + data.get("DeliveryType") + " "
                + data.get("DeliveryAddress"));
        Helper.log("Delivery Type - is " + data.get("DeliveryType") + " " + data.get("DeliveryAddress"));
    }

    public void assertPaymentMethod(Map<String, String> data) {
        MobileActions.takeScreenshot();
        if (data.get("CardType").equalsIgnoreCase("cash on delivery")) {
            Assert.assertEquals(MobileActions.getAttribute(Element_PaymentMethod, "content-desc"),
                    data.get("CardType"), "Payment method - is " + data.get("CardType"));
            Helper.log("Payment method - is " + data.get("CardType"));
        } else {
            Assert.assertEquals(MobileActions.getAttribute(Element_PaymentMethod, "content-desc"),
                    "**** " + data.get("CardPartialDetails"),
                    "Payment method - is " + data.get("CardType") + " Card Number" + data.get("CardPartialDetails"));
            Helper.log("Payment method - is " + data.get("CardType") + " Card Number " + data.get("CardPartialDetails"));
        }
    }

    public void assertUseWalletAmountSelected() {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfRadioButtonSelected(CheckBox_UseWalletAmount),
                "Use Wallet Amount Selected.");
        Helper.log("Use Wallet Amount Selected.");
    }

    public void assertPaymentDetails(Map<String, String> data) {
        MobileActions.takeScreenshot();
        MobileActions.scrollUp(400);
        Assert.assertEquals(MobileActions.getAttribute(Element_CartTotalAmount, "content-desc").trim(),
                data.get("CartTotal"), "Cart Total - is " + data.get("CartTotal"));
        Helper.log("Cart Total - is " + data.get("CartTotal"));
        if (!data.get("DueWalletAmount").equalsIgnoreCase("empty")) {
            Assert.assertEquals(MobileActions.getAttribute(Element_DueWalletAmount, "content-desc").trim(),
                    data.get("DueWalletAmount"), "Due Wallet Amount - is " + data.get("DueWalletAmount"));
            Helper.log("Due Wallet Amount - is " + data.get("DueWalletAmount"));
        }
        Assert.assertEquals(MobileActions.getAttribute(Element_VAT, "content-desc").trim(),
                data.get("VAT"), "VAT - is " + data.get("VAT"));
        Helper.log("VAT - is " + data.get("VAT"));
        Assert.assertEquals(MobileActions.getAttribute(Element_TotalAmount, "content-desc").trim(),
                data.get("TotalAmount"), "Total Amount - is " + data.get("TotalAmount"));
        Helper.log("Total Amount - is " + data.get("TotalAmount"));
        if (data.get("DeliveryType").equalsIgnoreCase("delivery")) {
            Assert.assertEquals(MobileActions.getAttribute(Element_DeliveryCharges, "content-desc").trim(),
                    data.get("DeliveryCharges"), "Delivery Charge - is " + data.get("DeliveryCharges"));
            Helper.log("Delivery Charge - is " + data.get("DeliveryCharges"));
        } else if (data.get("DeliveryType").equalsIgnoreCase("self pickup")) {
            Assert.assertFalse(MobileActions.checkIfWebElementExists(Element_DeliveryCharges),
                    "Delivery Charge not applied");
            Helper.log("Delivery Charge not applied");
        }
    }
}
