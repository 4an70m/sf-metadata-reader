package sandbox.oleksii.project.metadata.permissionSets;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.XmlPojoEntity;
import sandbox.oleksii.project.metadata.permissionSets.componetns.FieldPermissions;
import sandbox.oleksii.project.metadata.permissionSets.componetns.RecordTypeVisibilities;

import java.util.List;

/**
 * Created by 4an70m on 28.06.2018.
 */
@Root(name="PermissionSet")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class PermissionSetsPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "fieldPermissions")
    private List<FieldPermissions> fieldPermissions;

    @Element
    private Boolean hasActivationRequired;

    @Element
    private String label;

    @Element
    private String license;

    @Element
    private RecordTypeVisibilities recordTypeVisibilities;
}
