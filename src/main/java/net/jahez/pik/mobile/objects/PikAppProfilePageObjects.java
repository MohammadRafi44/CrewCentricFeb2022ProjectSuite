package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppProfilePageObjects {

    // Button Objects
    public static final By BUTTON_Sign_up = By.xpath("//android.widget.Button[@content-desc='Sign Up']");
    public static final By BUTTON_Sign_In = By.xpath("//android.widget.Button[@content-desc='Sign In']");

    // LINKS Objects
    public static final By LINK_Sign_In = By.xpath("//android.view.View[contains(@content-desc,'Sign In') and contains(@content-desc,'Guest Account')]");

    public static final By LINK_Sign_Up = By.xpath("//android.view.View[@content-desc='Sign Up']");

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
