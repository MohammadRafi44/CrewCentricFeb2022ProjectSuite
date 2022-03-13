package net.jahez.pik.mobile.customer_payments;

import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class CustomerPaymentsTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 6,testName = "TC22", description = "As Customer_Payments_Validate that user can Add New Visa Card")
    public void customerPaymentsTC022(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.addCard(data);
    }


    @Test(dataProvider = "testDataProvider", priority = 8, testName = "TC23", description = "As Customer_Payments_Validate that user can Add New Mada Card")
    public void customerPaymentsTC023(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.addCard(data);
    }
    @Test(dataProvider = "testDataProvider", priority = 10, testName = "TC24", description = "As Customer_Payments_Validate that user can Add New Master Card")
    public void customerPaymentsTC024(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.addCard(data);
    }
}