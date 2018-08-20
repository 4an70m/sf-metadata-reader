package sandbox.oleksii.project.metadata.tabs;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CustomTab")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class TabPojo extends XmlPojoEntity {

    @Element(required = false)
    private String label;

    @Element(required = false)
    private String icon;

    @Element(required = false, name = "customObject")
    private Boolean isCustomObject;

    @Element(required = false)
    private String description;

    @Element(name = "mobileReady")
    private Boolean isMobileReady;

    @Element(required = false)
    private String page;

    @Element
    private String motif;

    @Element(required = false)
    private String frameHeight;

    @Element(required = false)
    private Boolean hasSidebar;

    @Element(required = false)
    private String url;

    @Element(required = false)
    private String urlEncodingKey;

    @Element(required = false)
    private String scontrol;
}