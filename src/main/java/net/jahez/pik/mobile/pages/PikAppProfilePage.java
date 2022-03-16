package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppMenuObjects.MENU_Home;
import static net.jahez.pik.mobile.objects.PikAppProfilePageObjects.*;


public class PikAppProfilePage {

    public final PikAppProfileWishlistPage wishlistPage;

    public PikAppProfilePage() {
        wishlistPage = new PikAppProfileWishlistPage();
    }

    public void openSignInPopUp() {
        MobileActions.waitForElementAtIntervals(LINK_Sign_In, 1, 5);
        TouchAction action = new TouchAction(MobileDriverManager.getDriver());
        action.tap(PointOption.point(355, 408)).release().perform();
        // TODO Need to Handle in a generic way.
    }

    public void openSignUpPopUp() {
        MobileActions.waitForElementAtIntervals(LINK_Sign_Up, 1, 5);
        MobileActions.click(LINK_Sign_Up);
        MobileActions.sleep(2);
    }

    public void fillSignUpForm(Map<String, String> data) {
        MobileActions.waitForElementAtIntervals(TEXT_First_Name, 1, 10);
        MobileActions.click(TEXT_First_Name);
        MobileActions.sleep(10);
        MobileActions.enterText(TEXT_First_Name, data.get("FirstName"), "Entered FirstName : " + data.get("FirstName"));
        MobileActions.click(TEXT_Email_Address);
        MobileActions.enterText(TEXT_Email_Address, data.get("EmailAddress"), "Entered EmailAddress : " + data.get("EmailAddress"));
        MobileActions.sleep(1);
        MobileActions.click(TEXT_Contact_No);
        MobileActions.enterText(TEXT_Contact_No, data.get("ContactNo"), "Entered ContactNo : " + data.get("ContactNo"));
        MobileActions.sleep(1);
        if (data.get("Gender").equalsIgnoreCase("male")) {
            MobileActions.click(RADIO_Gender_Male);
        } else if (data.get("Gender").equalsIgnoreCase("female")) {
            MobileActions.click(RADIO_Gender_Female);
        }
        MobileActions.sleep(1);
        // TODO Implement Date of Birth
        MobileActions.scroll(-700);
        MobileActions.click(TEXT_Password);
        MobileActions.enterText(TEXT_Password, data.get("Password"), "Entered Password : " + data.get("Password"));
        MobileActions.sleep(1);
        MobileActions.click(TEXT_Repeat_Password);
        MobileActions.enterText(TEXT_Repeat_Password, data.get("RepeatPassword"), "Entered RepeatPassword : " + data.get("RepeatPassword"));
        MobileActions.sleep(1);
    }

    public void signUp() {
        MobileActions.click(BUTTON_Sign_up);
    }

    public void fillSignInForm(Map<String, String> data) {
        MobileActions.waitForElementAtIntervals(TEXT_Mobile, 1, 10);
        MobileActions.click(TEXT_Mobile);
        MobileActions.sleep(2);
        MobileActions.enterText(TEXT_Mobile, data.get("MobileNumber"), "Entered Mobile Number");
        MobileActions.click(TEXT_Password);
        MobileActions.sleep(2);
        MobileActions.enterText(TEXT_Password, data.get("Password"), "Entered Password");
        MobileActions.sleep(3);
    }

    public void signIn() {
        MobileActions.click(BUTTON_Sign_In);
        MobileActions.sleep(8);
        MobileActions.takeScreenshot();
    }

    public void signOut() {
        MobileActions.click(BUTTON_Sign_Out, "Clicked on Sign out");
        MobileActions.sleep(2);
        MobileActions.click(BUTTON_Sign_Out_Confirm, "User logged out successfully!");
        MobileActions.sleep(3);
        MobileActions.takeScreenshot();
    }

    public void profileValidation() {
        MobileActions.getText(TEXT_Profile_Name);
        MobileActions.sleep(2);
    }

    @Deprecated
    // This Method should be consumed from Menu Page - Implemented wrongly in profile page.
    public void navigateToHome() {
        MobileActions.click(MENU_Home, "Navigated to Home Page");
        MobileActions.sleep(2);
    }

    @Deprecated
    // This Method should be consumed from Home Page - Implemented wrongly in profile page.
    // Method Name to be generic - Implementing in Home Page
    public void searchProduct(Map<String, String> data) {
        MobileActions.click(BUTTON_Search_Product, "Clicked on search product");
        MobileActions.sleep(2);

        MobileActions.enterTextWithBackSpace(TEXT_Search_Product, data.get("ShopName"), "Entered Shop Name : " + data.get("ShopName"));
        MobileActions.sleep(1);
       /* MobileActions.enterText(TEXT_Search_Product,data.get("ShopName"), "Entered Shop Name : " + data.get("ShopName"));
        MobileActions.sleep(1);*/

        MobileDriverManager.getDriver().hideKeyboard();
        MobileActions.sleep(1);

        MobileActions.click(BUTTON_Shop, "Clicked on Shop");
        MobileActions.sleep(3);

        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
    }

