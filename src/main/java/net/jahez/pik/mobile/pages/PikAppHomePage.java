package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;
import com.example.utils.Helper;
import org.testng.Assert;

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
}
