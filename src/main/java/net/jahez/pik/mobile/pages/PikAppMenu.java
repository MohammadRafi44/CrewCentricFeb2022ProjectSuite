package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;

import static net.jahez.pik.mobile.objects.PikAppMenuObjects.*;

public class PikAppMenu {

    public void navigateToHome() {
        MobileActions.click(MENU_Home, "Navigated to Home Page");
        MobileActions.sleep(2);
    }

    public void navigateToCategories() {
        MobileActions.click(MENU_Categories, "Navigated to Categories Page");
        MobileActions.sleep(2);
    }

    public void navigateToMyCart() {
        MobileActions.click(MENU_MyCart, "Navigated to My Cart Page");
        MobileActions.sleep(2);
    }

    public void navigateToMyOrders() {
        MobileActions.click(MENU_MyOrders, "Navigated to My Orders Page");
        MobileActions.sleep(2);
    }

    public void navigateToMe() {
        MobileActions.waitForElementAtIntervals(MENU_ME, 1, 5);
        MobileActions.click(MENU_ME, "Navigated to Me Page");
        MobileActions.sleep(2);
    }
}
