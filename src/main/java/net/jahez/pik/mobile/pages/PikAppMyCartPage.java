package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppMyCartPageObjects.*;

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

    public void deleteShop(Map<String, String> data) {
        MobileActions.swipeLeft(getCardShop(data.get("ShopName")), 90);
        MobileActions.sleep(5);
    }

    public void assertShopDeleted(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertFalse(MobileActions.checkIfWebElementExists(getCardShop(data.get("ShopName"))),
                data.get("ShopName") + " Shop not exist.");
        Helper.log(data.get("ShopName") + " Shop not exist.");
    }
}
