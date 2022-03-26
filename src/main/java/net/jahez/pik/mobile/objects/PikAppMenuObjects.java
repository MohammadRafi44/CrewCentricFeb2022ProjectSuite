package net.jahez.pik.mobile.objects;

import org.openqa.selenium.By;

public class PikAppMenuObjects {

    // Menu Objects
    public static final By MENU_Home = By.xpath("//android.widget.ImageView[@content-desc='Home']");
    public static final By MENU_Categories = By.xpath("//android.widget.ImageView[@content-desc='Categories']");
    public static final By MENU_MyCart = By.xpath("//android.widget.ImageView[contains(@content-desc,'My Cart')]");
    public static final By MENU_MyOrders = By.xpath("//android.widget.ImageView[@content-desc='My Orders']");
    public static final By MENU_ME = By.xpath("//android.widget.ImageView[@content-desc='Me']");
}
