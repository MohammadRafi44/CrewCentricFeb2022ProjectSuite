package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppProfileWishlistPageObjects.getCardProduct;

public class PikAppProfileWishlistPage {


    public void assertProductExistInWishlist(Map<String, String> data) {
        String productName = data.get("ProductName");
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(getCardProduct(productName)),
                productName + " product exist in wishlist");
        Helper.pass(productName + " product exist in wishlist");
    }

    public void assertProductNotExistInWishlist(Map<String, String> data) {
        String productName = data.get("ProductName");
        MobileActions.takeScreenshot();
        Assert.assertFalse(MobileActions.checkIfWebElementExists(getCardProduct(productName)),
                productName + " product not exist in wishlist");
        Helper.pass(productName + " product not exist in wishlist");
    }
}
