package sandbox.oleksii.project.metadata.roles;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

/**
 * Created by 4an70m on 19.08.2018.
 */
@Root(name="Role")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class RoleMetadataPojo extends XmlPojoEntity {

    @Element
    private String caseAccessLevel;

    @Element
    private String contactAccessLevel;

    @Element(required = false)
    private String description;

    @Element
    private Boolean mayForecastManagerShare;

    @Element
    private String name;

    @Element
    private String opportunityAccessLevel;

    @Element(required = false)
    private String parentRole;
}
