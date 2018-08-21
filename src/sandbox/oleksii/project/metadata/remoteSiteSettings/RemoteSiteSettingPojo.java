package sandbox.oleksii.project.metadata.remoteSiteSettings;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by User on 21.08.2018.
 */
@Root(name="RemoteSiteSetting")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class RemoteSiteSettingPojo extends XmlPojoEntity {

    @Element
    private Boolean disableProtocolSecurity;

    @Element
    private Boolean isActive;

    @Element
    private String url;

    @Element(required = false)
    private String description;
}
