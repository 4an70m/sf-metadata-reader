package sandbox.oleksii.project.metadata.emails;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.emails.components.SharedTo;

/**
 * Created by User on 22.08.2018.
 */
@Root(name = "EmailFolder")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class EmailFolderXmlMetaPojo extends XmlPojoEntity {

    @Element
    private String accessType;

    @Element
    private String name;

    @Element
    private String publicFolderAccess;

    @Element(required = false)
    private SharedTo sharedTo;
}