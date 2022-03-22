package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppDeliveryPageObjects.*;

public class PikAppDeliveryPage {
    public final PikAppConfirmOrderPage confirmOrderPage;

    public PikAppDeliveryPage() {
        confirmOrderPage = new PikAppConfirmOrderPage();
    }

    public void selectDeliveryType(Map<String, String> data) {
        if (data.get("DeliveryType").equalsIgnoreCase("delivery")) {
            MobileActions.click(Button_Delivery, "Clicked on Delivery as Delivery Type");
        } else {
            MobileActions.click(Button_SelfPickUp, "Clicked on Self PickUp as Delivery Type");
        }
        MobileActions.sleep(10);
    }

    public void continueDeliveryType() {
        MobileActions.click(Button_Continue, "Clicked on Continue in Delivery Page.");
        MobileActions.sleep(5);
    }
}
