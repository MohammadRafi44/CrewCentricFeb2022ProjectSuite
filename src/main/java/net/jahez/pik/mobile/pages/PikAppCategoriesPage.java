package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import org.testng.Assert;

import java.io.IOException;
import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppCategoriesPageObjects.*;
import static net.jahez.pik.mobile.objects.PikAppProfileWishlistPageObjects.getCardProduct;

public class PikAppCategoriesPage {

    public void selectCategory(Map<String, String> data) {
        if (data.get("Category").equalsIgnoreCase("shops")) {
            MobileActions.click(Link_Shops, "Clicked on search product");
        } else {
            MobileActions.click(Link_Products, "Clicked on search product");
        }
        MobileActions.sleep(3);
    }

    public void openShop(Map<String, String> data) {
        MobileActions.click(getCardShop(data.get("ShopName")), "Clicked on Shop " + data.get("ShopName"));
        MobileActions.sleep(3);

        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }


    public void openProduct(Map<String, String> data) {
        MobileActions.click(getCardProduct(data.get("ProductName")), "Clicked on Product " + data.get("ProductName"));
        MobileActions.sleep(3);

        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }

    public void addToWishlist() throws IOException {
        if (MobileActions.getColourOfElement(Icon_WishlistHeart, "WishlistHeartIcon").equals("#e53935")) {
            MobileActions.click(Icon_WishlistHeart);
            MobileActions.sleep(3);
            MobileActions.takeScreenshot();
        }
        MobileActions.click(Icon_WishlistHeart, "Clicked on Wishlist heart icon");
        MobileActions.sleep(5);

        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }

    public void removeFromWishlist() throws IOException {
        if (!MobileActions.getColourOfElement(Icon_WishlistHeart, "WishlistHeartIcon").equals("#e53935")) {
            MobileActions.click(Icon_WishlistHeart);
            MobileActions.sleep(3);
            MobileActions.takeScreenshot();
        }
        MobileActions.click(Icon_WishlistHeart, "Clicked on Wishlist heart icon");
        MobileActions.sleep(5);

        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }

    public void assertWishlistHeartIconColor(String colour) throws IOException {
        String actualColor = MobileActions.getColourOfElement(Icon_WishlistHeart, "WishlistHeartIcon");
        Assert.assertEquals(actualColor, colour, "Wishlist Heart Icon Color " + actualColor);
        Helper.pass("Wishlist Heart Icon Color " + actualColor);
    }

    public void navigateBackToShop() {
        MobileActions.click(Icon_BackToShop, "Clicked on Back icon");
        MobileActions.sleep(3);
    }

    public void navigateBackToCategories(Map<String, String> data) {
        MobileActions.click(getIconBackToCategories(data.get("ShopName")), "Clicked on Back Icon of " + data.get("ShopName"));
        MobileActions.sleep(3);
        MobileDriverManager.getDriver().hideKeyboard();
        MobileActions.sleep(1);
    }
}
