package net.jahez.pik.mobile.cart_and_checkout;

import com.example.base.MobileActions;
import com.example.utils.Helper;
import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppProfilePageObjects.LABEL_Shopping_Cart;


public class CartAndCheckoutTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-004",
            description = "As Customer_Add  Item to Cart_Validate that user can add more than one item from the same product to cart")
    public void addMoreThanOneItemToCart(Map<String, String> data) {
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
        jahez.pikApp.pages.categoriesPage.addToCart(data);
        Helper.log("Cart Contains more than 1 item" + MobileActions.getText(LABEL_Shopping_Cart));
        // TODO assertions missing
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-005",
            description = "As Customer_Check out_Validate that user can check out with \"Self Pickup\" delivery type")
    public void checkOutWithSelfPickUp(Map<String, String> data) {
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
        // TODO assertions missing
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-006",
            description = "As Customer_Check out_Validate that user can check out with \"Delivery\" delivery type")
    public void checkOutWithDelivery(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectSingleProductAndAddToCart(data);
        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        //jahez.pikApp.pages.profilePage.placeOrder(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-007",
            description = "As Customer_Check out_Validate that user can place order with \"Cash on Delivery\" payment method \n")
    public void placeAnOrderWithCashOnDelivery(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectSingleProductAndAddToCart(data);
        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);
        // TODO assertions missing
    }

    @Test
    public void placeAnOrderWithApplePay() {
        System.out.println("cartAndCheckOutTC008");
    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-009",
            description = "As Customer_Check out_Validate that user can place order with \"Visa\" payment method")
    public void placeAnOrderWithVisa(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectSingleProductAndAddToCart(data);
        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);

    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-010",
            description = "As Customer_Check out_Validate that user can place order with \"Mada\" payment method \n")
    public void placeAnOrderWithMada(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectSingleProductAndAddToCart(data);

        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-011",
            description = "As Customer_Check out_Validate that user can place order with \"Master Card\" payment method \n")
    public void placeAnOrderWithMasterCard(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectSingleProductAndAddToCart(data);

        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);
    }


    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-012",
            description = "As Customer_Check out_Validate that user can place order and use wallet amount \n")
    public void placeAnOrderWithWalletAmount(Map<String, String> data) {
        System.out.println("cartAndCheckOutTC013");
    }

    @Test
    public void CheckPymtDetailsB4PlacingAnOrder() {
        System.out.println("cartAndCheckOutTC013");
    }

    @Test
    public void CheckOrderDetailsB4PlacingAnOrder() {
        System.out.println("cartAndCheckOutTC013");
    }

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-014",
            description = "As Customer_Cancel order_Validate that user can cancel order")
    public void cancelOrder(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectSingleProductAndAddToCart(data);
        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);
        jahez.pikApp.pages.profilePage.cancelProduct(data);
    }

    @Test
    public void deleteShopCart() {
        System.out.println("cartAndCheckOutTC015");
    }
}