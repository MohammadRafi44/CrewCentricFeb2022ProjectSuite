package net.jahez.pik.mobile.cart_and_checkout;

import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.testng.annotations.Test;

import java.util.Map;


public class CartAndCheckoutTestSuite extends JahezMobileTest {

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-004",
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
        jahez.pikApp.pages.categoriesPage.assertItemCartQuantityValue(data);
        jahez.pikApp.pages.categoriesPage.assertAddToCartDesignChanged();
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-005",
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
        jahez.pikApp.pages.categoriesPage.addToCart(data);
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertDeliveryAddress(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentMethod(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.placeOrder();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.assertOrderDetailsPageDisplayed();
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-006",
            description = "As Customer_Check out_Validate that user can check out with \"Delivery\" delivery type")
    public void checkOutWithDelivery(Map<String, String> data) {
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
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertDeliveryAddress(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentMethod(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.placeOrder();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.assertOrderDetailsPageDisplayed();
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-007",
            description = "As Customer_Check out_Validate that user can place order with \"Cash on Delivery\" payment method \n")
    public void placeAnOrderWithCashOnDelivery(Map<String, String> data) {
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
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertDeliveryAddress(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentMethod(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.placeOrder();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.assertOrderDetailsPageDisplayed();
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-009",
            description = "As Customer_Check out_Validate that user can place order with \"Visa\" payment method")
    public void placeAnOrderWithVisa(Map<String, String> data) {
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
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertDeliveryAddress(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentMethod(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.placeOrder();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.assertOrderDetailsPageDisplayed();
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-010",
            description = "As Customer_Check out_Validate that user can place order with \"Mada\" payment method \n")
    public void placeAnOrderWithMada(Map<String, String> data) {
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
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertDeliveryAddress(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentMethod(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.placeOrder();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.assertOrderDetailsPageDisplayed();
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-011",
            description = "As Customer_Check out_Validate that user can place order with \"Master Card\" payment method \n")
    public void placeAnOrderWithMasterCard(Map<String, String> data) {
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
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertDeliveryAddress(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentMethod(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.placeOrder();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.assertOrderDetailsPageDisplayed();
    }


    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-012",
            description = "As Customer_Check out_Validate that user can place order and use wallet amount \n")
    public void placeAnOrderWithWalletAmount(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.deleteShop(data);
        jahez.pikApp.pages.myCartPage.assertShopDeleted(data);
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectCategory(data);
        jahez.pikApp.pages.categoriesPage.openShop(data);
        jahez.pikApp.pages.categoriesPage.openProduct(data);
        jahez.pikApp.pages.categoriesPage.addToCart(data);
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertDeliveryAddress(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentMethod(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertUseWalletAmountSelected();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentDetails(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.placeOrder();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.assertOrderDetailsPageDisplayed();
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-013",
            description = "As Customer_Check out_Validate that user can check payments details before placing order")
    public void CheckPymtDetailsB4PlacingAnOrder(Map<String, String> data) {
        JahezModule jahez = new JahezModule();
        jahez.pikApp.pages.menu.navigateToMe();
        jahez.pikApp.pages.profilePage.openSignInPopUp();
        jahez.pikApp.pages.profilePage.fillSignInForm(data);
        jahez.pikApp.pages.profilePage.signIn();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.deleteShop(data);
        jahez.pikApp.pages.myCartPage.assertShopDeleted(data);
        jahez.pikApp.pages.menu.navigateToHome();
        jahez.pikApp.pages.homePage.searchCategory(data);
        jahez.pikApp.pages.categoriesPage.selectCategory(data);
        jahez.pikApp.pages.categoriesPage.openShop(data);
        jahez.pikApp.pages.categoriesPage.openProduct(data);
        jahez.pikApp.pages.categoriesPage.addToCart(data);
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertDeliveryAddress(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentMethod(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentDetails(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-014",
            description = "As Customer_Check out_Validate that user can check order details before placing order")
    public void CheckOrderDetailsB4PlacingAnOrder(Map<String, String> data) {
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
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertDeliveryAddress(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertPaymentMethod(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.assertProductDetails(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-015",
            description = "As Customer_Cancel order_Validate that user can cancel order")
    public void cancelOrder(Map<String, String> data) {
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
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.expandShop(data);
        jahez.pikApp.pages.myCartPage.continueShoppingCart();
        jahez.pikApp.pages.myCartPage.deliveryPage.selectDeliveryType(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.continueDeliveryType();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.selectPaymentMethods(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.placeOrder();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.assertOrderDetailsPageDisplayed();
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.cancelOrder(data);
        jahez.pikApp.pages.myCartPage.deliveryPage.confirmOrderPage.orderDetailsPage.assertOrderCancelled(data);
    }

    @Test(dataProvider = "testDataProvider", priority = 4, testName = "TC-016",
            description = "As Customer_My Cart_Validate that user can delete shop cart")
    public void deleteShopCart(Map<String, String> data) {
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
        jahez.pikApp.pages.categoriesPage.navigateBackToShop();
        jahez.pikApp.pages.menu.navigateToMyCart();
        jahez.pikApp.pages.myCartPage.deleteShop(data);
        jahez.pikApp.pages.myCartPage.assertShopDeleted(data);
    }
}