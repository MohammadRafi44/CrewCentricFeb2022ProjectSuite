package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.base.MobileDriverManager;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppHomePageObjects.BUTTON_Categories_Search;
import static net.jahez.pik.mobile.objects.PikAppHomePageObjects.TEXT_Categories_Search;

public class PikAppHomePage {

    public void searchCategory(Map<String, String> data) {
        MobileActions.click(BUTTON_Categories_Search, "Clicked on Categories Search icon");
        MobileActions.sleep(2);

        MobileActions.click(TEXT_Categories_Search);
        MobileActions.enterTextByKeyEvent(TEXT_Categories_Search, data.get("CategorySearchValue"),
                "Entered : " + data.get("CategorySearchValue"));
        MobileActions.sleep(1);

        MobileDriverManager.getDriver().hideKeyboard();
        MobileActions.sleep(1);
    }
}
