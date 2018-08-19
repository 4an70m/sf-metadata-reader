package sandbox.oleksii.project.metadata.leadConvertSettings;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.leadConvertSettings.components.ObjectMapping;

import java.util.List;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="LeadConvertSettings")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class LeadConvertSettingsPojo extends XmlPojoEntity {

    @Element
    private Boolean allowOwnerChange;

    @ElementList(inline = true, entry = "objectMapping")
    private List<ObjectMapping> objectMappings;

    @Element
    private String opportunityCreationOptions;

}
