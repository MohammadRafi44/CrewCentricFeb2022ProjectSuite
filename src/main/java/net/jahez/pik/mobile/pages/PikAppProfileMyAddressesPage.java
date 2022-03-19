package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppProfileMyAddressesPageObjects.*;

public class PikAppProfileMyAddressesPage {

    public void addNewAddress(Map<String, String> data) {
        MobileActions.click(Link_AddNew, "clicked on Add New Link");
        MobileActions.sleep(15);
        MobileActions.click(Button_ConfirmLocation, "clicked on Confirm Location");
        MobileActions.sleep(5);
        MobileActions.click(Text_NameOfAddress);
        MobileActions.sleep(5);
        MobileActions.enterTextByKeyEvent(Text_NameOfAddress, data.get("AddressName"), "");
        MobileActions.click(Button_Save, "clicked on Save");
        MobileActions.sleep(5);
    }

    public void deleteAllAddresses() {
        int items = MobileDriverManager.getDriver().findElements(getCardAddress("-")).size();
        while (items >= 1) {
            MobileActions.swipeLeft(getCardAddress("-"), 90);
            MobileActions.sleep(5);
            MobileActions.click(Button_Yes, "Clicked on Yes");
            MobileActions.sleep(5);
            --items;
        }
    }

    public void deleteAddresses(Map<String, String> data) {
        MobileActions.swipeLeft(getCardAddress(data.get("Address")), 90);
        MobileActions.sleep(5);
        MobileActions.click(Button_Yes, "Clicked on Yes");
        MobileActions.sleep(5);
    }

    // Assert Methods
    public void assertAddressExist(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(getCardAddress(data.get("Address"))),
                data.get("Address") + " Address exist");
        Helper.pass(data.get("Address") + " Address exist");
    }


    public void assertAddressNotExist(Map<String, String> data) {
        MobileActions.takeScreenshot();
        Assert.assertFalse(MobileActions.checkIfWebElementExists(getCardAddress(data.get("Address"))),
                data.get("Address") + " Address not exist");
        Helper.pass(data.get("Address") + " Address not exist");
    }

}

