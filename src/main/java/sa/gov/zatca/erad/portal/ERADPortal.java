package sa.gov.zatca.erad.portal;

import sa.gov.zatca.erad.portal.officer.web.OfficerPortal;
import sa.gov.zatca.erad.portal.taxpayer.TaxPayerPortal;

public class ERADPortal {

    public final TaxPayerPortal taxpayer;
    public final OfficerPortal officer;

    public ERADPortal() {
        taxpayer = new TaxPayerPortal();
        officer = new OfficerPortal();
    }
}
