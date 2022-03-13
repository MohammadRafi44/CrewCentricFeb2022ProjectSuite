package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PikAppProfilePageObjects {

    //Label Objects
    public static final By LABEL_Order_Id = By.xpath("//android.view.View[@index='4']");
    public static final By LABEL_Order_Cancel = By.xpath("//android.view.View[contains(@content-desc,'Cancelled')]");
    public static final By LABEL_Shopping_Cart = By.xpath("//android.widget.ImageView[contains(@content-desc,'Items')]");

    // Button Objects
    public static final By BUTTON_Sign_up = By.xpath("//android.widget.Button[@content-desc='Sign Up']");
    public static final By BUTTON_Sign_In = By.xpath("//android.widget.Button[@content-desc='Sign In']");
    public static final By BUTTON_Sign_Out = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public static final By BUTTON_Sign_Out_Confirm = By.xpath("//android.view.View[@index=\"2\"]");
    public static final By BUTTON_Select_Product = By.xpath("//android.widget.ImageView[@index='0']");
    public static final By BUTTON_Add_To_Cart = By.xpath("//android.view.View[@content-desc='Add To Cart']");
    public static final By BUTTON_Add_Plus_To_Cart = By.xpath("//android.view.View[@index='4']");

    public static final By BUTTON_Proceed_Cart = By.xpath("//android.view.View[@index='7']");
    public static final By BUTTON_Cancel_Order = By.xpath("//android.widget.Button[@content-desc='Cancel Order']");
    public static final By BUTTON_Cancel_Yes = By.xpath("//android.widget.Button[@content-desc='Yes']");

    public static final By BUTTON_Continue_To_Purchase = By.xpath("//android.widget.Button[@content-desc='Continue']");
    public static final By BUTTON_Continue_Delivery = By.xpath("//android.widget.Button[@content-desc='Continue']");
    public static final By BUTTON_Cash_On_Delivery = By.xpath("//android.widget.ImageView[@content-desc='Cash On Delivery']");
    public static final By BUTTON_Place_Order = By.xpath("//android.widget.Button[@content-desc='Place Order']");

    public static final By BUTTON_Add_Card = By.xpath("//android.view.View[@index='7']");
    public static final By BUTTON_Add_Mada_Card = By.xpath("(//android.view.View[@content-desc=\"Add Card\"])[2]");

    public static final By BUTTON_Back_From_Mada = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
    public static final By BUTTON_Visa_Card = By.xpath("//android.widget.ImageView[@content-desc='**** 0001']");


    public static final By BUTTON_Search_Product = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button[1]");
    public static final By BUTTON_Shop = By.xpath("//android.widget.Button[@index=0]");


    public static final By BUTTON_My_Cart = By.xpath("//android.widget.ImageView[contains(@content-desc,'Cart')]");

    public static final By BUTTON_CashOnDelivery = By.xpath("//android.widget.ImageView[@content-desc='Cash On Delivery']");
    public static final By BUTTON_Visa = By.xpath("//android.widget.ImageView[@content-desc='**** 0001']");
    public static final By BUTTON_MasterCard = By.xpath("//android.widget.ImageView[@content-desc='**** 2346']");
    public static final By BUTTON_Mada = By.xpath("//android.widget.ImageView[@content-desc='**** 5689']");
    // LINKS Objects
    public static final By LINK_Sign_In = By.xpath("//android.view.View[contains(@content-desc,'Sign In') and contains(@content-desc,'Guest Account')]");

    public static final By LINK_Sign_Up = By.xpath("//android.view.View[@content-desc='Sign Up']");

    public static final By LINK_Back = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");



    //Payments Objects
    public static final By LINK_Payments =By.xpath(("//android.view.View[@content-desc='Payments']"));
    public static final By LINK_Add_Card =By.xpath(("//android.view.View[@content-desc='+ Add New Card']"));


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
    public static final By TEXT_Search_Product = By.xpath("//android.widget.EditText[@text='Search']");


    public static final By TEXT_Card_Number =By.xpath(("//android.widget.EditText[@text='Card number']"));
    public static final By TEXT_Holder_Name =By.xpath(("//android.widget.EditText[@text='Holder name']"));

    public static final By TEXT_CVV =By.xpath(("//android.widget.EditText[@text='CVV']"));
    public static final By TEXT_Month_Year =By.xpath(("//android.widget.EditText[@text='Month/Year']"));


    /*@FindBy(xpath = "//android.widget.EditText[@text='Search']")
    public static WebElement TEXT_Search_Product;*/

    //Profile Objects
    public static final By TEXT_Profile_Name = By.xpath("//android.widget.ImageView[contains(@content-desc,'Automation')]");


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
