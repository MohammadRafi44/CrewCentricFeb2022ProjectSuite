package net.jahez.pik.mobile.cart_and_checkout;

import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class CartAndCheckoutTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 3, testName = "TC04", description = "As Customer_Add  Item to Cart_Validate that user can add more than one item from the same product to cart")
    public void addMoreThanOneItemToCart(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.navigateToHome();
        jahez.pikApp.pages.profilePage.searchProduct(data);
        jahez.pikApp.pages.profilePage.selectMoreThanOneProduct(data);
    }

    @Test
    public void checkOutWithSelfPickUp() {
        System.out.println("cartAndCheckOutTC005");
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC06", description = "As Customer_Check out_Validate that user can check out with \"Delivery\" delivery type")
    public void checkOutWithDelivery(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.navigateToHome();
        jahez.pikApp.pages.profilePage.searchProduct(data);
        jahez.pikApp.pages.profilePage.selectSingleProductAndAddToCart(data);
        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        //jahez.pikApp.pages.profilePage.placeOrder(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 5, testName = "TC07", description = "As Customer_Check out_Validate that user can place order with \"Cash on Delivery\" payment method \n")
    public void placeAnOrderWithCashOnDelivery(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.navigateToHome();
        jahez.pikApp.pages.profilePage.searchProduct(data);
        jahez.pikApp.pages.profilePage.selectSingleProductAndAddToCart(data);

        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);
    }

    @Test
    public void placeAnOrderWithApplePay() {
        System.out.println("cartAndCheckOutTC008");
    }


    @Test(dataProvider = "testDataProvider", priority = 7, testName = "TC09", description = "As Customer_Check out_Validate that user can place order with \"Visa\" payment method")
    public void placeAnOrderWithVisa(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.navigateToHome();
        jahez.pikApp.pages.profilePage.searchProduct(data);
        jahez.pikApp.pages.profilePage.selectSingleProductAndAddToCart(data);
        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);

    }

    @Test(dataProvider = "testDataProvider", priority = 9, testName = "TC10", description = "As Customer_Check out_Validate that user can place order with \"Mada\" payment method \n")
    public void placeAnOrderWithMada(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.navigateToHome();
        jahez.pikApp.pages.profilePage.searchProduct(data);
        jahez.pikApp.pages.profilePage.selectSingleProductAndAddToCart(data);

        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 11, testName = "TC11", description = "As Customer_Check out_Validate that user can place order with \"Master Card\" payment method \n")
    public void placeAnOrderWithMasterCard(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.navigateToHome();
        jahez.pikApp.pages.profilePage.searchProduct(data);
        jahez.pikApp.pages.profilePage.selectSingleProductAndAddToCart(data);

        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);
    }


    @Test(dataProvider = "testDataProvider", testName = "TC12", description = "As Customer_Check out_Validate that user can place order and use wallet amount \n")
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

    @Test(dataProvider = "testDataProvider", priority = 11,testName = "TC014", description = "As Customer_Cancel order_Validate that user can cancel order")
    public void cancelOrder(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.profilePage.navigateToHome();
        jahez.pikApp.pages.profilePage.searchProduct(data);
        jahez.pikApp.pages.profilePage.selectSingleProductAndAddToCart(data);
        jahez.pikApp.pages.profilePage.deliveryToAddress(data);
        jahez.pikApp.pages.profilePage.placeOrder(data);
        jahez.pikApp.pages.profilePage.cancelProduct(data);
    }

    @Test
    public void deleteShopCart() {
        System.out.println("cartAndCheckOutTC015");
    }
}