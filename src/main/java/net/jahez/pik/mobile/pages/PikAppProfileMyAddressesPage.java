package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppProfileMyAddressesPageObjects.*;

public class PikAppProfileMyAddressesPage {

    public void addNewAddress(Map<String, String> data) {
        MobileActions.click(Link_AddNew, "clicked on Add New Link");
        MobileActions.sleep(15);
        MobileActions.click(Button_ConfirmLocation, "clicked on Confirm Location");
        MobileActions.sleep(5);
        MobileActions.enterText(Text_NameOfAddress, "Test");
        MobileActions.click(Button_ConfirmLocation, "clicked on Confirm Location");
        MobileActions.sleep(5);
    }
}

