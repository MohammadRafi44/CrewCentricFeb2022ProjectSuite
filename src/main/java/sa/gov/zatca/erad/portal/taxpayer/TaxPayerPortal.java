package sa.gov.zatca.erad.portal.taxpayer;

import sa.gov.zatca.erad.portal.taxpayer.angular.web.TaxPayerAngularPortal;
import sa.gov.zatca.erad.portal.taxpayer.ui5.web.TaxPayerUI5Portal;

public class TaxPayerPortal {

    public final TaxPayerAngularPortal angular;
    public final TaxPayerUI5Portal ui5;

    public TaxPayerPortal() {
        angular = new TaxPayerAngularPortal();
        ui5 = new TaxPayerUI5Portal();
    }
}
