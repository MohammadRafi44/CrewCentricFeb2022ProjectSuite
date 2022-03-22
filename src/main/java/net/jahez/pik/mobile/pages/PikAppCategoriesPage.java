package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import org.testng.Assert;

import java.io.IOException;
import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppCategoriesPageObjects.*;
import static net.jahez.pik.mobile.objects.PikAppProfilePageObjects.*;

public class PikAppCategoriesPage {

    public void selectCategory(Map<String, String> data) {
        if (data.get("Category").equalsIgnoreCase("shops")) {
            MobileActions.click(Link_Shops, "Clicked on Shops");
        } else {
            MobileActions.click(Link_Products, "Clicked on Products");
        }
        MobileActions.sleep(3);
    }

    public void openShop(Map<String, String> data) {
        MobileActions.click(getCardShop(data.get("ShopName")),
                "Clicked on Shop " + data.get("ShopName"));
        MobileActions.sleep(3);

        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }

    public void openProduct(Map<String, String> data) {
        MobileActions.click(getCardProduct(data.get("ProductName")),
                "Clicked on Product " + data.get("ProductName"));
        MobileActions.sleep(3);

        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }

    public void addToWishlist() throws IOException {
        if (MobileActions.getColourOfElement(Icon_WishlistHeart, "WishlistHeartIcon").equals("#e53935")) {
            MobileActions.click(Icon_WishlistHeart);
            MobileActions.sleep(10);
            MobileActions.takeScreenshot();
        }
        MobileActions.click(Icon_WishlistHeart, "Clicked on Wishlist heart icon");
        MobileActions.sleep(10);

        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }

    public void removeFromWishlist() throws IOException {
        if (!MobileActions.getColourOfElement(Icon_WishlistHeart, "WishlistHeartIcon").equals("#e53935")) {
            MobileActions.click(Icon_WishlistHeart);
            MobileActions.sleep(10);
            MobileActions.takeScreenshot();
        }
        MobileActions.click(Icon_WishlistHeart, "Clicked on Wishlist heart icon");
        MobileActions.sleep(10);

        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }

    public void selectSingleProductAndAddToCart(Map<String, String> data) {
        MobileActions.click(BUTTON_Add_To_Cart, "clicked on Add To Product");
        MobileActions.sleep(3);
        MobileActions.click(BUTTON_Proceed_Cart, "clicked on Proceed to Cart");
        MobileActions.sleep(3);
    }

    public void addToCart(Map<String, String> data) {
        for (int i = 1; i < Integer.parseInt(data.get("Quantity")); i++) {
            MobileActions.click(BUTTON_Add_Plus_To_Cart, "clicked on the + to add one more item");
            MobileActions.sleep(3);
        }
        MobileActions.click(BUTTON_Add_To_Cart, "clicked on Add To Product");
        MobileActions.sleep(4);
    }

    public void navigateBackToShop() {
        MobileActions.click(Icon_BackToShop, "Clicked on Back icon");
        MobileActions.sleep(3);
    }

    public void navigateBackToCategories(Map<String, String> data) {
        MobileActions.click(getIconBackToCategories(data.get("ShopName")),
                "Clicked on Back Icon of " + data.get("ShopName"));
        MobileActions.sleep(3);
        MobileDriverManager.getDriver().hideKeyboard();
        MobileActions.sleep(1);
    }

    // Assert Methods
    public void assertProductCardDisplayed(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(getCardProduct(data.get("ProductName"))),
                data.get("ProductName") + " Product displayed");
        Helper.pass(data.get("ProductName") + " Product displayed");
    }

    public void assertShopCardDisplayed(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(getCardShop(data.get("ShopName"))),
                data.get("ShopName") + " Shop displayed");
        Helper.pass(data.get("ShopName") + " Shop displayed");
    }

    public void assertWishlistHeartIconColor(String colour) throws IOException {
        String actualColor = MobileActions.getColourOfElement(Icon_WishlistHeart, "WishlistHeartIcon");
        Assert.assertEquals(actualColor, colour, "Wishlist Heart Icon Color " + actualColor);
        Helper.pass("Wishlist Heart Icon Color " + actualColor);
    }

    public void assertItemCartQuantityValue(Map<String, String> data) {
        MobileActions.takeScreenshot();
        String actualQuantity = MobileActions.getAttribute(Element_CartQuantity, "content-desc");
        Assert.assertEquals(actualQuantity, data.get("Quantity"), "Item Cart Quantity");
        Helper.pass("Item Cart Quantity is " + data.get("Quantity"));
    }

    public void assertAddToCartDesignChanged() {
        Assert.assertFalse(MobileActions.checkIfWebElementExists(BUTTON_Add_To_Cart), "Add to cart Button design not Changed.");
        Helper.pass("Add to cart Button design Changed.");
    }
}
