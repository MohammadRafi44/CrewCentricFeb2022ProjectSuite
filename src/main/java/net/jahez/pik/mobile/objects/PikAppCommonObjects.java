package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppCommonObjects {

    // Banner Objects
    public static By getBannerMessageObject(String message) {
        String xpath = "//*[contains(@content-desc,'" + message + "')]";
        return By.xpath(xpath);
    }
}
