package sandbox.oleksii.project.metadata.portals;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by User on 21.08.2018.
 */
@Root(name="Portal")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class PortalMetadataPojo extends XmlPojoEntity {

    @Element(name = "active")
    private Boolean isActive;

    @Element(required = false)
    private String admin;

    @Element(required = false)
    private String description;

    @Element
    private String emailSenderAddress;

    @Element
    private String emailSenderName;

    @Element
    private Boolean enableSelfCloseCase;

    @Element
    private String forgotPassTemplate;

    @Element
    private Boolean isSelfRegistrationActivated;

    @Element(required = false)
    private String logoDocument;

    @Element
    private String newPassTemplate;

    @Element
    private String newUserTemplate;

    @Element
    private Boolean showActionConfirmation;

    @Element
    private String type;
}
