package sa.gov.zatca.zatca.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static sa.gov.zatca.zatca.mobile.objects.ZatcaMobileHomePageObjects.BUTTON_Login;
import static sa.gov.zatca.zatca.mobile.objects.ZatcaMobileHomePageObjects.TEXT_TIN_Number;

public class ZatcaMobileHomePage {

    public void login(Map<String, String> data) {
        MobileActions.waitForElementAtIntervals(BUTTON_Login, 1, 1);
        MobileActions.sleep(2);
        MobileActions.click(TEXT_TIN_Number);
        MobileActions.enterTextByKeyEvent(TEXT_TIN_Number, data.get("TIN_Number"), "Entered : " + data.get("TIN_Number"));
        MobileActions.sleep(1);
        MobileDriverManager.getDriver().hideKeyboard();
        MobileActions.sleep(3);
    }

    public void assertHomePageDisplayed() {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(BUTTON_Login), "Home Page displayed.");
        Helper.log("Home Page displayed.");
    }
}
