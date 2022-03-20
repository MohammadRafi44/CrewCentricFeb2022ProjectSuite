package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppProfilePageObjects {

    // Button Objects
    public static final By BUTTON_Sign_up = By.xpath("//android.widget.Button[@content-desc='Sign Up']");
    public static final By BUTTON_Sign_In = By.xpath("//android.widget.Button[@content-desc='Sign In']");
    public static final By BUTTON_Sign_Out = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public static final By BUTTON_Sign_Out_Confirm = By.xpath("//android.view.View[@index=\"2\"]");
    public static final By BUTTON_Next = By.xpath("//android.widget.Button[@content-desc='Next']");

    // Element Objects
    public static By getElementProfile(String profileName) {
        String xpath = "//android.widget.ImageView[contains(@content-desc,'" + profileName + "')]";
        return By.xpath(xpath);
    }

    // LINKS Objects
    public static final By LINK_Sign_In = By.xpath("//android.view.View[contains(@content-desc,'Sign In') and contains(@content-desc,'Guest Account')]");
    public static final By LINK_Sign_Up = By.xpath("//android.view.View[@content-desc='Sign Up']");
    public static final By LINK_Back = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
    // Profile - Account Section Links
    public static final By Link_Account_MyAddresses = By.xpath("//android.view.View[@content-desc='My Addresses']");
    public static final By Link_Account_ChangePassword = By.xpath("//android.widget.ImageView[@content-desc='Change Password']");
    public static final By Link_Account_Payments = By.xpath("//android.view.View[@content-desc='Payments']");
    public static final By Link_Account_Wishlist = By.xpath("//android.widget.ImageView[@content-desc='Wishlist']");

    // Radio Objects
    public static final By RADIO_Gender_Male = By.xpath("//android.view.View[@content-desc='Male']/android.widget.RadioButton");
    public static final By RADIO_Gender_Female = By.xpath("//android.view.View[@content-desc='Female']/android.widget.RadioButton");

    // Text Objects
    public static final By TEXT_First_Name = By.xpath("//android.widget.EditText[@text='First Name']");
    public static final By TEXT_Email_Address = By.xpath("//android.widget.EditText[@text='Email Address']");
    public static final By TEXT_Contact_No = By.xpath("//android.widget.EditText[@text='Contact No']");
    public static final By TEXT_Password = By.xpath("//android.widget.EditText[@text='Password']");
    public static final By TEXT_Repeat_Password = By.xpath("//android.widget.EditText[@text='Repeat Password']");
    public static final By TEXT_Date_of_birth = By.xpath("//android.widget.EditText[@text='Date of birth (optional)']");
    public static final By TEXT_Mobile = By.xpath("//android.widget.EditText[@text='Mobile']");


    //Label Objects
    public static final By LABEL_Order_Id = By.xpath("//android.view.View[@index='4']");
    public static final By LABEL_Order_Cancel = By.xpath("//android.view.View[contains(@content-desc,'Cancelled')]");
    public static final By LABEL_Shopping_Cart = By.xpath("//android.widget.ImageView[contains(@content-desc,'Items')]");

    public static final By BUTTON_Add_To_Cart = By.xpath("//android.view.View[@content-desc='Add To Cart']");
    public static final By BUTTON_Add_Plus_To_Cart = By.xpath("//android.view.View[@index='4']");

    public static final By BUTTON_Proceed_Cart = By.xpath("//android.view.View[@index='7']");
    public static final By BUTTON_Cancel_Order = By.xpath("//android.widget.Button[@content-desc='Cancel Order']");
    public static final By BUTTON_Cancel_Yes = By.xpath("//android.widget.Button[@content-desc='Yes']");

    public static final By BUTTON_Continue_To_Purchase = By.xpath("//android.widget.Button[@content-desc='Continue']");
    public static final By BUTTON_Continue_Delivery = By.xpath("//android.widget.Button[@content-desc='Continue']");
    public static final By BUTTON_Cash_On_Delivery = By.xpath("//android.widget.ImageView[@content-desc='Cash On Delivery']");
    public static final By BUTTON_Place_Order = By.xpath("//android.widget.Button[@content-desc='Place Order']");

    public static final By BUTTON_Search_Product = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
    public static final By BUTTON_Shop = By.xpath("//android.widget.Button[@index=0]");


    public static final By BUTTON_My_Cart = By.xpath("//android.widget.ImageView[contains(@content-desc,'Cart')]");

    //Payments Objects
    public static final By TEXT_Search_Product = By.xpath("//android.widget.EditText[@text='Search']");
    public static final By BUTTON_Visa = By.xpath("//android.widget.ImageView[@content-desc='**** 0001']");
    public static final By BUTTON_MasterCard = By.xpath("//android.widget.ImageView[@content-desc='**** 2346']");
    public static final By BUTTON_Mada = By.xpath("//android.widget.ImageView[@content-desc='**** 5689']");

    /*@FindBy(xpath = "//android.widget.EditText[@text='Search']")
    public static WebElement TEXT_Search_Product;*/

//
//    Date :
////android.widget.Button[@content-desc="Cancel"]
////android.widget.Button[@content-desc="Done"]
//
////android.widget.SeekBar[@content-desc="2021"]
////android.widget.SeekBar[@content-desc="December"]
////android.widget.SeekBar[@content-desc="24"]
//
//
//    public static final By LINK_Sign_In = By.xpath("//android.view.View[@content-desc='Guest Account Sign In']");
//    public static final By LINK_Sign_In = By.xpath("//android.view.View[@content-desc='Guest Account Sign In']");

}
