package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppCommonObjects.getBannerMessageObject;

public class PikAppPages {

    public final PikAppMenu menu;
    public final PikAppHomePage homePage;
    public final PikAppCategoriesPage categoriesPage;
    public final PikAppProfilePage profilePage;

    public PikAppPages() {
        menu = new PikAppMenu();
        homePage = new PikAppHomePage();
        categoriesPage = new PikAppCategoriesPage();
        profilePage = new PikAppProfilePage();
    }

    public void assertBannerDisplayed(Map<String, String> data) {
        boolean flag = false;
        for (int i = 1; i < 10; i++) {
            if (MobileActions.checkIfWebElementExists(getBannerMessageObject(data.get("BannerMessage")))) {
                flag = true;
                break;
            }
        }
        MobileActions.takeScreenshot();
        Assert.assertTrue(flag, "Banner displayed - " + data.get("BannerMessage"));
        Helper.log("Banner displayed - " + data.get("BannerMessage"));
    }

    public void enterOTP() {
        MobileActions.sleep(5);
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        MobileDriverManager.getDriver().pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        MobileActions.sleep(3);
    }
}
