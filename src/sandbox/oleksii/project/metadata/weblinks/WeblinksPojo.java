package sandbox.oleksii.project.metadata.weblinks;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="CustomPageWebLink")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class WeblinksPojo extends XmlPojoEntity {

    @Element
    private String availability;

    @Element
    private String displayType;

    @Element
    private String encodingKey;

    @Element(required = false)
    private Boolean hasMenubar;

    @Element(required = false)
    private Boolean hasScrollbars;

    @Element(required = false)
    private Boolean hasToolbar;

    @Element
    private Integer height;

    @Element(required = false)
    private Boolean isResizable;

    @Element
    private String linkType;

    @Element
    private String masterLabel;

    @Element
    private String openType;

    @Element(required = false)
    private String position;

    @Element(name = "protected")
    private Boolean isProtected;

    @Element(required = false)
    private Boolean showsLocation;

    @Element(required = false)
    private Boolean showsStatus;

    @Element
    private String url;

}
