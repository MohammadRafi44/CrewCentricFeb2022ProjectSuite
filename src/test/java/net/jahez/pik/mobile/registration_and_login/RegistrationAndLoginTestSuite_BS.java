package net.jahez.pik.mobile.registration_and_login;

import com.example.base.ExcelManager;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import net.jahez.JahezModule;
import net.jahez.base.JahezMobileTest;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.Map;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;


public class RegistrationAndLoginTestSuite_BS extends JahezMobileTest {

    @Override
    public DesiredCapabilities addCapabilities(String testName) throws Exception {
        Map<String, String> data = ExcelManager.getMobileSettingsDetailsAsMap("Mobile_003");

        // Other Settings
        MobileDriverManager.appiumUrl = new URL(data.get("AppiumURL"));

        // Desired Capabilities
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        // Browser Stack Capabilities
        desiredCapabilities.setCapability("project", data.get("Project"));
        desiredCapabilities.setCapability("build", data.get("Build"));
        desiredCapabilities.setCapability("app", data.get("AppURL"));
        desiredCapabilities.setCapability("name", testName);

        // Device Capabilities
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, data.get("DeviceName"));
        if (data.get("PlatformName").equalsIgnoreCase("android")) {
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.VERSION, data.get("Version"));
            if (data.get("AutomationName").equalsIgnoreCase("uiautomator2")) {
                desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, ANDROID_UIAUTOMATOR2);
            } else {
                throw new Exception(data.get("AutomationName") + "  Automation Name not supported.");
            }
        } else if (data.get("PlatformName").equalsIgnoreCase("ios")) {
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, Platform.IOS);
        } else {
            throw new Exception(data.get("PlatformName") + "  platform not supported.");
        }

        // App Details
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, data.get("AppPackage"));
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, data.get("AppActivity"));

        // Other Capabilities
        desiredCapabilities.setCapability("newCommandTimeout", 100000);
        desiredCapabilities.setCapability("autoGrantPermissions", data.get("AutoGrantPermissions"));
        Helper.log(desiredCapabilities.toString());
        return desiredCapabilities;
    }


    // This Test will always Run in Browser Stack
    // as the Desired Capabilities are overridden
//    @Test(dataProvider = "testDataProvider", testName = "TC005", description = "As Customer_Customer SignIn_Verify System behavior when user enter correct mobile number but the password is incorrect")
//    public void registrationAndLoginTC005(Map<String, String> data) throws Exception {
//        JahezModule jahez = new JahezModule();
//        jahez.pikApp.pages.menu.navigateToMe();
//        jahez.pikApp.pages.profilePage.openSignInPopUp();
//        jahez.pikApp.pages.profilePage.fillSignInForm(data);
//        jahez.pikApp.pages.profilePage.signIn();
//        jahez.pikApp.pages.assertBannerDisplayed(data);
//    }
}