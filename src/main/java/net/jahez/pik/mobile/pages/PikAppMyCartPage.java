package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppMyCartPageObjects.Button_Continue;
import static net.jahez.pik.mobile.objects.PikAppMyCartPageObjects.getCardShop;

public class PikAppMyCartPage {
    public final PikAppDeliveryPage deliveryPage;

    public PikAppMyCartPage() {
        deliveryPage = new PikAppDeliveryPage();
    }

    public void expandShop(Map<String, String> data) {
        MobileActions.click(getCardShop(data.get("ShopName")), "Clicked on shop " + data.get("ShopName"));
        MobileActions.sleep(5);
    }

    public void continueShoppingCart() {
        MobileActions.click(Button_Continue, "Clicked on Continue in Shopping Cart Page.");
        MobileActions.sleep(15);
    }
}
