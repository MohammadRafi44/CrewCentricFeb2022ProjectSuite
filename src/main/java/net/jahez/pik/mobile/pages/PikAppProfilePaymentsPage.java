package net.jahez.pik.mobile.pages;

import com.example.base.MobileActions;
import com.example.utils.Helper;
import org.testng.Assert;

import java.util.Map;

import static net.jahez.pik.mobile.objects.PikAppProfilePaymentsPageObjects.*;

public class PikAppProfilePaymentsPage {

    public void addCard(Map<String, String> data) {
        MobileActions.click(LINK_Add_Card, "Clicked on Add New Card link");
        MobileActions.sleep(5);
        MobileActions.click(TEXT_Card_Number, "Clicked on Card Number input box");
        MobileActions.sleep(1);
        MobileActions.enterText(TEXT_Card_Number, data.get("CardNumber"),
                "Entered Card Number : " + data.get("CardNumber"));
        MobileActions.sleep(1);
        MobileActions.click(TEXT_Holder_Name, "Clicked on Holder name input box");
        MobileActions.sleep(1);
        MobileActions.enterText(TEXT_Holder_Name, data.get("HolderName"),
                "Entered Holder Name : " + data.get("HolderName"));
        MobileActions.sleep(2);
        MobileActions.click(TEXT_CVV, "Clicked on CVV input box");
        MobileActions.sleep(1);
        MobileActions.enterText(TEXT_CVV, data.get("CVV"), "Entered CVV : " + data.get("CVV"));
        MobileActions.sleep(2);
        MobileActions.click(TEXT_Month_Year, "Clicked on Month Year input box");
        MobileActions.sleep(1);
        MobileActions.enterText(TEXT_Month_Year, data.get("MonthYear"),
                "Entered Expiry Month and Year : " + data.get("MonthYear"));
        MobileActions.sleep(2);
        MobileActions.takeScreenshot();
        MobileActions.click(BUTTON_Add_Card, "clicked on Add Card");
    }

    public void backFromAddCard() {
        MobileActions.click(BUTTON_BackFromAddCard, "clicked on Back from Add Card");
        MobileActions.sleep(2);
    }

    // Assert Methods
    public void assertCardExist(Map<String, String> data) {
        String cardPartialDetails = data.get("CardPartialDetails");
        MobileActions.waitForElementAtIntervals(getElementCards(cardPartialDetails), 1, 5);
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(getElementCards(cardPartialDetails)),
                cardPartialDetails + " card exist");
        Helper.pass(cardPartialDetails + " card exist");
    }

    public void assertWalletBalanceDisplayed() {
        MobileActions.takeScreenshot();
        Assert.assertTrue(MobileActions.checkIfWebElementExists(Element_WalletBalance),
                "Wallet balance displayed.");
        Helper.pass("Wallet balance displayed.");
    }
}
