package sandbox.oleksii.project.metadata.tabs;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CustomTab")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class TabsPojo extends XmlPojoEntity {

    @Element(required = false)
    private String label;

    @Element(required = false)
    private String icon;

    @Element(required = false)
    private Boolean customObject;

    @Element(required = false)
    private String description;

    @Element
    private Boolean mobileReady;

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

    @Override
    public String toString() {
        return "TabsPojo{" +
                "label='" + label + '\'' +
                ", icon='" + icon + '\'' +
                ", customObject=" + customObject +
                ", description='" + description + '\'' +
                ", mobileReady=" + mobileReady +
                ", page='" + page + '\'' +
                ", motif='" + motif + '\'' +
                ", frameHeight='" + frameHeight + '\'' +
                ", hasSidebar=" + hasSidebar +
                ", url='" + url + '\'' +
                ", urlEncodingKey='" + urlEncodingKey + '\'' +
                ", scontrol='" + scontrol + '\'' +
                '}';
    }
}
