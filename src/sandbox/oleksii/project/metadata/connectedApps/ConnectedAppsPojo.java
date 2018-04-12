package sandbox.oleksii.project.metadata.connectedApps;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.connectedApps.components.OauthConfig;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ConnectedApp")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class ConnectedAppsPojo extends XmlPojoEntity {

    @Element
    private String contactEmail;

    @Element
    private String contactPhone;

    @Element
    private String label;

    @Element
    private OauthConfig oauthConfig;

    @Element
    private String startUrl;
}
