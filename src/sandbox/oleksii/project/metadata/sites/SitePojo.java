package sandbox.oleksii.project.metadata.sites;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CustomSite")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class SitePojo extends XmlPojoEntity {

    @Element(name = "acitve")
    private Boolean isActive;

    @Element
    private Boolean allowHomePage;

    @Element
    private Boolean allowStandardAnswersPages;

    @Element
    private Boolean allowStandardIdeasPages;

    @Element
    private Boolean allowStandardLookups;

    @Element
    private Boolean allowStandardPortalPages;

    @Element
    private Boolean allowStandardSearch;

    @Element
    private String authorizationRequiredPage;

    @Element
    private String bandwidthExceededPage;

    @Element
    private Boolean browserXssProtection;

    @Element
    private String clickjackProtectionLevel;

    @Element
    private Boolean contentSniffingProtection;

    @Element
    private Boolean cspUpgradeInsecureRequests;

    @Element(required = false)
    private String description;

    @Element
    private String fileNotFoundPage;

    @Element
    private String genericErrorPage;

    @Element
    private String inMaintenancePage;

    @Element
    private String inactiveIndexPage;

    @Element
    private String indexPage;

    @Element
    private String masterLabel;

    @Element
    private Boolean referrerPolicyOriginWhenCrossOrigin;

    @Element
    private Boolean requireHttps;

    @Element
    private Boolean requireInsecurePortalAccess;

    @Element
    private String siteAdmin;

    @Element
    private String siteTemplate;

    @Element
    private String siteType;

    @Element
    private String subdomain;

    @Element(required = false)
    private String urlPathPrefix;

}
