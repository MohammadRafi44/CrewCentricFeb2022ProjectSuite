package sa.gov.zatca.erad.portal.taxpayer.angular.web;

import org.testng.annotations.Test;
import sa.gov.zatca.ZatcaModule;
import sa.gov.zatca.base.ZatcaWebTest;

import java.util.Map;


public class ZakatAndTaxSingUpTestSuite extends ZatcaWebTest {

    @Test(dataProvider = "testDataProvider", priority = 1, testName = "TC-001",
            description = "Sign up in Zakat And Tax Portal as Consortium Company.")
    public void zakatAndTaxSignUpConsortiumCompany(Map<String, String> data) {
        ZatcaModule zatca = new ZatcaModule();
        zatca.erad.portal.taxpayer.angular.openApplication(data);
        zatca.erad.portal.taxpayer.angular.loginPage.openSignUpPage();
        zatca.erad.portal.taxpayer.angular.accountPage.selectAccountType(data);
        zatca.erad.portal.taxpayer.angular.accountPage.selectOtherAccountCategory(data);
    }
}