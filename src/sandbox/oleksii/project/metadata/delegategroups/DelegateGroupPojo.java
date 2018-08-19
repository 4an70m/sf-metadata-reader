package sandbox.oleksii.project.metadata.delegategroups;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="DelegateGroup")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class DelegateGroupPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "groups", required = false)
    private List<String> groups;

    @Element
    private String label;

    @Element
    private String loginAccess;

    @ElementList(inline = true, entry = "profiles", required = false)
    private List<String> profiles;

    @ElementList(inline = true, entry = "roles", required = false)
    private List<String> roles;
}
