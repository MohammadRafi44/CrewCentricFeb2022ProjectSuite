package net.jahez.pik.mobile.wishlist;

import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;


public class WishlistTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "As Customer_Wishlist_Validate that user can add products to wishlist", description = "")
    public void wishlistTC017(Map<String, String> data) throws IOException {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectCategory(data);
        jahez.pikApp.pages.categoriesPage.openShop(data);
        jahez.pikApp.pages.categoriesPage.openProduct(data);
        jahez.pikApp.pages.categoriesPage.addToWishlist();
        jahez.pikApp.pages.categoriesPage.assertWishlistHeartIconColor("#e53935");
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.categoriesPage.navigateBackToCategories(data);
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openAccountWishlistPage();
        jahez.pikApp.pages.profilePage.wishlistPage.assertProductExistInWishlist(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 2, testName = "As Customer_Wishlist_Validate that user can delete product from the wishlist", description = "")
    public void wishlistTC018(Map<String, String> data) throws IOException {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectCategory(data);
        jahez.pikApp.pages.categoriesPage.openShop(data);
        jahez.pikApp.pages.categoriesPage.openProduct(data);
        jahez.pikApp.pages.categoriesPage.removeFromWishlist();
        jahez.pikApp.pages.categoriesPage.assertWishlistHeartIconColor("#f9f9fb");
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.categoriesPage.navigateBackToCategories(data);
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openAccountWishlistPage();
        jahez.pikApp.pages.profilePage.wishlistPage.assertProductNotExistInWishlist(data);
    }
}