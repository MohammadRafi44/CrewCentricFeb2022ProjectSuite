package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppMyCartPageObjects.Button_Continue;
import static net.jahez.pik.mobile.objects.PikAppMyCartPageObjects.getCardShop;

public class PikAppMyCartPage {
    public final PikAppDeliveryPage deliveryPage;

    public PikAppMyCartPage() {
        deliveryPage = new PikAppDeliveryPage();
    }

    public void expandShop(Map<String, String> data) {
        MobileActions.waitForElementAtIntervals(getCardShop(data.get("ShopName")), 1, 1);
        MobileActions.click(getCardShop(data.get("ShopName")), "Clicked on shop " + data.get("ShopName"));
        MobileActions.sleep(3);
    }

    public void continueShoppingCart() {
        MobileActions.waitForElementAtIntervals(Button_Continue, 1, 1);
        MobileActions.click(Button_Continue, "Clicked on Continue in Shopping Cart Page.");
    }

    public void deleteShopIfExist(Map<String, String> data) {
        MobileActions.sleep(10);
        if (MobileActions.checkIfWebElementExists(getCardShop(data.get("ShopName")))) {
            deleteShop(data);
        }
    }

    public void deleteShop(Map<String, String> data) {
        MobileActions.swipeLeft(getCardShop(data.get("ShopName")), 90);
        MobileActions.sleep(3);
    }

    public void assertShopDeleted(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertFalse(MobileActions.checkIfWebElementExists(getCardShop(data.get("ShopName"))),
                data.get("ShopName") + " Shop not exist.");
        Helper.log(data.get("ShopName") + " Shop not exist.");
    }
}
