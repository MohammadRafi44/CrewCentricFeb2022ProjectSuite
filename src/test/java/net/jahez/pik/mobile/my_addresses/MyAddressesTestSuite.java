package net.jahez.pik.mobile.my_addresses;

import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class MyAddressesTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-019",
            description = "As Customer_My Addresses_Validate that user can add new address")
    public void addNewAddress(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.openAccountMyAddressesPage();
        jahez.pikApp.pages.profilePage.myAddressesPage.deleteAllAddresses();
        jahez.pikApp.pages.profilePage.myAddressesPage.addNewAddress(data);
        // Workaround step remove once bug fixed
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openAccountMyAddressesPage();
        // Workaround step remove once bug fixed
        jahez.pikApp.pages.profilePage.myAddressesPage.assertAddressExist(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-020",
            description = "As Customer_Addresses_Validate that user can delete address")
    public void deleteAddress(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.openAccountMyAddressesPage();
        jahez.pikApp.pages.profilePage.myAddressesPage.deleteAllAddresses();
        jahez.pikApp.pages.profilePage.myAddressesPage.addNewAddress(data);
        // Workaround step remove once bug fixed
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openAccountMyAddressesPage();
        // Workaround step remove once bug fixed
        jahez.pikApp.pages.profilePage.myAddressesPage.assertAddressExist(data);
        jahez.pikApp.pages.profilePage.myAddressesPage.deleteAddresses(data);
        jahez.pikApp.pages.profilePage.myAddressesPage.assertAddressNotExist(data);
    }
}