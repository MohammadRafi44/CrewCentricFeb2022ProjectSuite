package sa.gov.zatca;

import sa.gov.zatca.collection.ZatcaCollectionsPortal;
import sa.gov.zatca.erad.ZatcaERADPortal;
import sa.gov.zatca.rett.ZatcaRETTPortal;
import sa.gov.zatca.zatca.ZatcaMobileApp;

public class ZatcaModule {

    public final ZatcaERADPortal erad;
    public final ZatcaRETTPortal rett;
    public final ZatcaCollectionsPortal collections;
    public final ZatcaMobileApp mobile;

    public ZatcaModule() {
        erad = new ZatcaERADPortal();
        rett = new ZatcaRETTPortal();
        collections = new ZatcaCollectionsPortal();
        mobile = new ZatcaMobileApp();
    }
}
