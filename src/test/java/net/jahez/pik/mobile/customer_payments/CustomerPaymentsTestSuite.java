package net.jahez.pik.mobile.customer_payments;

import com.example.base.MobileActions;
import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class CustomerPaymentsTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-022",
            description = "As Customer_Payments_Validate that user can Add New Visa Card")
    public void addNewVisaCard(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.openAccountPaymentsPage();
        jahez.pikApp.pages.profilePage.paymentsPage.addCard(data);
        MobileActions.sleep(20);
        jahez.pikApp.pages.profilePage.paymentsPage.assertCardExist(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-023",
            description = "As Customer_Payments_Validate that user can Add New Mada Card")
    public void addNewMadaCard(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.openAccountPaymentsPage();
        jahez.pikApp.pages.profilePage.paymentsPage.addCard(data);
        MobileActions.sleep(20);
        // TODO Remove this after clarification
        jahez.pikApp.pages.profilePage.paymentsPage.backFromAddCard();
        jahez.pikApp.pages.profilePage.paymentsPage.assertCardExist(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-024",
            description = "As Customer_Payments_Validate that user can check wallet amount")
    public void checkWalletAmount(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.openAccountPaymentsPage();
        jahez.pikApp.pages.profilePage.paymentsPage.assertWalletBalanceDisplayed();
    }
}