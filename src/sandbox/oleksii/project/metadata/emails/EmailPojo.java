package sandbox.oleksii.project.metadata.emails;

import org.simpleframework.xml.*;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.emails.components.Attachment;
import sandbox.oleksii.project.metadata.emails.components.SharedTo;

import java.util.List;

/**
 * Created by User on 22.08.2018.
 */
@Root(name = "EmailTemplate")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class EmailPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "attachedDocuments", required = false)
    private List<String> attachedDocuments;

    @ElementList(inline = true, entry = "attachments", required = false)
    private List<Attachment> attachments;

    @Element(name = "available")
    private Boolean isAvailable;

    @Element(required = false)
    private String description;

    @Element
    private String encodingKey;

    @Element(required = false)
    private String letterhead;

    @Element
    private String name;

    @Element(required = false)
    private String publicFolderAccess;

    @Element
    private String style;

    @Element(required = false)
    private String subject;

    @Element(required = false)
    private String textOnly;

    @Element
    private String type;

    @Element
    private String uiType;
}
