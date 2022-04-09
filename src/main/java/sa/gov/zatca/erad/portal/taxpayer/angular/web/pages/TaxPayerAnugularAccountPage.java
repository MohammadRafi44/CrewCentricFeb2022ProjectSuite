package sa.gov.zatca.erad.portal.taxpayer.angular.web.pages;

import com.example.base.Actions;

import java.util.Map;

import static sa.gov.zatca.erad.portal.taxpayer.angular.web.objects.TaxPayerAngularAccountPageObjects.Link_Back;
import static sa.gov.zatca.erad.portal.taxpayer.angular.web.objects.TaxPayerAngularAccountPageObjects.getCardAccountType;

public class TaxPayerAnugularAccountPage {

    public void back() {
        Actions.waitForElementAtIntervals(Link_Back, 1, 1);
        Actions.click(Link_Back);
    }

    public void selectAccountType(Map<String, String> data) {
        Actions.waitForElementAtIntervals(getCardAccountType(data.get("AccountType")), 1, 1);
        Actions.click(getCardAccountType(data.get("AccountType")));
    }

    public void selectOtherAccountCategory(Map<String, String> data) {
        Actions.waitForElementAtIntervals(getCardAccountType(data.get("AccountType")), 1, 1);
        Actions.click(getCardAccountType(data.get("AccountType")));
    }
}