    public void selectSingleProductAndAddToCart(Map<String, String> data) {

        MobileActions.click(BUTTON_Select_Product, "clicked on product");
        MobileActions.sleep(2);
        MobileActions.click(BUTTON_Add_To_Cart, "clicked on Add To Product");
        MobileActions.sleep(3);
        MobileActions.click(BUTTON_Proceed_Cart, "clicked on Proceed to Cart");
        MobileActions.sleep(3);
    }

    public void selectMoreThanOneProduct(Map<String, String> data) {

        MobileActions.click(BUTTON_Select_Product, "clicked on product");
        MobileActions.sleep(2);
        MobileActions.click(BUTTON_Add_Plus_To_Cart, "clicked on the + to add one more item");
        MobileActions.sleep(3);
        MobileActions.click(BUTTON_Add_To_Cart, "clicked on Add To Product");
        MobileActions.sleep(4);
        MobileActions.click(LINK_Back, "clicked on Back");
        MobileActions.sleep(2);
        MobileActions.click(BUTTON_My_Cart, "clicked on My Cart");
        MobileActions.sleep(3);
        Helper.log("Cart Contains more than 1 item" + MobileActions.getText(LABEL_Shopping_Cart));
        MobileActions.sleep(3);
    }

    public void deliveryToAddress(Map<String, String> data) {
        MobileActions.click(BUTTON_Continue_To_Purchase, "clicked on Continue To Purchase");
        MobileActions.sleep(2);
        MobileActions.click(BUTTON_Continue_Delivery, "clicked on Continue To Deliver to the Address");
        MobileActions.sleep(3);
        switch (data.get("CardType")) {
            case "MADA":
                MobileActions.click(BUTTON_Mada, "clicked on Mada payment method");
                break;
            case "VISA":
                MobileActions.click(BUTTON_Visa, "clicked on Visa payment method");
                break;
            case "MASTERCARD":
                MobileActions.click(BUTTON_MasterCard, "clicked on MasterCard payment method");
                break;
            default:
                MobileActions.click(BUTTON_Cash_On_Delivery, "clicked on Continue To Cash On Delivery");
                break;

        }

        MobileActions.sleep(3);
    }

    public void placeOrder(Map<String, String> data) {
        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
        MobileActions.click(BUTTON_Place_Order, "clicked on Place Order");
        MobileActions.sleep(3);
        MobileActions.takeScreenshot();
        MobileActions.sleep(2);
        Helper.log("Order Id: " + MobileActions.getText(LABEL_Order_Id));
        MobileActions.sleep(1);
    }

    public void cancelProduct(Map<String, String> data) {
        MobileActions.click(BUTTON_Cancel_Order, "clicked on Cancel Order");
        MobileActions.sleep(2);
        MobileActions.click(BUTTON_Cancel_Yes, "clicked on Cancel Yes");
        MobileActions.sleep(2);
        Helper.log("Order Cancelled Successfully! " + MobileActions.getText(LABEL_Order_Cancel));
        MobileActions.sleep(2);
    }

    public void addCard(Map<String, String> data) {
        MobileActions.click(LINK_Payments, "Clicked on Payments");
        MobileActions.sleep(1);
        MobileActions.click(LINK_Add_Card, "Clicked on Add New Card link");
        MobileActions.sleep(1);

        MobileActions.click(TEXT_Card_Number, "Clicked on Card Number input box");
        MobileActions.sleep(1);
        MobileActions.enterText(TEXT_Card_Number, data.get("CardNumber"), "Entered Card Number : " + data.get("CardNumber"));
        MobileActions.sleep(1);
        MobileActions.click(TEXT_Holder_Name, "Clicked on Holder name input box");
        MobileActions.sleep(1);
        MobileActions.enterText(TEXT_Holder_Name, data.get("HolderName"), "Entered Holder Name : " + data.get("HolderName"));
        MobileActions.sleep(2);
        MobileActions.click(TEXT_CVV, "Clicked on CVV input box");
        MobileActions.sleep(1);
        MobileActions.enterText(TEXT_CVV, data.get("CVV"), "Entered CVV : " + data.get("CVV"));
        MobileActions.sleep(2);
        MobileActions.click(TEXT_Month_Year, "Clicked on Month Year input box");
        MobileActions.sleep(1);
        MobileActions.enterText(TEXT_Month_Year, data.get("MonthYear"), "Entered Expiry Month and Year : " + data.get("MonthYear"));
        MobileActions.sleep(2);
        switch (data.get("HolderName")) {
            case "VisaCard":
                MobileActions.click(BUTTON_Add_Card, "clicked on Add Visa Card");
                MobileActions.sleep(15);
                break;
            case "MadaCard":
                MobileActions.click(BUTTON_Add_Mada_Card, "clicked on Add Mada Card");
                MobileActions.sleep(10);
                MobileActions.click(BUTTON_Back_From_Mada, "clicked on back from Add card");
                MobileActions.sleep(3);
                break;
            case "MasterCard":
                MobileActions.click(BUTTON_Add_Card, "clicked on Add Master Card");
                MobileActions.sleep(15);
                break;
            default:

                break;

        }
        MobileActions.takeScreenshot();
        MobileActions.sleep(1);
        Helper.log("Card added successfully");

    }

    public void openAccountWishlistPage() {
        MobileActions.click(Link_Account_Wishlist, "clicked on Account Wishlist");
        MobileActions.sleep(15);
    }

    public void openAccountMyAddressesPage() {
    }
}
