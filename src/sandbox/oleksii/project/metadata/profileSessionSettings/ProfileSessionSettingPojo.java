package sandbox.oleksii.project.metadata.profileSessionSettings;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ProfileSessionSetting")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ProfileSessionSettingPojo extends XmlPojoEntity {

    @Element
    private Boolean forceLogout;

    @Element(required = false)
    private String profile;

    @Element
    private Integer sessionTimeout;

    @Element
    private Boolean sessionTimeoutWarning;
}