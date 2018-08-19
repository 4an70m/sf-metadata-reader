package sandbox.oleksii.project.metadata.permissionSets;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.permissionSets.componetns.*;

import java.util.List;

/**
 * Created by 4an70m on 28.06.2018.
 */
@Root(name="PermissionSet")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class PermissionSetPojo extends XmlPojoEntity {

    @ElementList(inline = true, entry = "applicationVisibilities", required = false)
    private List<ApplicationVisibility> applicationVisibilities;

    @ElementList(inline = true, entry = "classAccesses", required = false)
    private List<ClassAccess> classAccesses;

    @ElementList(inline = true, entry = "fieldPermissions")
    private List<FieldPermissions> fieldPermissions;

    @Element
    private Boolean hasActivationRequired;

    @Element
    private String label;

    @Element(required = false)
    private String description;

    @Element(required = false)
    private String license;

    @ElementList(inline = true, required = false, entry = "userPermissions")
    private List<UserPermission> userPermissions;

    @ElementList(inline = true, required = false, entry = "recordTypeVisibilities")
    private List<RecordTypeVisibility> recordTypeVisibilities;

    @ElementList(inline = true, required = false, entry = "tabSettings")
    private List<TabSettings> tabSettings;

    @ElementList(inline = true, required = false, entry = "pageAccesses")
    private List<PageAccess> pageAccesses;

    @ElementList(inline = true, required = false, entry = "objectPermissions")
    private List<ObjectPermissions> objectPermissions;
}
