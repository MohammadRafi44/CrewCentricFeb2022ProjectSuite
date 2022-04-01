package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.testng.Assert;

import java.time.Duration;
import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppHomePageObjects.*;

public class PikAppHomePage {

    public void searchCategory(Map<String, String> data) {
        MobileActions.click(BUTTON_Categories_Search, "Clicked on Categories Search icon");
        MobileActions.sleep(2);

        MobileActions.click(TEXT_Categories_Search);
        MobileActions.enterTextByKeyEvent(TEXT_Categories_Search, data.get("CategorySearchValue"),
                "Entered : " + data.get("CategorySearchValue"));
        MobileActions.sleep(1);

        MobileDriverManager.getDriver().hideKeyboard();
        MobileActions.sleep(5);
    }

    public void assertHomePageDisplayed() {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(BUTTON_NewIn), "Home Page displayed.");
        Helper.log("Home Page displayed.");
    }
    public void assertBannerSectionDisplayed() {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(Banner_Section), "Banner Section displayed.");
        Helper.log("Banner Section displayed.");
    }
    public void PromotionalFilterSectionDisplayed() {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(Promotional_Filter), "Promotional Filter Section displayed.");
        Helper.log("Promotional Filter Section displayed.");
    }
    public void HomePageSectionDisplayed() {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(HomePage_section), "Home Page Section displayed.");
        Helper.log("Home Page Section displayed.");
    }
    public static void swipeUp(){
        Dimension size = MobileDriverManager.getDriver().manage ()
                .window ()
                .getSize ();
        int startX = Math.toIntExact(Math.round(size.width * 0.1));
        int startY = Math.toIntExact(Math.round(size.height* 0.8));
        int endX = Math.toIntExact(Math.round(size.width * 0.1));
        int endY = Math.toIntExact(Math.round(size.height* 0.2));
        TouchAction action = new TouchAction(MobileDriverManager.getDriver());
        action.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo (PointOption.point(endX, endY))
                .release ()
                .perform ();
    }

    public void NearByShopsSectionDisplayed() {
        boolean done=false;
        int i = 0;
        while (!done && i++ < 10) {
            swipeUp();
            if (MobileActions.checkIfWebElementExists(Near_By_Shops)) {
                MobileActions.takeScreenshot();
                Assert.assertTrue(MobileActions.checkIfWebElementExists(Near_By_Shops), "Near By Shops Section displayed.");
                Helper.log("Near By Shops Section displayed.");
                done = true;
            }else
                Helper.log("Near By Shops Section is not displayed.");
        }
    }
}
