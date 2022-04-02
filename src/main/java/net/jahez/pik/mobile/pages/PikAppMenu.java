package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;

import static net.jahez.pik.mobile.objects.PikAppMenuObjects.*;

public class PikAppMenu {

    public void navigateToHome() {
        MobileActions.waitForElementAtIntervals(MENU_Home, 1, 1);
        MobileActions.click(MENU_Home, "Navigated to Home Page");
    }

    public void navigateToCategories() {
        MobileActions.click(MENU_Categories, "Navigated to Categories Page");
    }

    public void navigateToMyCart() {
        MobileActions.click(MENU_MyCart, "Navigated to My Cart Page");
    }

    public void navigateToMyOrders() {
        MobileActions.click(MENU_MyOrders, "Navigated to My Orders Page");
    }

    public void navigateToMe() {
        MobileActions.waitForElementAtIntervals(MENU_ME, 1, 1);
        MobileActions.click(MENU_ME, "Navigated to Me Page");
    }
}
