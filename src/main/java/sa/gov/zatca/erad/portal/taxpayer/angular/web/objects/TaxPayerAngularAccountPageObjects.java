package sa.gov.zatca.erad.portal.taxpayer.angular.web.objects;

import org.openqa.selenium.By;

public class TaxPayerAngularAccountPageObjects {

    // Button
    public static final By BUTTON_Continue = By.xpath("//span[contains(text(),'Continue')]");
    // Card
    public static By getCardAccountType(String accountType) {
        String xpath = "//p[@class='insideCard' and text()='" + accountType + "']";
        return By.xpath(xpath);
    }

    // Link
    public static final By Link_Back_CreateNewAccount = By.xpath("//span[contains(text(),'Back')]");
    public static final By Link_Back_Account = By.xpath("//div[contains(text(),'Back')]");
    public static final By Link_Back_ConsortiumCompany = By.xpath("//span[contains(text(),'Back')]");


    // Text
    public static final By Text_Consortium_Company_ID = By.xpath("//input[@formcontrolname='companyID']");
    public static final By Text_Consortium_Company_Name = By.xpath("//span[contains(text(),'Back')]");
    public static final By Text_Consortium_Contract_Number  = By.xpath("//span[contains(text(),'Back')]");
    public static final By Text_Consortium_Reporting_Branch  = By.xpath("//span[contains(text(),'Back')]");
    public static final By Text_Consortium_Mobile_Number  = By.xpath("//span[contains(text(),'Back')]");
    public static final By Text_Consortium_Email  = By.xpath("//span[contains(text(),'Back')]");
    public static final By Text_Consortium_Confirm_Email  = By.xpath("//span[contains(text(),'Back')]");
    public static final By Text_Consortium_Verification_Code  = By.xpath("//span[contains(text(),'Back')]");

    // Element
    public static final By Element_Spinner  = By.xpath("//mat-spinner");

    // Icon
    public static final By Icon_Refresh_Verification  = By.xpath("//mat-icon[contains(text(),'autorenew')]");

}
