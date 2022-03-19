package net.jahez.pik.mobile.home_page;

import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class HomePageTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-026",
            description = "As Customer_Home page_Validate that user can search for product")
    public void searchForProduct(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectCategory(data);
        jahez.pikApp.pages.categoriesPage.assertProductCardDisplayed(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-027",
            description = "As Customer_Home page_Validate that user can search for shop")
    public void searchForShop(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectCategory(data);
        jahez.pikApp.pages.categoriesPage.assertShopCardDisplayed(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-028",
            description = "As Customer_Home page_Validate that user can search for shop")
    public void searchForNearByShop(Map<String, String> data) {
        System.out.println();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-029",
            description = "As Customer_Home page_Validate that the banners section exists at the top of the screen")
    public void validateTheBannersSection(Map<String, String> data) {
        System.out.println();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-030",
            description = "As Customer_Home page_Validate that the promotional filter section exists below banners section")
    public void validateThePromotionalFilterSection(Map<String, String> data) {
        System.out.println();
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-031",
            description = "As Customer_Home page_Validate that the home page section  exists below the promotional filter section")
    public void validateTheHomePageSection(Map<String, String> data) {
        System.out.println();
    }
}