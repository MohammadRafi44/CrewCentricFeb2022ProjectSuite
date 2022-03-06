package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;

import static net.jahez.pik.mobile.objects.PikAppMenuObjects.*;

public class PikAppMenu {

    public void navigateToMe() {
        MobileActions.waitForElementAtIntervals(MENU_ME, 1, 5);
        MobileActions.click(MENU_ME);
    }
}
