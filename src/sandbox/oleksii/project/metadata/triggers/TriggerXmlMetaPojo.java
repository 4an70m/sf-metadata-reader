package sandbox.oleksii.project.metadata.triggers;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import sandbox.oleksii.project.core.files.XmlPojoEntity;
import sandbox.oleksii.project.metadata.classes.components.PackageVersions;

/**
 * Created by User on 05.01.2018.
 */
@Root(name="ApexTrigger")
@Namespace(reference = "http://soap.sforce.com/2006/04/metadata")
public class TriggerXmlMetaPojo extends XmlPojoEntity {

    @Element
    private String apiVersion;

    @Element
    private String status;

    @Element(required = false)
    private PackageVersions packageVersions;
}